public class Hund {
    private StrategyBellen stbellen;

    public void setBellen(StrategyBellen stb){
        stbellen = stb;
    }

    public void bellen(int lautStärke){
        stbellen.bellen(lautStärke);
    }
}
