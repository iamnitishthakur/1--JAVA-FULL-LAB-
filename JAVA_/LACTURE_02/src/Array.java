// 1.data-type[] var-name;
//2. data-type var-name[]={10,20,....n}
//3.int a[]=new int [5];

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int a[] = {10,20,30,40,50}; //a[5];
        int a[] = new   int [7];
        System.out.println("Enter Youe numbers: ");
        Scanner s= new Scanner(System.in);

//        System.out.println(a[4]);
        for(int i=0; i<5; i++){
            a[i]=s.nextInt();

        }
        System.out.print("Array Elements\n");

        for(int b :a ) {
            System.out.print(b+" ");
        }

    }
}
