package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int n = checkScanner(scanner.nextInt());
//        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        int sum1 = 0, sum2 = 0;
//        array = new int[]{1, 2, 3, 4,5,6};
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }
        Task8.printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                sum1 += array[i];
            } else {
                sum2 += array[i];
            }
        }
        if (sum1 > sum2) {
            System.out.println("Сумма первой половины больше второй. SUM1= " + sum1 + "; SUM2=  " + sum2);
        } else if (sum1 < sum2) {
            System.out.println("Сумма второй половины больше первой. SUM1= " + sum1 + "; SUM2=  " + sum2);
        } else {
            System.out.println("Обе половины равны. SUM= " + sum1);
        }

    }

    public static int checkScanner(int sc) {
        Scanner n = new Scanner(System.in);
        while (true) {
            if (sc <= 0) {
                System.out.println("Введите число больше нуля");
                sc = n.nextInt();
            } else if (sc % 2 != 0) {
                System.out.println("Введите четное число больше нуля");
                sc = n.nextInt();
            } else break;
        }
        return sc;
    }
}
