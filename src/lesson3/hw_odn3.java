package lesson3;

import java.util.Random;

public class hw_odn3 {
    public static void main(String[] args) {
        int[] arr=new int[15];
        Random r = new Random();
        int count = 0;
        for(int i = 0; i<15;i++){
            arr[i]=r.nextInt(100);
            System.out.print(arr[i]+" ");
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
