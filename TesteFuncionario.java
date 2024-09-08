package revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		Diretor d = new Diretor("Ana",8500.,"Integral","Financeiro");
		Assistente a = new Assistente("Claudio",2200.,"Noite","Nivel-1");
		d.reajusteSalarial();
		a.reajusteSalarial();
		
		System.out.println(a);
		System.out.println(d);
	}

}
