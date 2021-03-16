package lesson8.homework.man.Footwear;

public class NikeFootwear implements Footwear {

    @Override
    public void putOn() {
        System.out.println("Надеты кросовки Nike");
    }

    @Override
    public void putOff() {
        System.out.println("Сняты кросовки Nike");
    }
}
