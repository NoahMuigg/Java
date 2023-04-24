import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Article> items;

    public ShoppingCart(){
        this.items = new ArrayList<Article>();
    }

    public void addItem(Article item){
        this.items.add(item);
    }

    public void removeItem(Article item){
        this.items.remove(item);
    }

    public double calculateTotal(){
        double sum = 0;
        for(Article a : items){
            sum += a.getPrice(); 
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        double amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
