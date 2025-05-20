import java.util.Scanner;
public class SalaryAfterTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your salary:");
        float salary=sc.nextFloat();
        System.out.println("enter the tax percentage");
        float tax=sc.nextFloat();
        double salaryCutbyTax=tax/100*salary;
        System.out.println(salaryCutbyTax);
        System.out.println("after all the tax how much u got");
        double finalSal=salary-salaryCutbyTax;
        System.out.println(finalSal);

    }
}
