public class Main_v2 {
    public static void main(String[] args) {

        double PriceTicket = 12300.56;
        int OneMile = 20;

        if (PriceTicket > 0 & PriceTicket < 1000000) {
                       System.out.println("Ваши мили: " + (int) (PriceTicket / OneMile));
        } else {
            System.out.println("Неверная стоимость билета");
        }
    }
}
