public class CreditcardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditcardStrategy(String name, String cN, String cvv, String doe){
        this.name = name;
        this.cardNumber = cN;
        this.cvv = cvv;
        this.dateOfExpiry = doe;
    }

    @Override
    public void pay(double amount){
        System.out.println("Folgender Betrag wurde mit einer Kreditkarte bezahlt: " + amount);
    }
}
