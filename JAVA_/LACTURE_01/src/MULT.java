import java.util.Scanner;

public class MULT {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter Your Two Numbers: ");

        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a*b;
        System.out.println("Multiplaction of Two Numbers: "+c);


    }
}
