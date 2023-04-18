package TicTacToe;

public class SpielStein{
    private boolean isCross;
    private int positionX;
    private int positionY;

    public SpielStein(boolean isCross, int x, int y){
        this.isCross = isCross;
        this.positionX = x;
        this.positionY = y;
    }

    public boolean getisCross(){
        return this.isCross;
    }

    public int getPositionX(){
        return this.positionX;
    }

    public int getPositionY(){
        return this.positionY;
    }

}