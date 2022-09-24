public class Payment {
    String id;
    Integer amount;

    public Payment() {
    }

    public Payment(String id, Integer amount) {
        this.id = id;
        this.amount = amount;
    }

    void printDataPayment() {
        System.out.println("Payment id: " + id + " Amount: " + amount);
    }
}
