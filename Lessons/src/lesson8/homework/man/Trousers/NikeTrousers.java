package lesson8.homework.man.Trousers;

public class NikeTrousers implements Trousers {

    @Override
    public void putOn() {
        System.out.println("Надеты штаны Nike");
    }

    @Override
    public void putOff() {
        System.out.println("Сняты штаны Nike");
    }
}
