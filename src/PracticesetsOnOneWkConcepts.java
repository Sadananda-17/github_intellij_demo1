import java.util.Scanner;
public class PracticesetsOnOneWkConcepts {
    public static void main(String []args)
    {
        int a=5;
        double b=2.5;
        System.out.println(a+b);

        int c=50;
        c=(byte)(c*2);
        System.out.println(c);

        Scanner sc=new Scanner (System.in);
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("hello " + name +" you are " +age + "years old");

        System.out.println(10+20*3);

        System.out.println(100/10*2/5-3);
        int d=5;
        int f=++d *2 +d--;
        System.out.println(f);
        System.out.println(d);


        int x=10;
        int y=x++ + ++x;
        System.out.println("x " + x + "y " +y );

        int g=130;
        long k=g++;
        System.out.println(k);

        //java program coin splitter

        System.out.println("enter the money in rupees");
        int coin =sc.nextInt();
        System.out.print("the no of 5 rupees coin is");
        int coin5=coin/5;
        int remain=coin%5;
        System.out.println(coin5);
        System.out.print("the no of 2 rupees coi is:");
        int coin2=(remain/2);
        System.out.println(coin2);
        System.out.print("the no of 1 rupees coins");
        int coin1=remain%2;
        System.out.println(coin1);





    }
}
