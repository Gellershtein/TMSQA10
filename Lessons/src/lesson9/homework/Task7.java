package lesson9.homework;
/*
7.	Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака: "string" → "ri", "code" → "od", "Practice"→"ct".
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Введите строку(длина - четное число)");
        String row = inputString();
        returnMiddleSymbols(row);
    }

    public static String inputString() {
        String row;
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.length() % 2 == 0) {
                row = input;
                break;
            } else {
                System.out.println("Введите строку с четной длинной");
            }
        }
        return row;
    }

    public static void returnMiddleSymbols(String row) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(row.charAt(row.length() / 2 -1));
//        sb.append(row.charAt((row.length() / 2)));

//        String sb =""+ row.charAt(row.length() / 2 -1) + row.charAt((row.length() / 2));

//        System.out.println(sb);
        System.out.println(String.valueOf(row.charAt(row.length() / 2 - 1)) + row.charAt((row.length() / 2)));
    }
}
