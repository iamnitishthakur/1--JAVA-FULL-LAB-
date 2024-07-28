import java.util.Scanner;

public class IfElse {
    public static void main(String[]args){
        int age;
        System.out.println("Enter Your Age");
        Scanner obj=new Scanner(System.in);
        age=obj.nextInt();
        if(age>=18){
            System.out.println("Your are Eligible for voting");

        } else{
            System.out.println("Your are not eligible for voting");
            
        }
    }

}
