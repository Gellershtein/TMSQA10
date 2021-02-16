package HW_1;

public class Task2 {
    public static void main(String[] args) {
        int a=1, b=11;
        check(a,b);
    }

    public static void check(int a, int b) {
        if(a>b) System.out.println("a>b и равно "+ a);
        else if (a<b) System.out.println("b>a и равно " + b);
        else System.out.println("Оба числа a,b равны " + a);
    }
}
