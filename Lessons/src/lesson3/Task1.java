package lesson3;

public class Task1 {
    public static void main(String[] args) {
        int[] ar = new int[10];

        for (int i = 0; i < ar.length; i++) {
            ar[i]=(i+1)*2;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        for (int i = 0,j=0; i < ar.length; i++,j+=2) {
            ar[i]=j+2;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
