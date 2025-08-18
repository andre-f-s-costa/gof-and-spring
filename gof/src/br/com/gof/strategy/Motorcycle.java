package br.com.gof.strategy;

public class Motorcycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Motorcycle moves...");
    }
}
