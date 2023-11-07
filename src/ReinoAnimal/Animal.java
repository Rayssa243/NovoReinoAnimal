package ReinoAnimal;

/**
 * 
 * 
 * Classe responsável para um cadastro de animais
 * 
 * 
 * @author Rayssa
 *
 */
public class Animal {

	
	/**
	 * atributos criados
	 */
	private String especie;
	 private String sexo;
	 private double nascimento;
	
	 static int contador=0;
	 
		public String getEspecie() {
			return especie;
		}
		public void setEspecie(String especie) {
			this.especie = especie;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public double getNascimento() {
			return nascimento;
		}
		public void setNascimento(double nascimento) {
			this.nascimento = nascimento;
		}

		  /**
		   * gets e sets dos atributos de o animal
		   */

	
	public void comer() {
		System.out.println("O animal está comendo....");
		
	/** 
	 * Faz o animal comer
	 */
	}
	
	/**
	 * Metodo construtor
	 * 
	 * @param especie
	 * @param sexo
	 * @param nascimento
	 */
	public Animal(String especie, String sexo, double nascimento) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.nascimento = nascimento;
		contar();
		
	}
	
	/**
	 * Imprime as informações sobre o animal
	 */
	public void perfil() {
		System.out.println("Especie do Animal" + especie);
		System.out.println("Sexo do Animal" + sexo);
		System.out.println("Nascimento do Animal" + nascimento);
		System.out.println("quantidade de Animais" + contador);
		

	
	}
	private static void contar() {
		contador++; 
		
		/**
		 * aumenta 1 animal para o contador toda vez que é chamado
		 */
		
}

		public void membros() {
		System.out.println("Numero de animais criados:"+contador);
		
	  /**
	   * imprime o numero de animais cadastrados
	   */
}
	}
