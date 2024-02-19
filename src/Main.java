import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João Silva", 20, "Engenharia", "ENG2024001");
        Aluno aluno2 = new Aluno("Maria Fernandes", 19, "Medicina", "MED2024002");

        // Utilizando o método descreverAluno
        for (Aluno aluno : Arrays.asList(aluno1, aluno2)) {
            System.out.println(aluno.descreverAluno());
            System.out.println(); // Adiciona uma linha vazia para melhorar a leitura
        }

        // Atualizando informações do aluno1
        aluno1.setCurso("Ciência da Computação");
        aluno1.setMatricula("CC2024003");

        System.out.println("Informações atualizadas do aluno1:");
        System.out.println(aluno1.descreverAluno());
    }
}
