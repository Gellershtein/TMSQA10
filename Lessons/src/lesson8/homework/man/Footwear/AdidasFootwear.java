package lesson8.homework.man.Footwear;

public class AdidasFootwear implements Footwear {

    @Override
    public void putOn() {
        System.out.println("Надеты кросовки Adidas");
    }

    @Override
    public void putOff() {
        System.out.println("Сняты кросовки Adidas");
    }
}
