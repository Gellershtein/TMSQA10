package HW_1;

public class Task6 {
    public static void main(String[] args) {
        int a = 14;
        System.out.println(a + countProgrammers(a));

    }

    public static String countProgrammers(int s) {
        String prg = "";
        if (s == 0) prg = " программистов";
        else {
            if (s % 100 >= 10 && s % 100 <= 20) prg = " программистов";
            else if (s % 10 == 1) prg = " программист";
            else if (s % 10 >= 2 && s % 10 <= 4) prg = " программиста";
            else prg = " программистов";
        }
        return prg;
    }
}
