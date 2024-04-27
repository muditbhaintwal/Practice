package singleton;

public class ThreadSafeLazySingleton {

    private static volatile ThreadSafeLazySingleton threadSafeLazySingleton;


    // private constructor to block outside access
    private ThreadSafeLazySingleton() {

    }

    public static ThreadSafeLazySingleton getInstance() {
        if (threadSafeLazySingleton == null) {
            synchronized (ThreadSafeLazySingleton.class) {
                if (threadSafeLazySingleton == null) {
                    threadSafeLazySingleton = new ThreadSafeLazySingleton();
                }
            }

        }
        return threadSafeLazySingleton;
    }
}
