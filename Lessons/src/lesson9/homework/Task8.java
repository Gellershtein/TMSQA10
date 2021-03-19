package lesson9.homework;

/*
8.	Слить две строки, вставив символы одной строки между символами другой строки
 */
public class Task8 {
    public static void main(String[] args) {
        String s1 = "11111";
        String s2 = "2222";
        stringMerge(s1, s2);

    }

    public static void stringMerge(String s1, String s2) {
        int length = 0;
        StringBuilder result = new StringBuilder();
        if (s1.length() >= s2.length()) {
            length = s1.length();
        } else {
            length = s2.length();
        }

        for (int i = 0; i < length; i++) {
            if (i < s1.length()) {
                result.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                result.append(s2.charAt(i));
            }
        }
        System.out.println(result);
    }
}
