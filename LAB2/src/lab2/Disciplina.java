package lab2;

import java.util.Arrays;

/**
 * Representação de uma disciplina, responsável por manter o registro das 
 * notas obtidas pelo aluno, calcular a média, cadastrar de forma acumulativa 
 * as horas de estudo e informar se o aluno está aprovado ou não na determinada disciplina.
 * Cada disciplina possui um nome e um objeto de controle.
 * 
 * @author Sheila Maria Mendes Paiva - Matricula: 118210186
 *
 */
public class Disciplina {
	/**
	* Nome de uma determinado disciplina.
	*/
	private String nomeDisciplina;
	/**
	* Horas de estudo do aluno.
	*/
	private int horasEstudo;
	/**
	* Notas, array de notas da disciplina.
	*/
	private double [] notas;
	
	/**
	* Constrói uma disciplina, a partir do seu nome.
	* Toda disciplina começa com o campo nome como nulo.
	*
	* @param nome o nome da disciplina
	*/
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double [4];
	}
	
	/**
	* Cadastra as horas estudadas pelo aluno em uma determinada disciplina. 
	* 
	* @param horas, horas estudadas
	*/
	public void cadastraHoras(int horas) {
		this.horasEstudo += horas;
	}
	
	/**
	* Cadastra as 4 notas possiveis do aluno e o valor obitido(é possível repor as notas no sistema). 
	* 
	* @param nota, nota a ser cadastrada
	* @param valorNota, valor da nota obtida na disciplina
	*/
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota - 1] = valorNota;
	}
	
	/**
	* Calcula e retorna a média das 4 notas obtidas pelo aluno na disciplina. 
	* 
	* @return retorna ao valor da média
	*/
	private double media(){
		double media = 0;
		for (int i = 0; i < this.notas.length; i++) {
			media += this.notas[i] / this.notas.length;
		}
		return media;
	}
	
	/**
	* Retorna a um boolean que informa se o aluno está aprovado, ou seja, 
	* true se a media obtida for maior ou igual a 7, ou false caso não esteja aprovado na disciplina. 
	* 
	* @return retorna a um boolean
	*/
	public boolean aprovado() {
		if (media() >= 7.0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	* Retorna a String que representa a disciplina. A representação segue o 
	* formato “nome da disciplina horas de estudo media [nota1, nota2, nota3, nota4]”.
	* 
	* @return a representação em String da disciplina.
	*/
	public String toString() {
		return this.nomeDisciplina + " " + this.horasEstudo + " " + media() + Arrays.toString(this.notas);
	}
}
