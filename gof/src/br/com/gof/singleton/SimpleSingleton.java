package br.com.gof.singleton;

public class SimpleSingleton {
    private static final SimpleSingleton instance = new SimpleSingleton();

    public SimpleSingleton() {
    }

    public static SimpleSingleton getInstance(){
        return instance;
    }
}
