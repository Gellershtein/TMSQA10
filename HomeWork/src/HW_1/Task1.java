package HW_1;

public class Task1 {
    public static void main(String[]args){
        int a=-1;
        System.out.println("Число а= " + check(a));
    }

    public static int check(int a){
        if (a>0) a++;
        else if (a<0) a=a-2;
        else if (a==0) a=10;
        return a;
    }
}
