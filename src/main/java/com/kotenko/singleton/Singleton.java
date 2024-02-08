package com.kotenko.singleton;
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public synchronized static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }
}