package interfaces;

//nao pode ser instanciada
//nao tem implementação
//atributos são final 
//só tem assinaturas
//regras que sao aplicadas nas classes que implementam

public interface Conta {
	void saque(Double valor); //ja sao publicos e abstratos
	void deposito(Double valor);
	final Double IMPOSTO = 10.;
	
	
	
}
