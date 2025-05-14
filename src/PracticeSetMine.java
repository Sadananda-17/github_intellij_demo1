import java.util.Scanner;
public class PracticeSetMine {
    public static void main(String []args)
    {
        /*
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the radius of the circle");
        double radius=sc.nextDouble();
        System.out.println("the area of the circle is");
        double area=Math.PI*(radius*radius);
        System.out.println(area);

         */
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for a");
        int a=sc.nextInt();
        System.out.println("enter the value for b");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping the values of a and b are " + a + "and " +b);

         */
        /*
        int a=5,b=10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a and b are " + a + "and "+ b);


         */
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value ");
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println( a + "s even");
        }
        else {
            System.out.println(a + "is odd");
        }
    }


}
