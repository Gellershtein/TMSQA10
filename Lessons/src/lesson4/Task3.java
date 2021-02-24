package lesson4;

import java.util.Scanner;

//Вывести нечетные элементы находящиеся под главной диагональю (включительно).
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк (n) и столбцов(m) ( через пробел, или каждое значение с новой строки)");
        int[][] a = Lesson4.createAndInitArray(scanner.nextInt(), scanner.nextInt());
        Lesson4.printArray(a);
        System.out.println("Нечетные элементы находящиеся под главной диагональю (включительно): ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[i][j] % 2 == 1) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }

    }
}
