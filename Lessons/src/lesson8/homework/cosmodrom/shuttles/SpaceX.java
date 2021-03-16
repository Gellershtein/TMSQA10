package lesson8.homework.cosmodrom.shuttles;

import java.util.Random;

public class SpaceX implements IStart {

    public SpaceX() {
    }

    @Override
    public boolean beforeStartCheck() {
        Random random = new Random();
        int check = random.nextInt(101);
        int check2 = random.nextInt(101);
        int finalCheck = Math.abs(check - check2);
        return finalCheck > 50 && finalCheck < 60;
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
