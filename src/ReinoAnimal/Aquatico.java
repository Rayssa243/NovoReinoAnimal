package ReinoAnimal;


/**
 * 
 * 
 * Classe responsável para um cadastro de animais auqaticos que herda da classe Animal
 * 
 * 
 * @author Rayssa
 *
 */
public class Aquatico extends Animal{

	public String tipoAgua;
	 public boolean escamas;
	
	public Aquatico(String especie, String sexo, double nascimento, String tipoAgua, boolean escamas ) {
		super(especie, sexo, nascimento);
		this.tipoAgua = tipoAgua;
		this.escamas = escamas;
		

		/**
		 * Metodo construtor
		 */
		
	}

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isEscamas() {
		return escamas;
	}

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}
	

	  /**
	   * gets e sets dos atributos de o animal
	   */

	
	public void nadar() {
		System.out.println("O animal está nadando...");
		
		/**
		 * metodo para o animal nadas
		 */
	}
	
	@Override
	public void comer() {
		System.out.println("O Animal aquatico está comendo");
    /**
     * metodo para o animal comer
     */
	
	}@Override
	public void perfil() {
	
		System.out.println("Especie do Animal" + especie);
		System.out.println("Sexo do Animal" + sexo);
		System.out.println("Nascimento do Animal" + nascimento);
		System.out.println("quantidade de Animais" + contador);
		System.out.println("O animal Aquatico é do tipo de agua" + tipoAgua);
		System.out.println("o animal Aquantico" + escamas + "escamas");
		
		/**
		 * Imprime as informações sobre o animal
		 */
	
	}
}
