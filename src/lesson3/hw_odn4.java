package lesson3;

import java.util.Random;

public class hw_odn4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r = new Random();
        for(int i=0;i<20;i++){
            arr[i]=r.nextInt(21);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<20;i++){
            if(i%2!=0){
                arr[i]=0;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
