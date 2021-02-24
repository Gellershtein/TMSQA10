package lesson4;

import java.util.Scanner;

//Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк (n) и столбцов(m) ( через пробел, или каждое значение с новой строки)");
        int[][] a = Lesson4.createAndInitArray(scanner.nextInt(), scanner.nextInt());
        int[][] b = new int[a[0].length][a.length];
        Lesson4.printArray(a);
        System.out.println();


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        Lesson4.printArray(b);
    }
}
