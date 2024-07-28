
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//        int a[] = {10,20,30,40,50}; //a[5];
        int a[][] = new   int [2][2];
        System.out.println("Enter Your numbers: ");
        Scanner s= new Scanner(System.in);

//        System.out.println(a[4]);
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                a[i][j]=s.nextInt();

            }

        }
        System.out.print("Martix Elements\n");

//        for(int b :a ) {
//            System.out.print(b+" ");
//        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(a[i][j]+" ");;


            }
            System.out.println();

        }

    }
}
