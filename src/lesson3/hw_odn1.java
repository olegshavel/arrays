package lesson3;

public class hw_odn1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 2;
        for(int i = 0; i<10;i++){
            arr[i] = a;
            a+=2;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int b: arr){
            System.out.println(b);
        }
    }
}
