public class EvenOddThread {
    public static void main(String[] args) {
        Object LOCK = new Object();

        Thread thread1 = new Thread(new NumberPrinter(LOCK));
        thread1.setName("Even");
        thread1.start();

        Thread thread2 = new Thread(new NumberPrinter(LOCK));
        thread2.setName("Odd");
        thread2.start();
    }

    static class NumberPrinter implements Runnable {
        private Object LOCK;
        private static int counter = 0;

        public NumberPrinter(Object LOCK) {
            this.LOCK = LOCK;
        }

        @Override
        public void run() {
            while (counter <= 10) {

                if (counter % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
                    synchronized (LOCK) {
                        System.out.println(Thread.currentThread().getName() + counter);
                        counter++;
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } else if (counter % 2 != 0 && Thread.currentThread().getName().equals("Odd")) {
                    synchronized (LOCK) {
                        System.out.println(Thread.currentThread().getName() + counter);
                        counter++;
                        LOCK.notify();
                    }
                }
            }
        }
    }
}


