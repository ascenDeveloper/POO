import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AJU123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE542", new Account("Andrea Herrera", "QFE554"));
        car2.passenger = 3;
        car2.printDataCar();

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);

        Card payment = new Card("JF1I7fJ4ij3S2F", 5, strDate, 342, 234234243);
        payment.printDataPayment();
        System.out.println(payment.dateCard);
    }
}