package lesson7.transportarchitecture.air;

import lesson7.transportarchitecture.Transport;

public abstract class Air extends Transport {
    private double wingspan;//Размах крыльев (м)
    private double min_flylegth;//Минимальная длина взлётно-посадочной полосы для взлёта

    public Air(int power, int maxSpeed, int weight, String name, double wingspan, double min_flylegth) {
        super(power, maxSpeed, weight, name);
        this.wingspan = wingspan;
        this.min_flylegth = min_flylegth;
    }

    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("Размах крыльев(м): %.2f\nМинимальная длина взлётно-посадочной полосы для взлёта: %.2f\n", this.wingspan, this.min_flylegth);
    }
}
