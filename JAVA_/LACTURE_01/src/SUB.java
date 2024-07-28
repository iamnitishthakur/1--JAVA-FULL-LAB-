import java.util.Scanner;

public class SUB {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter Your Two Numbers: " );
        Scanner s=new Scanner(System.in);

        a=s.nextInt();
        b=s.nextInt();
        c=a-b;
        System.out.println("Subtraction of Two Numbers: "+c);
    }
}

