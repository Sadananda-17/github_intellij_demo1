import java.util.Scanner;
public class MyOwnprograms2 {
    public static void main(String []args)
    {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your item:");
        String item=sc.next();
        System.out.println("enter the Quantity of the item:");
        int Quantity = sc.nextInt();
        System.out.println("enter the one item price:");
        int price =sc.nextInt();
        System.out.print("the total amount of your pen is :");
        int total=Quantity*price;
        System.out.println(total);

         */
//printing the time in HH:MM:SS format
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your times in seconds :");
        int seconds=sc.nextInt();
        System.out.print("can you convert my seconds into hours :");
        int hours=seconds/3600;
        System.out.println(hours);
        System.out.println("can you convert my seconds into minutes");
        int remaingSeconds=seconds%3600;
       int  min=remaingSeconds/60;
        System.out.println("the min"+ min);
        System.out.println("ss" );
        int sec=remaingSeconds%60;
        System.out.println(sec);
        System.out.println("HH :"+ hours + " mm :" + min+ "sec : "+ sec);

         */


        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("enter youer age ");
        int age= sc.nextInt();
        int total_days_iam_living=age*365;
        int extra_leap_year=age/4;
        int total_days=total_days_iam_living+extra_leap_year;
        System.out.println("total days " + total_days);

         */
        /*
        System.out.println("enter your age");
        int age =sc.nextInt();
        System.out.println("enter your birth year");
        int birth_year=sc.nextInt();
        System.out.println("from your brith year till now how many leap year u got");
        int leapyear=age/4;
        System.out.println("the total leap year you got till now " + leapyear);

         */
        /*
        System.out.println("enter the number");
        int num= sc.nextInt();
        int hundpostn=num/100;
        int tenspostn=num/10%10;
        int onespostn=num%10;
        System.out.println(hundpostn);
        System.out.println(tenspostn);
        System.out.println(onespostn);

         */

        System.out.println("enter the 10000's place");
        int tentousand=sc.nextInt();
        int place5=tentousand/10000;
        System.out.println("place5 :" +place5);
        int place4=(tentousand/1000)%10;
        System.out.println("place4 :" + place4);
        int place3=(tentousand/100)%10;
        System.out.println("place3 :" +place3);
        int place2=(tentousand/10)%10;
        System.out.println("place2 :" +place2);
        System.out.println("place1 :" + tentousand%10);
        System.out.print("sum of all digit: ");
        int sum=tentousand%10+place2+place3+place4+place5;
        System.out.println(sum);





    }
}

