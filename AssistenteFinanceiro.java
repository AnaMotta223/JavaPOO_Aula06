package revisao;

public class AssistenteFinanceiro extends Assistente{
	private String cursos;

	public AssistenteFinanceiro(String nome, Double salario, String turno, String nivel, String cursos) {
		super(nome, salario, turno, nivel);
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return " Cursos " + cursos + ", dados: " + super.toString();
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	
	
}
