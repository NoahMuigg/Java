import java.util.Scanner;

public class main {
    public static void main(String[] args){
        boolean los = true;
        Spielfeld spielfeld = Spielfeld.instance();

        while(los == true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Das aktuelle Spielfeld sieht so aus: ");
            spielfeld.printSpielFeld();
            System.out.println("Geben Sie Ihr Symbol an (X/O): ");
            String symbol = scanner.nextLine();
            System.out.println("Geben Sie die X-Position an: ");
            String positionX = scanner.nextLine();
            int intPositonX = Integer.parseInt(positionX);
            System.out.println("Geben Sie die Y-Position an: ");
            String positionY = scanner.nextLine();
            int intPositonY = Integer.parseInt(positionY);
            SpielStein spielStein = new SpielStein(symbol, intPositonX, intPositonY);
            String[][] spf = new String[3][3];
            spielfeld.updateSpielfeld(spf);
            spielfeld.printSpielFeld();
            if(spielfeld.checkObGewinner(spf) == true){
                spielfeld.checkObGewinner(spf);
                los = false;
            }

        }

    }
        
}

