package lesson3;

public class Task2 {
    public static void main(String[] args) {
        int[] ar = new int[50];

        for (int i = 0,j=0; i < ar.length; i++,j+=2) {
            ar[i]=j+1;
            }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        for (int i = ar.length-1; i >= 0; i--) {
            System.out.print(ar[i]+ " ");
        }
    }
}
