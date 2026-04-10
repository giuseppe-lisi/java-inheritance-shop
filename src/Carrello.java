import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

import com.shop.Cuffie;
import com.shop.Prodotto;
import com.shop.Smartphone;
import com.shop.Televisore;


public class Carrello {
    public static void main() {
        // helper objects
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        // array che rappresenta carrello
        String[] carrello = new String[2];

        // iva applicata al 22% su tutto
        BigDecimal iva = new BigDecimal(0.22).setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("Inserisci un prodotto nel carrello:\n(tv, smartphone, cuffie)");
        String choice = in.nextLine();

        switch (choice) {
            case "tv":
                int codiceTv = rand.nextInt(50000);

                System.out.println("Inserisci prezzo del televisore: ");
                BigDecimal prezzoTv = in.nextBigDecimal();

                System.out.println("Quanti pollici? ");
                float pollici = in.nextFloat();

                // tutti i televisori sopra i 32 pollici sono smartTv
                boolean isSmartTv = pollici > 32;

                Televisore tv = new Televisore(codiceTv, prezzoTv, iva, pollici, isSmartTv);

                System.out.println("Hai inserito nel carrello un televisore con le seguenti caratteristiche: ");
                System.out.println(tv.toString());

                break;

            case "cuffie":
                int codiceCuffie = rand.nextInt(50000);

                System.out.println("Inserisci prezzo delle cuffie:");
                BigDecimal prezzoCuffie = in.nextBigDecimal();
                // consuma \n del tasto invio... per qualche motivo lo fa solo quì
                in.nextLine();

                System.out.println("Che colore sono le cuffie?");
                String colore = in.nextLine();

                System.out.println("Le cuffie sono cablate o wireless?");
                String cableOrBt = in.nextLine();

                Cuffie cuffie = new Cuffie(codiceCuffie, prezzoCuffie, iva, colore, cableOrBt);

                System.out.println("Hai inserito nel carrello un paio di cuffie con le seguenti caratteristiche: ");
                System.out.println(cuffie.toString());

                break;
            case "smartphone":
                
                break;
        
            default:
                break;
        }

        in.close();
    }

}
