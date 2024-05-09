package IF__ELSE__SWITCH;
public class PlanoDeInternet {

    // Metodo if-else
    // nao e eficiente nesse caso

    public static void main(String[] args) {

        String plano = "T"; // opcoes = M / T / B

        if (plano == "B") {
            System.out.println("100 minutos de ligação");
        } else if (plano == "M") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
        } else if (plano == "T") {
            System.out.println("100 minutos de ligação");
            System.out.println("WhatsApp e Instagram grátis");
            System.out.println("5Gb Youtube");
        }

        // metodo switch case
        // mais dinamico

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }

        }

    }

}
