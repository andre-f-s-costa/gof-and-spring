package br.com.gof.strategy;

public class Driver {
    private Vehicle vehicle;

    public Driver() {
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void run() {
        vehicle.move();
    }
}
