package lesson3;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        double[] c = new double[10];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
            b[i] = random.nextInt(10);
            c[i] = (double) a[i] / b[i];
        }
        printArray(a);
        printArray(b);
        printArrayDouble(c);
        System.out.println("Колличсевто целых элементов " + checkArray(c));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i == array.length - 1) {
                System.out.println();
            }
        }
    }

    public static void printArrayDouble(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i == array.length - 1) {
                System.out.println();
            }
        }
    }

    public static int checkArray(double[] x) {
        int count = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 1 == 0) {
                count++;
            }
        }
        return count;
    }
}
