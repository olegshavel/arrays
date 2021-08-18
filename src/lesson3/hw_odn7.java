package lesson3;

import java.util.Random;

public class hw_odn7 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[12];
        for(int i = 0;i<12;i++){
            arr[i] = r.nextInt(16);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max = arr[0];
        int imax = 0;
        for(int i = 1; i < 12;i++){
            if(arr[i]>=max){
                max = arr[i];
                imax = i;
            }
        }
        System.out.println(imax);
    }
}
