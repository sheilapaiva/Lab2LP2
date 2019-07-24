package lab2;

/**
 * Representação de uma conta em um labóratorio, responsável por manter o registro 
 * da quantidade de espaço de mbytes utilizado pelo aluno em determinado laboratório. 
 * Cada laboratório possui um nome e um objeto de controle desse estado, nesse caso o espaço ocupado.
 * 
 * @author Sheila Maria Mendes Paiva - Matricula: 118210186
 *
 */
public class ContaLaboratorio {
	
	/**
	* Nome de um determinado laboratório.
	*/
	private String nomeLaboratorio;
	/**
	* Cota, ela determina o limite de espaço disponível no sistema de armazenamento em mbytes.
	*/
	private int cota;
	/**
	* Espaço consumido, é o espaço utilizado pelo aluno no laboratório.
	*/
	private int espacoConsumido;
	
	/**
	* Constrói uma conta no laboratório, a partir do seu nome.
	* Toda conta começa com o campo nome como nulo.
	*
	* @param nome o nome do laboratório
	*/
	public ContaLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = 2000;
	}
	
	/**
	* Constrói uma conta no laboratório, a partir do seu nome e da sua cota disponível.
	* Toda conta começa com o campo nome e a cota como nulo.
	*
	* @param nome o nome do laboratório
	* @param cota a cota disponível no laboratório
	*/
	public ContaLaboratorio(String nomeLaboratorio, int cota) {
		this.nomeLaboratorio = nomeLaboratorio;
		this.cota = cota;
	}
	
	/**
	* Calcula o valor do espaço de armazenamento consumido pelo aluno em mbytes no laboratório. 
	* 
	* @param mybtes valor em mbytes consumido
	*/
	public void consomeEspaco(int mbytes) {
		this.espacoConsumido += mbytes;
	}
	
	/**
	*  Calcula o valor do espaço de armazenamento liberado pelo aluno de mbytes no laboratório.
	*  
	*  @param mybtes valor em mbytes liberado
	*/
	public void liberaEspaco(int mbytes) {
		this.espacoConsumido -= mbytes;
	}
	
	/**
	* Retorna ao boolean que informa se o aluno atingiu a cota do 
	* espaço de armazenamento do labóratorio ou não.
	*
	* @return a representação em boolean.
	*/
	public boolean atingiuCota() {
		if (this.espacoConsumido >= this.cota) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	* Retorna a String que representa a conta no laboratório. A representação segue o 
	* formato “nome do laboratório espaço consumido cota”.
	* 
	* @return a representação em String da conta no laboratório.
	*/
	public String toString() {
		return this.nomeLaboratorio + " " + this.espacoConsumido + "/" + this.cota;
	}
	
}