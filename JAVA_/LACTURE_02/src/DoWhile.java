import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter ant numbers: ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        do{
            System.out.println(num+ " ");
            num++;

        }
        while(num<=10);
    }
}
