package lesson3;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[4];
//        a= new int[]{1, 2, 3, 4};
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(11);
        }

        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i>0 && a[i] <= a[i-1]) {
                System.out.println("Массив нестрого возрастающий");
                break;
            }

            if (i == a.length-1) System.out.println("Массив строго возрастающий");

        }
    }
}
