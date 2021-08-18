package lesson3;

import java.util.Random;
import java.util.Scanner;

public class hw_odn10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter number bigger then 3: ");
            n = sc.nextInt();
        }while(n<=3);
        Random r = new Random();
        int[]arr=new int[n];
        int count = 0;
        System.out.print("Начальный массив: ");
        for(int i = 0;i<n;i++){
            arr[i]=r.nextInt(n+1);
            System.out.print(arr[i]+" ");
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println();
        int[] arr2 = new int[count];
        int j = 0;
        System.out.print("Массив четных чисел: ");
        for(int i = 0;i < n;i++){
            if(arr[i]%2==0){
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int b: arr2){
            System.out.print(b+" ");
        }
        System.out.println();
        int kr3 = 1;
        int sr = 0;
        int countsr = 0;
        int c = 5;
        int cc = 0;
        int counterc = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%3==0 && arr[i]!=0){
                kr3*=arr[i];
            }
            if(i%2==0){
                sr+=arr[i];
                countsr++;
            }
            if(arr[i]>c){
                cc+=arr[i];
                counterc++;
            }
        }
        System.out.println("Произведение чисел кратных трем: "+kr3);
        System.out.println("Среднее арифметическое чисел с нечетными номерами: "+sr/countsr);
        System.out.println("Среднее арифметическое чисел превышающих " +c+": "+cc/counterc);
    }
}
