import java.math.BigDecimal;

import com.shop.Smartphone;

public class App {
    public static void main(String[] args) {
        Smartphone telefono = new Smartphone(12345, "Iphone", "Apple", new BigDecimal(999), new BigDecimal(0.22), 123456789, 256);

        System.out.println(telefono.getCodice());
        
    }
}
