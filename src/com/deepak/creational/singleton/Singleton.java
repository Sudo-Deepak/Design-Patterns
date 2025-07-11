package com.deepak.creational.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (null == instance) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
