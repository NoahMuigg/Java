public class Wort{
    String anfangsWort = "Hallo";

    public void add(String buchstabe){
        anfangsWort = anfangsWort.concat(buchstabe);
        System.out.println(anfangsWort);
    }

    public void remove(){
        anfangsWort = anfangsWort.substring(0, anfangsWort.length()-1);
        System.out.println(anfangsWort);
    }
}