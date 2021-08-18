package lesson3;

import java.util.Scanner;

public class X_O {
    public static void main(String[] args) {
        char[][] arr = new char[3][3];
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                arr[i][j]='*';
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------");
        Scanner sc = new Scanner(System.in);


        int i = 0;
        int j = 0;
        int counter = 0;



        while(true) {

            boolean win = false;

            do {
                System.out.print("Ход X: ");
                i = sc.nextInt();
                j = sc.nextInt();
            } while (arr[i][j] != '*');
            arr[i][j] = 'X';
            counter++;
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("---------");



            for(int x = 0;x<3;x++){
                if(arr[x][0]==arr[x][1] && arr[x][0]==arr[x][2] && arr[x][0]!='*'){
                    System.out.println("Победа X!");
                    win = true;
                    break;
                }
                if(arr[0][x]==arr[1][x] && arr[0][x]==arr[2][x] && arr[0][x]!='*'){
                    System.out.println("Победа X!");
                    win = true;
                    break;
                }
            }
            if(arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2] && arr[0][0] != '*'){
                System.out.println("Победа X!");
                win = true;
                break;
            }
            if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0] && arr[0][2] != '*'){
                System.out.println("Победа X!");
                win = true;
                break;
            }



            if(counter==9 || win){
                break;
            }



            do {
                System.out.print("Ход 0: ");
                i = sc.nextInt();
                j = sc.nextInt();
            } while (arr[i][j] != '*');
            arr[i][j] = '0';
            counter++;
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("---------");



            for(int x = 0;x<3;x++){
                if(arr[x][0]==arr[x][1] && arr[x][0]==arr[x][2] && arr[x][0]!='*'){
                    System.out.println("Победа 0!");
                    win=true;
                    break;
                }
                if(arr[0][x]==arr[1][x] && arr[0][x]==arr[2][x] && arr[0][x]!='*'){
                    System.out.println("Победа 0!");
                    win=true;
                    break;
                }
            }
            if(arr[0][0]==arr[1][1] && arr[0][0]==arr[2][2] && arr[0][0] != '*'){
                System.out.println("Победа 0!");
                win = true;
                break;
            }
            if(arr[0][2]==arr[1][1] && arr[0][2]==arr[2][0] && arr[0][2] != '*'){
                System.out.println("Победа 0!");
                win = true;
                break;
            }



            if(win){
                break;
            }
            sc.close();
        }
    }
}
