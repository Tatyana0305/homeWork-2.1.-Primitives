public class Main {
    public static void main(String[] args) {

        long ticketPrice = 1_500_000_000L;
        int milePrice = 20;
        int bonus = (int) ticketPrice / milePrice;

        System.out.println("Ваш бонус: " + (bonus));
    }
}

