package IF__ELSE__SWITCH;

public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "A";

        // metodo if else

        if (sigla == "P")
            System.out.println("Pequeno");
        else if (sigla == "M")
            System.out.println("Medio");
        else if (sigla == "G")
            System.out.println("Grande");
        else
            System.out.println("Indefinido");

        // metodo Switch case
        // Nivel sintatico baixo e nao muito viavel nesse caso

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefiinido");
        }

    }

}
