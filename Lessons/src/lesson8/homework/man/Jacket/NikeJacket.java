package lesson8.homework.man.Jacket;

public class NikeJacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Надета куртка Nike");
    }

    @Override
    public void putOff() {
        System.out.println("Снята куртка Nike");
    }
}
