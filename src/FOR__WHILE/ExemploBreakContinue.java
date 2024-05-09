package FOR__WHILE;

public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;

                // utilizando o break ele ira imprimir 1 e 2 
                // caso utilize o CONTINUE ira imprimir 1 , 2 , 4 e 5 pulando o numero 3 

            System.out.println(numero);
        }

    }

}