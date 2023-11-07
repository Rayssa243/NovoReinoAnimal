package ReinoAnimal;

/**
 * 
 * 
 * Classe responsável para um cadastro de animais terrestres
 * 
 * 
 * @author Rayssa
 *
 */
public class Terrestre extends Animal{
	
	private String regiao;
	private boolean pelagem;
	
	/**
	 * 
	 *  Metodo construtor
	 *  
	 * @param especie
	 * @param sexo
	 * @param nascimento
	 * @param regiao
	 * @param pelagem
	 */
	


	public Terrestre(String especie, String sexo, double nascimento, String regiao, boolean pelagem) {
		super(especie, sexo, nascimento);
		this.regiao = regiao;
				this.pelagem = pelagem;
				

				
	}
	 /**
	   * gets e sets dos atributos de o animal
	   */

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPelagem() {
		return pelagem;
	}

	public void setPelagem(boolean pelagem) {
		this.pelagem = pelagem;
	}
	

	 /**
	  * metodo para o animal se mover
	  */

	public void mover(){
		System.out.println("O animal está se movendo");
		
	}
	
	 
	 /**
	  * metodo para o animal comer
	  */
	@Override
	public void comer() {
		System.out.println("O Animal Terrestres está comendo");
		

		/**
		 * Imprime as informações sobre o animal
		 */
	
	}@Override
	public void perfil() {
	
		System.out.println("Especie do Animal" + getEspecie());
		System.out.println("Sexo do Animal" + getSexo());
		System.out.println("Nascimento do Animal" + getNascimento());
		System.out.println("O animal Terrestre é da região" + regiao);
		System.out.println("o animal Terrestre tem a pelagem" +  pelagem);
		
	
	
	}
	
	

}
