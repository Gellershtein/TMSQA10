package lesson7.transportarchitecture.ground;

import lesson7.transportarchitecture.Transport;

public abstract class Ground extends Transport {
    private int numberOfWheels; // Колличество колес
    private double fuelUsage; //Расход топлива(л/100км)

    public Ground(int power, int maxSpeed, int weight, String name, int numberOfWheels, double fuelUsage) {
        super(power, maxSpeed, weight, name);
        this.numberOfWheels = numberOfWheels;
        this.fuelUsage = fuelUsage;
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("Колличество колес: %d \nРасход топлива(л/100км): %.2f\n", this.numberOfWheels, this.fuelUsage);
    }

    public double getFuelUsage() {
        return fuelUsage;
    }
}
