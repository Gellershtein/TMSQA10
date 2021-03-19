package lesson9.homework;

import java.util.Arrays;
import java.util.Locale;

/*
6.	Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP».
Например, строка
"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
должна быть преобразована в
"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."

 */
public class Task6 {
    public static void main(String[] args) {
        String row = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        System.out.println(row);
//        String lower = row.toLowerCase();
//        System.out.println(lower);
        System.out.println(replaceToOOP(row));
    }

    public static String replaceToOOP(String row) {
        String[] newRow = row.split("object-oriented programming");
        int count = 0;
        for (int i = 0; i < newRow.length; i++) {
            if (newRow[i].equalsIgnoreCase("object-oriented programming")) {
                count++;
                if (count % 2 == 0) {
                    newRow[i] = "OOP";
                }
            }
        }
        return Arrays.toString(newRow);
    }
}
