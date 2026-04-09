import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String prodotto = "";
        boolean wasProdottoChosen = false;

        System.out.println("Scegli un prodotto da inserire nel carrello tra \n 1 - Smartphone \n 2 - Televisore \n 3 - Cuffie");

        while (!wasProdottoChosen) {
            if (prodotto.equals("smartphone") || prodotto.equals("televisore") || prodotto.equals("cuffie")) {
                wasProdottoChosen = true;
            }
            else {
                System.out.println("Inserisci un prodotto valido: ");
                prodotto = in.nextLine().toLowerCase();
            }
        }

        System.out.println("Prodotto " + prodotto + " inserito nel carrello");

        in.close();
    }
}
