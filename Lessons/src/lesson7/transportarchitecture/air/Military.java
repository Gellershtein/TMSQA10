package lesson7.transportarchitecture.air;

public class Military extends Air {
    private boolean hasEjection; //Есть ли катапультирование
    private int numberOfRockets; // Кол-во ракет на борту
    private int count;

    public Military(int power, int max_speed, int weight, String name, double wingspan, double min_flylegth, boolean hasEjection, int numberOfRockets) {
        super(power, max_speed, weight, name, wingspan, min_flylegth);
        this.hasEjection = hasEjection;
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("Есть ли катапультирование: %b\nКол-во ракет на борту: %d\n", this.hasEjection, this.numberOfRockets);
    }

    @Override
    public void capacityCheck(int numbers) {
        if (numbers <= getNumberOfRockets()) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

    public void rocketFire() {
        if (getNumberOfRockets() == 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else {
            setNumberOfRockets(getNumberOfRockets() - 1);
            System.out.printf("Ракета пошла…\nОсталось %d рокет(а) в боекомплекте\n", getNumberOfRockets());
        }
    }

    public void ejection() {
        if (!isHasEjection()) {
            System.out.println("У вас нет системы катапультирования");
        } else {
            System.out.println("Катапультирование прошло успешно");
        }
    }

    public boolean isHasEjection() {
        return hasEjection;
    }

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setNumberOfRockets(int numberOfRockets) {
        this.numberOfRockets = numberOfRockets;
    }

    public int getCount() {
        return count;
    }

}
