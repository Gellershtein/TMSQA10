package lesson7.transportarchitecture.ground;

public class Passenger extends Ground {
    private String carType; //Тип кузова
    private int numberOfPassengers; //Кол-во пассажиров

    public Passenger(int power, int max_speed, int weight, String name, int numberOfWheels, double fuelUsage, String carType, int numberOfPassengers) {
        super(power, max_speed, weight, name, numberOfWheels, fuelUsage);
        this.carType = carType;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("Тип кузова: %s\nКол-во пассажиров: %d\n", this.carType, this.numberOfPassengers);
    }

    @Override
    public void capacityCheck(int numbers) {
        if (numbers <= getNumberOfPassengers()) {
            System.out.println("Автомобиль загружен");
        } else {
            System.out.println("Вам нужен автомобиль побольше");
        }
    }

    /*Для легкового разработать метод который будет принимать время и считать
    сколько километров проедет машина двигаясь с максимальной скоростью и
    сколько топлива она израсходует за это время, результат вывести в консоль,
    расчёт израсходуемого топлива вынести в отдельный метод private.*/
    public void distance(double time)//принирмает время в часах
    {
        double distance = getMax_speed() * time;
        System.out.printf("За время %.1f ч, автомобиль %s двигаясь с максимальной скоростью %d км/ч проедет %.1f км и израсходует %.1f литров топлива.\n", time, getName(), getMax_speed(), distance, spendLiters(distance));
    }

    private double spendLiters(double distance) {
        return distance / getFuelUsage();
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
