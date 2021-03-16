package lesson8.homework.man.Trousers;

public class AdidasTrousers implements Trousers {

    @Override
    public void putOn() {
        System.out.println("Надеты штаны Adidas");
    }

    @Override
    public void putOff() {
        System.out.println("Сняты штаны Adidas");
    }
}
