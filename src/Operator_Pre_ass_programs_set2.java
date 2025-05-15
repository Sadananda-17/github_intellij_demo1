import java.util.Scanner;
public class Operator_Pre_ass_programs_set2 {
    public static void main(String []args)
    {
        /*Arithmetic operator
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("sum"+ (a+b));
        System.out.println("difference" + (a-b));
        System.out.println("product " + (a*b));
        System.out.println("quotient " + (a/b));
        System.out.println("remainder "  + (a%b));

         */
        //Assignment operator
        /*
        int a=10;
       a+=10;//20
       a-=10;//10
       a*=10;//100
       a/=10;//10
       a%=10;//0
        System.out.println("final value of a "+ a);

         */
        //comparision operator
        int a=10,b=2,c=4;
        if(a>=b&&a>=c)
        {
            System.out.println("greatest "+ a);
        }
        else if(b<=a&&b<=c)
        {
            System.out.println("greatest "+ b);
        }
        else
        {
            System.out.println("greatest "+ c);
        }
    }

}
