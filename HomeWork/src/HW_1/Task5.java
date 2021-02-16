package HW_1;

public class Task5 {
    public static void main(String[] args) {
    int a= -10000;
        System.out.println(checkPositive(a) + checkDepth(a));
    }

    public static String checkPositive(int a) {
    if (a>0) return "Число " + a + " положительное. \n";
    else return "Число " + a + " отрицательное. \n";
    }
    public static String checkDepth(int a) {
        int count=0,b=a;
        while(a!=0) {
        count++;
        a/=10;
        }
        return "Число " + b + " является " + count + " значным";
    }
}
