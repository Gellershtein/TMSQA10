package lesson9.homework;

import java.util.ArrayList;
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
        String row = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming blabla. Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming blabla.";
        String change = "object-oriented programming";
        String changeTo="OOP";
        System.out.println(row);
        String lower = row.toLowerCase();
//        System.out.println(lower);
//        System.out.println(replaceToOOP(lower));
        ind(row, change,changeTo);
    }

    //    public static String replaceToOOP(String row) {
//        StringBuilder newRow = new StringBuilder(row);
////        String[] newRow = row.split("object-oriented programming");
//        int count = 0;
//        for (int i = 0; i < newRow.length; i++) {
//            if (newRow[i].equalsIgnoreCase("object-oriented programming")) {
//                count++;
//                if (count % 2 == 0) {
//                    newRow[i] = "OOP";
//                }
//            }
//        }
//        return Arrays.toString(newRow);
//    }
    public static void ind(String row, String change, String changeTo) {
        String newRow = row;
        ArrayList<String> split = new ArrayList<>();
        int count = 0;
        int fIndex = newRow.toLowerCase().indexOf(change);//"object-oriented programming"
        int lenght = change.length();
        if (fIndex == -1) {
            System.out.println("В строке нет совпадеий с " + change);
        } else {
            count++;
            while (fIndex != -1) {
                fIndex = newRow.toLowerCase().indexOf(change, fIndex + 1);//"object-oriented programming"
                if (fIndex != -1) {
                    count++;
                    if (count%2==0){
                        split.add(newRow.substring(0,fIndex));
                        newRow = newRow.substring(fIndex);
                        split.add(changeTo);
                        fIndex = newRow.toLowerCase().indexOf(change);
                        newRow = newRow.substring(fIndex+lenght);
                    }
//                split.add(newRow.substring(lIndex,fIndex));
//                newRow = newRow.substring(fIndex);
                } else {
                    break;
                }
            }
            split.add(newRow);
        }
        for (int i = 0; i < split.toArray().length; i++) {
        System.out.print(split.get(i));
        }
    }
}

//    public static void ind (String row,String change) {
//        StringBuilder newRow = new StringBuilder(row);
//        String input = row.toLowerCase();
//        String search= input;
//
//        int fIndex = input.indexOf("object-oriented programming");
//        int lIndex = fIndex + change.length();
//        int count = 0;
//        while (fIndex != -1) {
//            count++;
//            fIndex = search.indexOf("object-oriented programming");
//            if (count % 2 == 0) {
////                String search2= search;
////                while (lIndex!=-1){
////                    search2 = search2.substring(0,lIndex - 1);
////                    lIndex = search2.lastIndexOf("object-oriented programming");
////                }
////                input.spl
//            search = input.substring(fIndex + 1);
//            }
////                newRow.replace(fIndex,lIndex,"OOP");
//        }
//        System.out.println("No of *is* in the input is : " + count);
//    }
//}
