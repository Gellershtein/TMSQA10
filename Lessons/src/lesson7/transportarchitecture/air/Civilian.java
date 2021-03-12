package lesson7.transportarchitecture.air;

public class Civilian extends Air {
    private int numberOfPassengers; //Кол-во пассажиров
    private boolean hasBusinessClass; //Есть ли бизнес класс

    public Civilian(int power, int max_speed, int weight, String name, double wingspan, double min_flylegth, int numberOfPassengers, boolean hasBusinessClass) {
        super(power, max_speed, weight, name, wingspan, min_flylegth);
        this.numberOfPassengers = numberOfPassengers;
        this.hasBusinessClass = hasBusinessClass;
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("Кол-во пассажиров: %d\nЕсть ли бизнес класс: %b\n", this.numberOfPassengers, this.hasBusinessClass);
    }

    @Override
    public void capacityCheck(int numbers) {
        if (numbers <= getNumberOfPassengers()) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
