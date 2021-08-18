package lesson3;

import java.util.Random;

public class hw_odn5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        Random r = new Random();
        for(int i = 0; i<5;i++){
            arr[i]=r.nextInt(16);
            arr2[i]=r.nextInt(16);
        }
        int res = 0;
        int res2 = 0;
        for(int a: arr){
            System.out.print(a+" ");
            res+=a;
        }
        System.out.println();
        for(int a: arr2){
            System.out.print(a+" ");
            res2+=a;
        }
        System.out.println();
        if(res>res2){
            System.out.println("1");
        }else if(res<res2){
            System.out.println("2");
        }else{
            System.out.println("ср геом равны");
        }
    }
}
