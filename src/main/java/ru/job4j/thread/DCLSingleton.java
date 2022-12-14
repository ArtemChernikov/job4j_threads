package ru.job4j.thread;

/**
 * Double-Checked Locking with Singleton
 *
 * @author Artem Chernikov
 * @version 1.0
 * @since 16.11.2022
 */
public class DCLSingleton {
    private volatile static DCLSingleton inst;

    public static DCLSingleton instOf() {
        if (inst == null) {
            synchronized (DCLSingleton.class) {
                if (inst == null) {
                    inst = new DCLSingleton();
                }
            }
        }
        return inst;
    }

    private DCLSingleton() {
    }
}
