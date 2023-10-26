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
	
	public String regiao;
	public boolean pelagem;
	


	public Terrestre(String especie, String sexo, double nascimento, String regiao, boolean pelagem) {
		super(especie, sexo, nascimento);
		this.regiao = regiao;
				this.pelagem = pelagem;
				

				/**
				 * Metodo construtor
				 */
	}

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
	   * gets e sets dos atributos de o animal
	   */

	public void mover(){
		System.out.println("O animal está se movendo");
		 /**
		  * metodo para o animal se mover
		  */
	}
	
	
	@Override
	public void comer() {
		System.out.println("O Animal Terrestres está comendo");
		 /**
		  * metodo para o animal comer
		  */

	
	}@Override
	public void perfil() {
	
		System.out.println("Especie do Animal" + especie);
		System.out.println("Sexo do Animal" + sexo);
		System.out.println("Nascimento do Animal" + nascimento);
		System.out.println("quantidade de Animais" + contador);
		System.out.println("O animal Terrestre é da região" + regiao);
		System.out.println("o animal Terrestre tem a pelagem" +  pelagem);
		
		/**
		 * Imprime as informações sobre o animal
		 */
	
	}
	
	

}
