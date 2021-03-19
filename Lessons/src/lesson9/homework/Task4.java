package lesson9.homework;

import java.util.Scanner;

/*
4.	Посчитать сколько строка содержит слов и определить является ли хотя бы одно из слов палиндромом
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите слова одной строкой через пробел");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        checkWordCount(input);
    }

    public static void checkWordCount(String row) {
        int count = 0;
        int lastSpace = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        boolean atLeastOne = false;
        if (row.length() != 0) {
            for (int i = 0; i < row.length(); i++) {
                if (row.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                    lastSpace = i;
                    lastIndex = i;//можно упразднить до lastSpace, но хочу, что бы каждая переменная отвечала за свое
                    atLeastOne = palindromCheck(row, firstIndex, lastIndex);
                    firstIndex = lastSpace + 1;
                }
            }
            if (lastSpace != row.length() - 1) { //валидация слов у которых наконце нет пробела пр. "тест"
                count++;
                lastIndex = row.length() - 1;
                atLeastOne = palindromCheck(row, firstIndex, lastIndex);
            }
            System.out.println("Вы ввели " + count + " слов");
            System.out.println(atLeastOne ? "Как минимум одно из свол является полиндромом" : "Ниодно из введенных свол не является полиндромом");
        } else System.out.println("Вы ввели пустую строку");
    }

    public static boolean palindromCheck(String row, int start, int finish) {
        boolean check = false;
        if (start != finish) {
            for (int i = start; i < finish; i++) {
                if (row.charAt(i) == row.charAt(finish - i - 1)) {
//                System.out.println("Строка не палиндром");
                    check = true;
                } else break;
            }
        }
//        System.out.println(check?"Строка палиндром":"");
        return check;
    }
}
