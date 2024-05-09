package FOR__WHILE;

public class ExemploForArrays {
    public static void main(String[] args) {

        // em arrays o indice sempre comeca em 0

        String alunos[] = { "Felipe", "Carlos", "Barbara", "Matheus" };

        for (int x = 0; x < alunos.length; x++) {

            System.out.println("o aluno no indice x = " + x + " e " + alunos[x]);
        }

        // metodo encurtado e com um visual melhor

        for (String aluno : alunos) {
            System.out.println("nome do aluno e: " + aluno);

        }
    }

}
