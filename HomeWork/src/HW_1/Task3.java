package HW_1;

public class Task3 {
    public static void main(String[] args) {
        int a[] =new int[] {1,-2,30};
        System.out.println("Колличество положительных чисел " + findPositive(a));

    }

    public static int findPositive(int [] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0) count++;
        }
        return count;
    }

}
