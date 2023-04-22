public class SpielStein{
    private String Zeichen;
    private int positionX;
    private int positionY;

    public SpielStein(String zeichen, int x, int y){
        this.Zeichen = zeichen;
        this.positionX = x;
        this.positionY = y;
    }

    public String getZeichen(){
        return this.Zeichen;
    }

    public int getPositionX(){
        return this.positionX;
    }

    public int getPositionY(){
        return this.positionY;
    }

}