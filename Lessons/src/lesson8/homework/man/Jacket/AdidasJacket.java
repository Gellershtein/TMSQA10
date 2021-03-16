package lesson8.homework.man.Jacket;

public class AdidasJacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Надета куртка Adidas");
    }

    @Override
    public void putOff() {
        System.out.println("Снята куртка Adidas");
    }
}
