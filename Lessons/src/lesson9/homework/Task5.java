package lesson9.homework;
/*
5.	Даны два предложения посчитать сколько слов совпадает.
 */

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        String s1 = "ada 1 123 3 45 4 67 56";
        String s2 = "ada 2 123 2 45 2 67 52";
        checkEquals(s1, s2);

    }

    public static void checkEquals(String s1, String s2) {

        if (s1.equals(s2)) {
            System.out.println("Строки идентичны");
        } else {

            String[] s1split= s1.split(" ");
            String[] s2split= s2.split(" ");
            boolean[] count = new boolean[s1split.length];
            for (int i = 0; i < s1split.length; i++) {
                if (s1split[i].equals(s2split[i])){
                    count[i]=true;
                }
            }
            int countTrue=0;
            for (boolean check : count) {
                if (check) {
                    countTrue++;
                }
            }
            System.out.println("Колличество слов которые совпадают: " + countTrue );
        }
    }
}
