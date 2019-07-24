package lab2;

/**
 * Representação do estado da saúde física e mental do aluno.
 * 
 * @author Sheila Maria Mendes Paiva - Matricula: 118210186
 *
 */
public class Saude {
	
	/**
	* Estado da saúde física do aluno.
	*/
	private String saudeFisica;
	/**
	* Estado da saúde mental do aluno.
	*/
	private String saudeMental;
	
	/**
	* Constrói um objeto relacionado a saúde do aluno.
	* A saúde física e mental começa com o campo com o valor "boa".
	*/
	public Saude(){
		this.saudeFisica = "boa";
		this.saudeMental = "boa";
	}
	
	/**
	* Define o valor da saúde física do aluno.
	* 
	* @param valor, estado da saúde físico
	*/
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}
	
	/**
	* Define o valor da saúde mental do aluno.
	* 
	* @param valor, estado da saúde mental
	*/
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}
	
	/**
	* Retorna a String que representa o estado geral da saúde física e mental do aluno.
	* Caso ambas estejam fracas, a saúde geral do aluno é “fraca”. 
	* Se ambas estiverem boas, a saúde geral do aluno é “boa”. 
	* Se uma delas estiver fraca, mas a outra estiver boa, a saúde geral do aluno é considerada “ok”.
	* 
	* @return a String que representa o estado da saúde física e mental do aluno
	*/
	public String getStatusGeral() {
		if (this.saudeFisica.equals("fraca") && this.saudeMental.equals("fraca")) {
			return "fraca";
		}else if (this.saudeFisica.equals("boa") && this.saudeMental.equals("boa")) {
			return "boa";
		}else {
			return "ok";
		}
	}
}
