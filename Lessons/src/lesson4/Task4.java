package lesson4;

import java.util.Scanner;

//Посчитать сумму четных элементов стоящих над побочной диагональю (невключительно)
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк (n) и столбцов(m) ( через пробел, или каждое значение с новой строки)");
        int[][] a = Lesson4.createAndInitArray(scanner.nextInt(), scanner.nextInt());
        Lesson4.printArray(a);

        System.out.println("Четные элементы стоящие над побочной диагональю (невключительно): ");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < (a.length - 1) - i; j++) {
                if (a[i][j] % 2 == 0 && a[i][j] != 0) {
                    System.out.print(a[i][j] + " ");
                    sum += a[i][j];
                }
            }
        }
        System.out.println("\nИх сумма равна: " + sum);
    }

}
