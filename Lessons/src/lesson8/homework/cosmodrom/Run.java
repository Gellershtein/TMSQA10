package lesson8.homework.cosmodrom;

import lesson8.homework.cosmodrom.shuttles.Shuttle1;
import lesson8.homework.cosmodrom.shuttles.SpaceX;

public class Run {
    public static void main(String[] args) {
        Shuttle1 shuttle = new Shuttle1();
        Cosmodrom cosmodrom = new Cosmodrom();
//        cosmodrom.start(shuttle);

        SpaceX spaceX = new SpaceX();
        cosmodrom.start(spaceX);
    }
}
