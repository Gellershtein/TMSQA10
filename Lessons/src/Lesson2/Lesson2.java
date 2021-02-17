package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 0,sum=0;
        while(a<=10){
            sum+=a;
            a++;
        }
        System.out.println("Сумма " + sum);
        System.out.println("____________________________________");

        int time=0,countAn=0;
        while (time<=24) {
            if (time == 0) countAn = 1;
            else countAn *= 2;
            time+=3;
        }
        System.out.println(countAn);
    }

}
