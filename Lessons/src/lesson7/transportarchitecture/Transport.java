package lesson7.transportarchitecture;

public abstract class Transport {
    private int power; //Мощность(в лошадиных силах)
    private int maxSpeed; //Максимальная скорость (км/ч)
    private int weight; //Масса (кг)
    private String name; //Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. )

    public Transport(int power, int maxSpeed, int weight, String name) {
        this.power = power; //Мощность(в лошадиных силах)
        this.maxSpeed = maxSpeed; //Максимальная скорость(км/ч)
        this.weight = weight; //Мощность(в лошадиных силах)
        this.name = name; //Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. )
    }

    public void printinfo() {
        System.out.printf("Марка: %s\nМасса(кг): %d \nМаксимальная скорость (км/ч): %d \nМощность(в лошадиных силах): %d \nМощность(в кВ): %.2f\n", this.name, this.weight, this.maxSpeed, this.power, powerSwap());
    }

    public double powerSwap() {
        return this.power * 0.74;
    }

    public abstract void capacityCheck(int numbers);

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }
}
