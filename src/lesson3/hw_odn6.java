package lesson3;

import java.util.Random;

public class hw_odn6 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random r = new Random();
        for(int i = 0;i<4;i++){
            arr[i]=r.nextInt(11);
            System.out.print(arr[i]+" ");
        }
        boolean x = true;
        for(int i = 1;i<4;i++){
            if(arr[i]<=arr[i-1]){
                x = false;
                break;
            }
        }
        System.out.println();
        if(x==true){
            System.out.println("da");
        }else{
            System.out.println("net");
        }
    }
}
