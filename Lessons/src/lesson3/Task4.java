package lesson3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr=new int[20];
        Random r = new Random();

//        for (int i = 0; i < arr.length; i++) {
//            if(i%2==0){arr[i]=r.nextInt(21);}
//            else {arr[i]=0;}
//        }
//Заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(21);
        }
 //Печать массива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(i%2==1) arr[i]=0;
            System.out.print(arr[i] + " ");
        }
    }
}
