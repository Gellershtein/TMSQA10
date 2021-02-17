package Lesson2;

//17.71561
public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        double distance = 0, sum = 0;
        while (i <= 7) {
            if (i == 1) {
                distance = 10;
            } else {
                distance *= 1.1;
            }
            System.out.println(distance);
            sum += distance;
            System.out.println(distance + " " + sum);
            i++;
        }
        System.out.println(distance + " " + sum);
    }
}
/*
10,10+11,22+*/
