import java.util.Scanner;

public class ADD {
    public static void main(String []args){
        int a,b,c;
        System.out.println("Enter Your Any two number: ");

        Scanner s=new Scanner(System.in);

        a=s.nextInt();
        b=s.nextInt();

        c=a+b;
        System.out.print("Sum Of Two Numbers: " +c);

    }
}
