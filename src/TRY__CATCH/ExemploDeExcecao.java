package TRY__CATCH;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploDeExcecao {
    
    public static void main(String[] args) throws ParseException {

         Number valor = NumberFormat.getInstance().parse("a1.75");
        
        System.out.println(valor);
    }
}
