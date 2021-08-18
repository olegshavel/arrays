package lesson3;

public class hw_odn2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int a = 1;
        for(int i=0;i<50;i++){
            arr[i]=a;
            a+=2;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = 49;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
