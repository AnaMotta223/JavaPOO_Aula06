package exerciciosaula06;

public class TestaLivro {
	public static void main(String[] args) {
		Livro l1 = new Livro("Marco Antônio","Cisco CCNA", 85.0);
		Livro l2 = new Livro("Kathy Sierra","Use a cabeça Java",98.0);
		
		Operacao o1 = new Operacao("Venda",l1);
		Operacao o2 = new Operacao("Empréstimo",l2);
		
		l1.reajuste(l1.getValor());
		o1.venderLivro();
		o2.emprestarLivro();
		
		System.out.println(o1);
		System.out.println(o2);
	}
}
