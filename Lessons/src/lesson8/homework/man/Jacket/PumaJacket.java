package lesson8.homework.man.Jacket;

import lesson8.homework.man.Footwear.Footwear;

public class PumaJacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Надета куртка Puma");
    }

    @Override
    public void putOff() {
        System.out.println("Снята куртка Puma");
    }
}
