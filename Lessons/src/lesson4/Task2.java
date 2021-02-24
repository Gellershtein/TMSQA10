package lesson4;

import java.util.Scanner;

//Проверить произведение элементов какой диагонали больше.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк (n) и столбцов(m) ( через пробел, или каждое значение с новой строки)");
        int[][] a = Lesson4.createAndInitArray(scanner.nextInt(), scanner.nextInt());
        Lesson4.printArray(a);
        int prdiag1=1,prdiag2=1;
        for (int i = 0; i < a.length; i++) {
            prdiag1*=a[i][i];
        }
        System.out.println("Произведение элементов главной диагонали равно " + prdiag1);

        for (int i = 0; i < a.length; i++) {
            prdiag2*=a[i][(a.length-1)-i];
        }
        System.out.println("Произведение элементов побочной диагонали равно " + prdiag2);

        System.out.println(check(prdiag1,prdiag2));
    }

    public static String check(int a, int b) {
        String result = "";
        if (a > b) result = "Произведение элементов главной диагонали больше побочной";
        else if (a < b) result = "Произведение элементов побочной диагонали больше главной";
        else result = "Произведение элементов диогаланей равно равны";
        return result;
    }

}
