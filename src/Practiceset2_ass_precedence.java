import java.util.Scanner;
public class Practiceset2_ass_precedence {
    public static void main(String[] args) {
        float a=7/4.0f*9/2.0f;
        System.out.println(a);


        char grade='A';
        grade=(char) (grade+8);
        System.out.println(grade);

        grade=(char)(grade-8);
        System.out.println(grade);

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n>10);




        int v=10,u=10,b=1,s=2;
        int result=(v*v-u*u)/(2*b*s);
        System.out.println(result);


        int  x=7;
        int k=7*49/7+35/7;
        System.out.println(k);

    }
}
