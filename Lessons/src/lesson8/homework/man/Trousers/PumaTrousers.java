package lesson8.homework.man.Trousers;

public class PumaTrousers implements Trousers {

    @Override
    public void putOn() {
        System.out.println("Надеты штаны Puma");
    }

    @Override
    public void putOff() {
        System.out.println("Сняты штаны Puma");
    }
}
