import java.util.Scanner;

public class IF_STATEMENT {
    public static void main(String[] args) {
        int password;
        System.out.println("Enter Your Password:  ");
        Scanner obj=new Scanner(System.in);
        password=obj.nextInt();

        if(password==9793){
            System.out.println("Welcome to desktop..");
        }

    }


}
