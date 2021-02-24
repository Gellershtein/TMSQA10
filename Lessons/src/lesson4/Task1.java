package lesson4;

import java.util.Scanner;

//Посчитать сумму четных элементов стоящих на главной диагонали.
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк (n) и столбцов(m) ( через пробел, или каждое значение с новой строки)");

        int[][] a = Lesson4.createAndInitArray(scanner.nextInt(), scanner.nextInt());//создание массива по введенным значениям
//        int[][] b= Lesson4.createAndInitArray(scanner.nextInt(),scanner.nextInt());
        Lesson4.printArray(a);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && i != 0)
                sum += a[i][i];
        }
        System.out.println("Сумма четных элементов стоящих на главной диагонали равна = " + sum);

    }
}
