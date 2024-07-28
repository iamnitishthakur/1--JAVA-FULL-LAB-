import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while(num>=2){
            if(num % 2==0){
                System.out.println("Even number");
                break;

            }
            else{
                System.out.println("Odd number");
                break;

            }
        }
        System.out.println("While loop end");
    }
}


