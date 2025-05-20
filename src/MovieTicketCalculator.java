public class MovieTicketCalculator {
    public static void main(String[]args)
    {
        int movie1_tiket=120;
        System.out.println("1 ticket price "+ movie1_tiket);
        System.out.println("4 persons ticket price "+ (4* movie1_tiket));
        System.out.println("after 10 per discount ");
        double discount=10/(double)100*480;
        double afterDiscount=(4*movie1_tiket)-discount;
        System.out.println(afterDiscount);



    }
}
