package lesson8.homework.cosmodrom;

import lesson8.homework.cosmodrom.shuttles.IStart;

public class Cosmodrom {

    void start(IStart iStart) {
        if (!iStart.beforeStartCheck()) {
            System.out.println("«Предстартовая проверка провалена»");
        } else {
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i + " .....");
            }
            iStart.launch();
        }
    }
}
