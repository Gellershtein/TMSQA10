package lesson9;

public class Palindrom {
    public static void main(String[] args) {
        String s = "HTEOLFEOLEH";
        String s1 = "ABCCBA";
        palidCheck(s);
        palidCheck(s1);


    }

//    public static void palidCheck(String row) {
//        boolean check=true;
//        char[] s2 = row.toCharArray();
//        for (int i = 0; i < s2.length; i++) {
//            if (s2[i] != s2[s2.length - i - 1] ) {
//                System.out.println("Строка не палиндром");
//                check=false;
//                break;
//            }
//        }
//        System.out.println(check?"Строка палиндром":"");
//    }


    public static void palidCheck(String row) {
        boolean check = true;
        for (int i = 0; i < row.length(); i++) {
            if (row.charAt(i) != row.charAt(row.length() - i - 1)) {
                System.out.println("Строка не палиндром");
                check = false;
                break;
            }
        }
        System.out.println(check ? "Строка палиндром" : "");
    }
}
