package lesson8.homework.man;

import lesson8.homework.man.Footwear.Footwear;
import lesson8.homework.man.Jacket.Jacket;
import lesson8.homework.man.Trousers.Trousers;

public class Man implements IMan {
    private Footwear footwear;
    private Jacket jacket;
    private Trousers trousers;

    public Man(Footwear footwear, Jacket jacket, Trousers trousers) {
        this.footwear = footwear;
        this.jacket = jacket;
        this.trousers = trousers;
    }

    @Override
    public void dress() {
        footwear.putOn();
        jacket.putOn();
        trousers.putOn();
    }

    @Override
    public void undress() {
        footwear.putOff();
        jacket.putOff();
        trousers.putOff();
    }
}
