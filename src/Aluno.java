public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private String matricula;

    public Aluno(String nome, int idade, String curso, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", curso='" + curso + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public String descreverAluno() {
        return "Aluno: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Curso: " + curso + "\n" +
                "Matrícula: " + matricula;
    }
}
