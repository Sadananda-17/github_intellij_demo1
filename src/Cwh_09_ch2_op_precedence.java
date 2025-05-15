public class Cwh_09_ch2_op_precedence {
    public static void main(String []args)
    {
        //operator precedence and associativity
        int a=6*5-34/2;
        System.out.println(a);
        /*
        highest priority goes to * and /and its evaluate on the basis of associativity
        how it works
        =30-17
        =13
         */
        int b=60/5-34*2;
        System.out.println(b);
        //in this case we have to note that we have to use associativity
        //here the precedence value of * and / both are same so in that case we have to use the associativity
        //the associativity of * and /goes like left to right
        //so the solution for above equation is
        /*
        =12-68
        =-56
         */
    }
}
