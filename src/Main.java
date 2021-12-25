public class Main {
    public static void main(String[] args) {

        double PriceTicket = 100.56;
        int OneMile = 20;

        if (PriceTicket > 0 & PriceTicket < 1000000) {
            int bonus = (int) (PriceTicket / OneMile) ;
            System.out.println("Ваши мили составляют: " + bonus);
        } else {
            System.out.println("Неверная стоимость билета");
        }
        }
    }
