package singleton;

public class MainTest {

    public static void main(String[] args) {
        // ---
        EagerSingleton eagerSingleton1 = EagerSingleton.getEagerSingleton();
        EagerSingleton eagerSingleton2 = EagerSingleton.getEagerSingleton();

        System.out.println(eagerSingleton1.hashCode());
        System.out.println(eagerSingleton2.hashCode());

        // ---
        ThreadSafeLazySingleton t1 = ThreadSafeLazySingleton.getInstance();
        ThreadSafeLazySingleton t2 = ThreadSafeLazySingleton.getInstance();

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
