package Lesson2;
//16513
public class Task2 {
    public static void main(String[] args) {
        int i=2,sum=1;
        while (i<=256){
            sum+=i;
            System.out.println(i + " " +sum);
            i+=2;
        }

        int j=1,sum2=0;
        while (j<=256){
            if(j==1) sum2+=j;
            else if (j%2==0)sum2+=j;
            System.out.println(j + " " +sum2);
            j+=1;
        }
        System.out.println(sum + " " + sum2);
    }
}
