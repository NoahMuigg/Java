import javax.swing.text.DefaultEditorKit.PasteAction;

public class PaypalStrategy implements PaymentStrategy{
    private String emailID;
    private String passwort;

    public PaypalStrategy(String emailID, String passwort){
        this.emailID = emailID;
        this.passwort = passwort;
    }

    @Override
    public void pay(double amount){
        System.out.println("Es wurde folgender Betrag mit Paypal gezahlt: " + amount);
    }
}
