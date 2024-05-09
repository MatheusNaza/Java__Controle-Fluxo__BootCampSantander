package IF__ELSE__SWITCH;

// fluxo simples

public class CaixaEletronico {
    public static void main(String[] args) {

        // declarar o saldo

        double saldo = 25.0;

        // declarar saldo solicitado

        double ValorSolicitado = 17.0;

        // confirmar disponibilidade do valor pedido

        if (ValorSolicitado < saldo)
            saldo = saldo - ValorSolicitado;

        System.out.println(saldo);

    }
}
