public class Spielfeld {
    private String[][] spielfeld;
    private SpielStein spielStein;
    private static Spielfeld instance = null;

    private Spielfeld(){
        spielfeld = new String[3][3];
    }

    public static Spielfeld instance(){
        if(instance == null){
            instance = new Spielfeld();
        }
        return instance;
    }

    public String[][] updateSpielfeld(String[][] spielfeld){
        int x = spielStein.getPositionX();
        int y = spielStein.getPositionY();
        if(spielStein.getZeichen() == "X"){
            spielfeld[y][x] = "X";
        }
        if(spielStein.getZeichen() == "O"){
            spielfeld[y][x] = "O";
        }

        return spielfeld;
    }


    public boolean checkObGewinner(String[][] spielfeld){
        boolean gewinner = false;
        for(int i = 0; i < 3; i++){
            if(spielfeld[i][0] == spielfeld[i][1] && spielfeld[i][0] == spielfeld[i][2]){
                System.out.println(spielfeld[i][0] + "hat gewonnen");
            }
        }
        for(int i = 0; i < 3; i++){
            if(spielfeld[0][i] == spielfeld[1][i] && spielfeld[0][i] == spielfeld[2][i]){
                System.out.println(spielfeld[0][i] + "hat gewonnen");
            }
        }
        if(spielfeld[0][0] == spielfeld [1][1] && spielfeld[0][0] == spielfeld[2][2]){
            System.out.println(spielfeld[0][0] + "hat gewonnen");
        }
        if(spielfeld[0][2] == spielfeld [1][1] && spielfeld[0][2] == spielfeld[2][0]){
            System.out.println(spielfeld[0][0] + "hat gewonnen");
        }

        return gewinner;
    }


    public void printSpielFeld(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(j == 2){
                    System.out.println(spielfeld[i][j]);
                }else{
                    System.out.print(spielfeld[i][j]);
                } 
            }
        }
    }
}
