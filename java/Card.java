public class Card extends Payment {
    String dateCard;
    Integer cvv;
    Integer numberCard;

    public Card() {

    }

    public Card(String id, Integer amount, String dateCard, Integer cvv, Integer numberCard) {
        super(id, amount);
        this.dateCard = dateCard;
        this.cvv = cvv;
        this.numberCard = numberCard;
    }
}
