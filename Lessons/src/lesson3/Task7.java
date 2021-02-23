package lesson3;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int max = 0, index = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Максимальное " + max + " с индексом " + index);
    }

}
