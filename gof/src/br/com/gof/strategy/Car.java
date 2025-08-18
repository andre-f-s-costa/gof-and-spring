package br.com.gof.strategy;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car moves...");
    }
}
