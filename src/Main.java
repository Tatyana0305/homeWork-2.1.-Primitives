public class Main {
    public static void main(String[] args) {

        long ticketPrice = 3_000_000_000L;
        int milePrice = 20;
        long bonus = ticketPrice / milePrice;

        System.out.println("Ваш бонус: " + (bonus));
    }
}

