package lesson7.transportarchitecture.ground;

import lesson7.transportarchitecture.Transport;

public class Cargo extends Ground {

    private int overWeight; // Грузоподъёмность(т)

    public Cargo(int power, int maxSpeed, int weight, String name, int numberOfWheels, double fuelUsage, int overWeight) {
        super(power, maxSpeed, weight, name, numberOfWheels, fuelUsage);
        this.overWeight = overWeight; //Грузоподъёмность(т)
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("Грузоподъёмность(т): %d\n", this.overWeight);
    }

    @Override
    public void capacityCheck(int numbers) {
        if (numbers <= getOverWeight()) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

    public int getOverWeight() {
        return overWeight;
    }
}
