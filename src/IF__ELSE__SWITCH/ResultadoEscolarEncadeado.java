
package IF__ELSE__SWITCH;

public class ResultadoEscolarEncadeado {

    public static void main(String[] args) {

        // declarar nota do aluno

        int nota = 6;

        // delcarar condicao de aprovacao

        if (nota >= 7) {

            System.out.println("Aprovado");

        }

        // declarar condicao de recuperacao

        else if (nota >= 5 && nota < 7)

            System.out.println("Recuperacao");

        // declarar condicao de reprovacao

        else
            System.out.println("reprovador");

    }
}