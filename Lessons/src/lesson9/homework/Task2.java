package lesson9.homework;

/*
2.	Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в
позиции 0
 */
public class Task2 {
    public static void main(String[] args) {
        String s1 = "1aC2CCA";
        System.out.println(replaceThird(s1));

    }

//    public static char[] replaceThird (String row) {
//        char[] rowToChar = row.toCharArray();
//        char temp = rowToChar[2];
//        rowToChar[2]=rowToChar[0];
//        rowToChar[0]=temp;
//        return rowToChar;
//    }

    public static String replaceThird(String row) {
        String newRow = "";
        char s0 = row.charAt(0);
        char s3 = row.charAt(2);
        for (int i = 0; i < row.length(); i++) {
            newRow = row.replace(s3, s0);
        }
        return newRow;
    }

}
