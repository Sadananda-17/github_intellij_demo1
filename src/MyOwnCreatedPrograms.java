import java .util.Scanner;
public class MyOwnCreatedPrograms {
    public static void main(String[] args) {

        //here we seing the some basic program

       int  a=34;
       float b=4.0f;
       char n='a';
       double x=99.0;
        System.out.println("addition " + (a+b));
        System.out.println("substraction " + (a-n));
        System.out.println("multiplication " + (x*a));
        //same here we see more
        double r=(a+b)*(x+6);
        double s=a+b*x+6;
        System.out.println(s);
        System.out.println(r);



        //here is the problems go like this the  customer takes the 2 product in respective quantity so calculate the discount of both the product

        Scanner sc=new Scanner (System.in);
        System.out.println("welcome to our shopping mall");
        System.out.println("enter your product1 Quantity");
        int sugarsQuantity=sc.nextInt();
        System.out.println("enter your product 2 Quantity");
        int saltQuantity=sc.nextInt();
        System.out.println("enter the product 1 price ");
        int product1Price=sc.nextInt();
        System.out.println("enter the product 2 price ");
        int product2Price=sc.nextInt();
        System.out.print("this is your actual bill before giving discount:");
        float Total_bill=(product1Price*sugarsQuantity)+(product2Price*saltQuantity);
        System.out.println(Total_bill);
        System.out.println("dear customers we are providing a discout on your two products upto 50%");
        double discount =Total_bill*50/100;
        System.out.println("see we are giving half rate the original amount was" + Total_bill);
        System.out.println("the dscount amount was "+ discount);
        System.out.println("see you nexttime ❤️❤️❤️❤️");


        //here is a program that splitting the cost of the fuel for each friends in a equal amount
        System.out.println("see freinds me and my freinds going to the trip so we want to divide the money to fuel how much friends should pay for fuel can u help me");
        System.out.print(" travelling the total distance in killometers ");
        float distance=sc.nextFloat();
        System.out.println("distance");
        System.out.println("enter the number of frieands you are taking them to a vacation");
        int friends_count=sc.nextInt();
        System.out.println(friends_count);
        float dist_to_friends_in_km=(distance/friends_count);
        System.out.println("the each friends has to pay the money for " + dist_to_friends_in_km + "kms");
        float price_per_lit=(70*112.5f);
        System.out.println("friend 1 pays "+ price_per_lit);
        System.out.println("friend 2 pays "+ price_per_lit);
        System.out.println("friend 3 pays "+ price_per_lit);
        System.out.println("friend 4 pays "+ price_per_lit);
        System.out.println("i am the only one not paid even one rupee for the trip😂😂😂😂😂");
        float total_expensesOftheTrip=4*price_per_lit;
        System.out.printf("the total cost of this trip%.2f was\n" ,total_expensesOftheTrip);





    }
}


