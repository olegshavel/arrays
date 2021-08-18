package lesson3;

import java.util.Random;
import java.util.Scanner;

public class hw_dv1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Размерность матрицы: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                arr[i][j] = r.nextInt(51);
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(arr[i][i]%2==0){
                sum+=arr[i][i];
            }
        }
        System.out.println("Сумма четных элементов на главной диагонали: "+sum);
        System.out.print("Нечетные элементы под главной диагональю(включительно): ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                if(arr[i][j]%2!=0){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        System.out.println();
        int ipr = 1, jpr = 1;
        for(int i = 0;i<n;i++){
            ipr*=arr[i][i];
        }
        for(int j = n-1;j>=0;j--){
            jpr*=arr[n-1-j][j];
        }
        if(ipr<jpr){
            System.out.println("Произведение побочной диагонали больше");
        }else{
            System.out.println("Произведение главной диагонали больше");
        }
        int sum2 = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i][j]%2==0){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println("Сумма четных элементов над главной диагональю(не включительно): "+sum2);
        for(int i = 0;i<n;i++){
            for(int j = i + 1;j<n;j++){
                int t = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
