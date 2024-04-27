package singleton;

/**
 * Eager singleton class, Thread safe but it might be possible that object created is never used.
 */

public class EagerSingleton {

    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
