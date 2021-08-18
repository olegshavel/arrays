package lesson3;

import java.util.Random;
import java.util.Scanner;

public class hw_odn9 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print("Enter number: ");
            a = sc.nextInt();
        }while(a<0);
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = r.nextInt(16);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int half1 = 0;
        int half2 = 0;
        for(int i = 0;i<a/2;i++){
            half1+=arr[i];
        }
        for(int i = a/2;i<a;i++){
            half2+=arr[i];
        }
        if(half1>half2){
            System.out.println("1 половина больше");
        }else if(half1<half2){
            System.out.println("2 половина больше");
        }else{
            System.out.println("Половины равные");
        }
    }
}
