public class Main {
    public static void main(String[] args) {

        if (priceTicket > 0 & priceTicket < 1000000) {
            int bonus = (int) (priceTicket / oneMile);
            System.out.println("Ваши мили составляют: " + bonus);
        } else {
            System.out.println("Неверная стоимость билета");
        }
    }
}