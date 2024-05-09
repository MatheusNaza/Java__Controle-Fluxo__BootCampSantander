package FOR__WHILE;
import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {

        System.out.println("discando ... ");
        do{
            System.out.println("telefonde tocando");

        }while(tocando());
        System.out.println("ALO!!! ");
        
    }
    private static boolean tocando(){

        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("atendeu ?" + atendeu);
        return ! atendeu;
    }
}
