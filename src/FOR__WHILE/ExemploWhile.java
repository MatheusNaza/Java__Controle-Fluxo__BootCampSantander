package FOR__WHILE;
import java.util.concurrent.ThreadLocalRandom;


public class ExemploWhile {

    public static void main(String[] args) {
    
        double mesada = 50.0;

        while (mesada>0) {

        double valorDoce = valorAleatorio();
        if(valorDoce>mesada)
        valorDoce=mesada;

        System.out.println("Doce do valor:" + valorDoce+ "adicionado ao carrinho");
        mesada = mesada - valorDoce;
            
        }
        System.out.println("mesada:" + mesada);
        System.out.println("joao gastou toda a mesada com doce");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}


