public class Professor extends Pessoa {
	private String siape;
	private String disciplina;
	private boolean formacao;

	public Professor(String nome, int idade, String cpf, String siape, String disciplina, boolean formacao) {
		super(nome, idade, cpf);
		this.siape = siape;
		this.disciplina = disciplina;
		this.formacao = formacao;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public boolean isFormacao(boolean Formacao) {
		return formacao;
	}

	public void setFormacao(boolean Formacao) {
		this.formacao = formacao;
	}

	public void verificarFormacao() {
		System.out.println("Possui formação?" + (formacao ? "Sim" : "Não"));
	}

	public void exibirDados() {
		System.out.println(toString());
	}

	public String toString() {
		return super.toString() + ", SIAPE: " + siape + ", Disciplina: " + disciplina;
	}

	public boolean equals(Object o) {
		return super.equals(o);
	}

	public int hashCode() {
		return super.hashCode();
	}
}