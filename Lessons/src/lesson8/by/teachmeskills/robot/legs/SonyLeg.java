package lesson8.by.teachmeskills.robot.legs;

import lesson8.by.teachmeskills.robot.hands.IHand;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Нога Sony делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
