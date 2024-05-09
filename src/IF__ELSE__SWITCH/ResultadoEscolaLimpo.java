package IF__ELSE__SWITCH;

//codigo mais limpo utilizando condicoes ternarias

public class ResultadoEscolaLimpo {

    public static void main(String[] args) {

        //declarar a nota o aluno 

        int nota = 8;

        //Desenvolver a String para as 3 condicoes 

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "recuperacao ": "Reprovado";
        System.out.println(resultado);
    }
}