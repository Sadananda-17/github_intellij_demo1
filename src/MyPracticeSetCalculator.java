import java.util.Scanner;
public class MyPracticeSetCalculator {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to BMI calculator");
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter your weight in kilograms");
        double weight=sc.nextDouble();
        System.out.println("enter your height in meters");
        double height=sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("hello " + name);
        System.out.printf("bmi is : %.2f\n",bmi);
                if(bmi<18.5)
    {
        System.out.println("you are underweight");
    }
                else if(bmi<25)
    {
        System.out.println("you have a normal weight");
    }
                else if(bmi<30)
    {
        System.out.println("you are overweight");
    }
                else {
        System.out.println("you are in obese range");
    }

    }
}
