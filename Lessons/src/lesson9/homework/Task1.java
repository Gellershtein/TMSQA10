package lesson9.homework;
/*
1.	Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
последнего вхождения символа(B).
 */
public class Task1 {
    public static void main(String[] args) {
        String s1 = "AaaaBCCA";
        System.out.println(cutSubRow(s1,"A","B"));

    }

    public static String cutSubRow(String row,String firstSymbol, String secondSymbol) {
        int firstSubSymbol = row.indexOf(firstSymbol);
        int secondSubSymbol = row.lastIndexOf(secondSymbol);
        return row.replace(row.substring(firstSubSymbol,secondSubSymbol),"");
    }
}
