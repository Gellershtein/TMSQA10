package lesson8.homework.cosmodrom.shuttles;

import java.util.Random;

public class Shuttle1 implements IStart {

    public Shuttle1() {
    }

    @Override
    public boolean beforeStartCheck() {
        Random random = new Random();
        int check = random.nextInt(11);
        return check > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены.\nВсе системы в норме.");
    }

    @Override
    public void launch() {
        System.out.println("Старт Шатла");
    }
}
