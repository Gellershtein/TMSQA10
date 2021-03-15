package lesson8.by.teachmeskills.robot;

import lesson8.by.teachmeskills.robot.hands.SamsungHand;
import lesson8.by.teachmeskills.robot.hands.SonyHand;
import lesson8.by.teachmeskills.robot.hands.ToshibaHand;
import lesson8.by.teachmeskills.robot.heads.SamsungHead;
import lesson8.by.teachmeskills.robot.heads.SonyHead;
import lesson8.by.teachmeskills.robot.heads.ToshibaHead;
import lesson8.by.teachmeskills.robot.legs.SamsungLeg;
import lesson8.by.teachmeskills.robot.legs.SonyLeg;
import lesson8.by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SonyHead sonyHead = new SonyHead(15);
        SonyHand sonyHand = new SonyHand(10);
        SonyLeg sonyLeg = new SonyLeg(5);

        ToshibaHand toshibaHand = new ToshibaHand(3);
        ToshibaHead toshibaHead = new ToshibaHead(5);
        ToshibaLeg toshibaLeg = new ToshibaLeg(2);

        SamsungHand samsungHand = new SamsungHand(15);
        SamsungHead samsungHead = new SamsungHead(25);
        SamsungLeg samsungLeg = new SamsungLeg(10);

        Robot robot1 = new Robot(samsungHead,sonyHand,toshibaLeg);
        robot1.action();
        System.out.println();
        Robot robot2 = new Robot(sonyHead,sonyHand,samsungLeg);
        robot2.action();
        System.out.println();
        Robot robot3 = new Robot(toshibaHead,samsungHand,sonyLeg);
        robot3.action();

    }
}
