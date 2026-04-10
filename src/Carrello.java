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

        // iva applicata al 22% su tutto
        BigDecimal iva = new BigDecimal(0.22).setScale(2, RoundingMode.HALF_EVEN);

        // chiede se l'utente ha una carta fedeltà
        System.out.println("Sei in possesso di una carta fedeltà? (y / n)");
        boolean hasFidelity = in.nextLine().equals("y");
        System.out.println(hasFidelity);
        
        System.out.println("Quanti prodotti devi inserire nel carrello?");
        int itemNum = in.nextInt();
        in.nextLine();

        // array che rappresenta carrello
        Prodotto[] carrello = new Prodotto[itemNum];

        
        // cicla in base al numero di oggetti che l'utente deve inserire nel carrello
        for (int i = 0; i < carrello.length; i++) {
            
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
                    System.out.println(tv.getPrezzo());
                    tv.setDiscountedPrice(hasFidelity);
                    System.out.println(tv.toString());

                    carrello[i] = tv;
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

                    carrello[i] = cuffie;
                    break;
                case "smartphone":
                    int codiceSmartphone = rand.nextInt(50000);
                    int imei = rand.nextInt(999999);
                    System.out.println("Inserisci prezzo del telefono:");
                    BigDecimal prezzoSmartphone = in.nextBigDecimal();
                    // consuma \n del tasto invio... ok lo fa anche quì
                    in.nextLine();

                    System.out.println("Marca telefono? ");
                    String marca = in.nextLine();

                    System.out.println("Modello telefono? ");
                    String nome = in.nextLine();

                    System.out.println("Memoria telefono? ");
                    int memoria = in.nextInt();

                    Smartphone telefono = new Smartphone(codiceSmartphone, prezzoSmartphone, iva, nome, marca, imei,
                            memoria);

                    System.out.println("Hai inserito nel carrello uno smartphone con le seguenti caratteristiche: ");
                    System.out.println(telefono.toString());

                    carrello[i] = telefono;
                    break;
                default:
                    break;

                }
            in.nextLine();

        }
        
        in.close();
        
        System.out.println("Hai inserito i seguenti oggetti nel carrello");

        for (int i = 0; i < carrello.length; i++) {
            System.out.println(carrello[i].toString());
        }

        
    }

}
