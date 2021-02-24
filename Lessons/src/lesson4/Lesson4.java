package lesson4;

import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {
        
    }
    public static int[][] createAndInitArray(int n, int m) {
    int[][] a= new int[n][m];
    Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               a[i][j]= r.nextInt(10);
            }
        }

        return a;
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
