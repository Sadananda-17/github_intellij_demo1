import java.util.Scanner;
public class MostUniqueProgramOfMyFeelings {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your parents name");
        String father=sc.nextLine();
        String mother=sc.nextLine();
        System.out.println("enter your age ");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter one promise that you want to make them");
        String promise=sc.nextLine();
        System.out.println("\n--Heartfelt note to my parents-- ");
        System.out.println("Dear "+ father + " and " + mother );
        System.out.println("iam  "+ name + "of yours  "+ age + "years old ");
        System.out.println(promise);
        System.out.println("thank you for everything. i love you always 🥰🥰🥰🥰🥰😍😍❤️❤️");
    }
}
