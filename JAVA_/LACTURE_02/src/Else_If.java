import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Else_If {


    public static void main(String[] args) {
        int marks;
        System.out.println("_____________________________________");
        System.out.println("Agniveer Result 2024...Check CutOff");
        System.out.println("_____________________________________");

        System.out.print("Enter Your Marks: ");
        Scanner obj=new Scanner(System.in);
                marks=obj.nextInt();


    if(marks>=150 && marks<=200)

    {
        System.out.println(" ☺  Excellent You are selected of Physical.. training Wait for calling.......");
    }
    else if(marks>=100 && marks<=149)
    {
        System.out.println(" ☺ Good Your are selected for Physical... training Wait For calling........");
    }
    else if(marks>=80 && marks<=99)
    {
        System.out.println("You are selected  for training ......");
    }
    else{
        System.out.println("You are disqualify try again for next time..");

    }
    }
}
