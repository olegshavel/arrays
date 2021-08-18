package lesson3;

import java.util.Random;

public class hw_odn8 {
    public static void main(String[] args) {
        Random r = new Random();
        double[] arr = new double[10];
        double[] arr2 = new double[10];
        double[] arr3 = new double[10];
        for(int i =0;i<10;i++){
            arr[i]=r.nextInt(9)+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i =0;i<10;i++){
            arr2[i]=r.nextInt(9)+1;
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for(int i =0;i<10;i++){
            arr3[i]=arr[i]/arr2[i];
            System.out.print(arr3[i]+" ");
        }
    }
}
