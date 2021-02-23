package lesson3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] sl = new int[15];
        Random r = new Random();
        int count=0;

        for (int i = 0; i < sl.length; i++) {
            sl[i]= r.nextInt(100);
        }
        for (int i = 0; i < sl.length; i++) {
            System.out.print(sl[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < sl.length; i++) {
         if (sl[i]%2==0){count++;}
        }
        System.out.println("Колличество четных чисел в массиве = " + count);
    }
}
