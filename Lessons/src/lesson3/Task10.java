package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива Больше 3");

        int n = checkScanner(scanner.nextInt());
        int[] array = new int[n];
        Random random = new Random();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n + 1);
            if (array[i] % 2 == 0 && array[i] != 0) {
                counter++;
            }
        }
        Task8.printArray(array);
        if (counter == 0) {
            System.out.println(" В первом массиве нет четных чисел");
        } else {
            int[] array2 = new int[counter]; // объявление тут ,что бы не выделялось мсто сразу, вдруг массив не существует
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] % 2 == 0 && array[i] != 0) {
                    array2[j] = array[i];
                    j++;
                }
            }
            Task8.printArray(array2);
        }
    }

    public static int checkScanner(int sc) {
        Scanner n = new Scanner(System.in);
        while (true) {
            if (sc <= 3) {
                System.out.println("Вы ввели неверное число.\nВведите число больше трех");
                sc = n.nextInt();
            } else break;
        }
        return sc;
    }
}



