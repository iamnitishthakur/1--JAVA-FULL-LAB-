import java.util.Scanner;

public class Nested {
    public static void main(String[]args){
        System.out.println("______________________________________");
        int num1=20, num2=100, num3=45;


        if(num1>num2){

            if(num1>num3){
                System.out.println("Maximum" +num1);

            }
            else{
                System.out.println("Maximum" +num3);

            }
        }
                else{
                    if(num2>num3){
                        System.out.println("Minimum" +num2);

                    }
                    else{
                        System.out.println("Minimum" +num3);

                    }
        }
    }
}
