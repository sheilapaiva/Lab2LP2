package lab2;

/**
 * Representação de uma conta em uma cantina, responsável por controlar os gastos, manter o 
 * registro dos itens comprados na conta e do debito do aluno na cantina. 
 * Cada cantina possui um nome e um objeto de controle, nesse caso o debitoConta.
 * 
 * @author Sheila Maria Mendes Paiva - Matricula: 118210186
 *
 */
public class ContaCantina {
	
	/**
	* Nome de uma determinada cantina.
	*/
	private String nomeDaCantina;
	/**
	* Debito atual da conta.
	*/
	private int debitoConta;
	/**
	* Total de itens comprados na conta desde a sua criação.
	*/
	private int totalItens;
	/**
	* Debito total na conta desde a sua criação.
	*/
	private int totalDebito;
	
	/**
	* Constrói uma conta em uma cantina, a partir do seu nome.
	* Toda disciplina começa com o campo nome como nulo.
	*
	* @param nomeDaCantina, o nome da cantina
	*/
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
	}
	
	/**
	* Cadastra a quantidade de itens que o aluno comprou na cantina
	* e o valor deles em centavos. Calcula o debito e a quantidade total
	* dos itens desde a criação da conta na cantina.
	* 
	* @param qtdItens, quantidade de itens comprados
	* @param valorCentavos, valor em centavos da compra 
	*/
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.totalItens += qtdItens;
		this.totalDebito += valorCentavos;
		this.debitoConta += valorCentavos;
	}
	
	/**
	* Calcula o valor pago em centavos pelo aluno na cantina o que diminue o valor do seu débido.  
	* 
	* @param valorCentavos, valor em centavos pago pelo aluno
	*/
	public void pagaConta(int valorCentavos) {
		this.debitoConta -= valorCentavos;
	}
	
	/**
	* Retorna ao valor do débito atual na conta da cantina.
	* 
	* @return ao valor em centavos do débito 
	*/
	public int getFaltaPagar() {
		return this.debitoConta;
	}
	
	/**
	* Retorna a String que representa a conta na cantina. A representação segue o 
	* formato “nome da cantina total de itens total do débito”.
	* 
	* @return a representação em String da conta na cantina.
	*/
	public String toString() {
		return this.nomeDaCantina + " " + this.totalItens + " " + this.totalDebito;
	}
	
}
