public class Main_v2 {
    public static void main(String[] args) {

        if (priceTicket > 0 & priceTicket < 1000000) {
            System.out.println("Ваши мили: " + (int) (priceTicket / oneMile));
        } else {
            System.out.println("Неверная стоимость билета");
        }
    }
}
