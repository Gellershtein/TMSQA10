package HW_1;

public class Task4 {
    public static void main(String[] args) {
        int a[] ={1,-2,30};
        System.out.println("Колличество положительных чисел " + findPositive(a)+ '\n'+  "Колличество отрцательных чисел " + findNegative(a));
    }

    public static int findPositive(int [] a) {
        int countPos = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0) countPos++;
        }
        return countPos;
    }
    public static int findNegative(int [] a) {
        int countNeg = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0) countNeg++;
        }
        return countNeg;
    }
}
