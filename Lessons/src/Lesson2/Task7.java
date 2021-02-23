package Lesson2;
//Весь ромб
public class Task7 {
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            for (int j1 = 0; j1 < 4; j1++) {
                if (j1 >= 3 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            for (int j2 = 0; j2 <= i; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < 4; i++) {
            for (int j1 = 4; j1 > 0; j1--) {
                if (j1 <= 4 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
