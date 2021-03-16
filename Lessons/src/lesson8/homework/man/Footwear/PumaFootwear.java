package lesson8.homework.man.Footwear;

public class PumaFootwear implements Footwear {

    @Override
    public void putOn() {
        System.out.println("Надеты кросовки Puma");
    }

    @Override
    public void putOff() {
        System.out.println("Сняты кросовки Puma");
    }
}
