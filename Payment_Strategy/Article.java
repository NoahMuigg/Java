public class Article {
    private String articleID;
    private String name;
    private double price;

    public Article(String articleID, String name, double price){
        this.articleID = articleID;
        this.name = name;
        this.price = price;
    }

    public String getArticleID(){
        return articleID;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
