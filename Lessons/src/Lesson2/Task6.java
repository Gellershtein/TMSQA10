package Lesson2;

public class Task6 {
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            for (int j2 = 0; j2 <= i; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println('\n');
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
