import java.math.BigDecimal;

import com.shop.Smartphone;
import com.shop.Televisore;

public class App {
    public static void main(String[] args) {
        Smartphone telefono = new Smartphone(12345, "Iphone", "Apple", new BigDecimal(999), new BigDecimal(0.22), 123456789, 256);

        Televisore televisore = new Televisore(12345, "Tv Figa", "Samsung", new BigDecimal(599), new BigDecimal(0.22), 1.00f, 1.50f, true);

        System.out.println(telefono.getCodice());
        
        // non è possibile modificare direttamente la proprietà codice
        // ereditata dalla superclasse Prodotto in quanto questa proprietà
        // è protected, quindi ha scope di classe (e sottoclasse) e pkg
        // telefono.codice = 123; --> proprietà codice non è visibile

        System.out.println(televisore.getIsSmartTv());

    }
}
