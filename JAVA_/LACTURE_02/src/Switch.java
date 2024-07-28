import java.util.Scanner;

public class Switch {
    public static   void main(String []agrs){
        int a,b,c,choice;
        System.out.print( "Enter Your Frist Numbers : ");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();

        System.out.print("Enter Your Second Numbers : ");
        b=obj.nextInt();
        System.out.print("Enter YOur choice: ");

        choice=obj.nextInt();
        switch(choice){
            case 1:c=a+b;
                System.out.println("Addtion of two numbers: " +c);
                break;

            case 2: c=a-b;
                System.out.println("Subtraction of two numbers: "+c);
                break;

            case   3: c=a*b;
                System.out.println("Multiplucation of Two Numbers: "+c);
                break;

            case   4: c=a/b;
            System.out.println("Division of  Two numbers "+c);
            break;

            case    5: c=a%b;
            System.out.println("Rimender of Two numbers "+c);
            break;
            default:System.out.println("Invaild opration.....");


    }

    }
}
