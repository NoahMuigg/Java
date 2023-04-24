public class main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Article a = new Article("1", "handschuhe", 5);
        Article b = new Article("2", "schuhe", 10);

        cart.addItem(a);
        cart.addItem(b);

        cart.pay(new PaypalStrategy("noah@muigg", "adsfasgd"));
        cart.pay(new CreditcardStrategy("had", "asdf", "dfv", "asgr"));

    }
}
