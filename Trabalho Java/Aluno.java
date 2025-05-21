public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String cpf, String matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibirDados() {
        System.out.println(toString() + ", Matrícula: " + matricula + ", Curso: " + curso);
    }

    public String toString() {
        return super.toString() + ", Matrícula: " + matricula + ", Curso: " + curso;
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    public int hashCode() {
        return super.hashCode();
    }
}