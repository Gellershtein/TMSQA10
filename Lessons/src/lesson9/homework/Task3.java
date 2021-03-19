package lesson9.homework;

/*
3.	Перевернуть строку, изменив расположение символов в строке задом наперёд.
 */
public class Task3 {
    public static void main(String[] args) {
        String s1 = "1a2CCA";
        System.out.println(viceVersa(s1));
    }

    public static String viceVersa(String row) {
        String result = "";
        for (int i = row.length() - 1; i >= 0; i--) {
            result += row.charAt(i); //можно было сделать reverse используя StringBuffer
        }
        return result;
    }
//    public static String viceVersa (String row) {
//        char[] rowToChar = row.toCharArray();
//        String result="";
//        for (int i = rowToChar.length-1; i > 0; i--) {
//            result.concat(String.valueOf(rowToChar[i]));
//        }
//        return result;
//    }
}
