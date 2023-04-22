public class LautBellen implements StrategyBellen{
    @Override
    public void bellen(int lautStärke){
        System.out.println("Der Hund bellt mit der Lautstärke "+lautStärke);
    }
}
