package lesson7.transportarchitecture;


import lesson7.transportarchitecture.air.Air;
import lesson7.transportarchitecture.air.Civilian;
import lesson7.transportarchitecture.air.Military;
import lesson7.transportarchitecture.ground.Cargo;
import lesson7.transportarchitecture.ground.Passenger;

public class TransportRunner {
    public static void main(String[] args) {
        Cargo cr = new Cargo(200, 90, 8, "MAZ", 6, 20, 50);
        cr.printinfo();
        cr.capacityCheck(50);

        Passenger ps = new Passenger(200, 100, 8, "BMW", 4, 10, "cabrio", 4);
        ps.printinfo();
        ps.distance(3);

        Civilian cv = new Civilian(1000, 900, 30, "Boing", 10, 100, 100, false);
        cv.printinfo();
        cv.capacityCheck(10);

        Military ml = new Military(1000, 900, 30, "Boing", 10, 100, true, 2);
        ml.printinfo();
        ml.ejection();
        ml.rocketFire();

    }
}
