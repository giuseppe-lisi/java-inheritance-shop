import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

import com.shop.Prodotto;
import com.shop.Smartphone;
import com.shop.Televisore;


public class Carrello {
    public static void main() {
        Scanner in = new Scanner(System.in);
        String[] carrello = new String[2];
        BigDecimal iva = new BigDecimal(0.22).setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("Inserisci un prodotto nel carrello:\n(tv, smartphone, cuffie)");
        String choice = in.nextLine();

        switch (choice) {
            case "tv":
                Random rand = new Random();
                int codice = rand.nextInt(50000);

                System.out.println("Inserisci prezzo del televisore: ");
                BigDecimal prezzo = in.nextBigDecimal();

                System.out.println("Quanti pollici? ");
                float pollici = in.nextFloat();

                // tutti i televisori sopra i 32 pollici sono smartTv
                boolean isSmartTv = pollici > 32;

                Televisore tv = new Televisore(codice, prezzo, iva, pollici, isSmartTv);
                System.out.println("Hai inserito nel carrello un televisore con le seguenti caratteristiche: ");
                System.out.println(tv.toString());
                
                break;
            case "cuffie":
                
                break;
            case "smartphone":
                
                break;
        
            default:
                break;
        }

        in.close();
    }

}
