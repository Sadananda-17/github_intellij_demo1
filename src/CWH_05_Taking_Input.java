//taking input from user by importing Scanner class
//Here Scanner is class and sc  is the object and System.in means taking input from keyboard

import java.util.Scanner;
import java.util.Scanner;
public class CWH_05_Taking_Input {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a");
        int a=sc.nextInt();
        System.out.println("enter the value for b");
        int  b=sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of these number is :");
        System.out.println(sum);
        boolean b3=sc.hasNextInt();
        System.out.println(b3);
        String str1=sc.nextLine();
        System.out.println(str1);


    }
}
