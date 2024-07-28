import java.util.Scanner;

public class ForLoop {
    public static void main(String[]args){
        int a,i;
        System.out.print("Enter Any Numbers: ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        for(i=1; i<=10; i++)
        {
            System.out.println(a*i);
        }
    }
}
