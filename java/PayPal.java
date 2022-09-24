public class PayPal extends Payment {
    String email;

    public PayPal(String id, Integer amount, String email) {
        super(id, amount);
        this.email = email;
    }
}