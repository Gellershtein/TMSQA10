package lesson3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        //заполняем оба массива
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(16);
            b[i] = r.nextInt(16);
        }
        //Печать массивов
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее арифм-ое массива А = " + average(a));
        System.out.println("Среднее арифм-ое массива А = " + average(b));
        System.out.println(check(average(a),average(b)));
    }

    public static int average (int[] x){
        int average=0;
        for (int i = 0; i <x.length ; i++) {
            average+=x[i];
        }

        return average/(x.length-1);
    }

    public static String check(int a,int b) {
        String result = "";
        if(a>b) result = "среднее арифметическое массива А больше Б";
        else if(a<b) result = "среднее арифметическое массива Б больше А";
        else result = "средние арифметические массивов равны";
        return result;
    }
}
