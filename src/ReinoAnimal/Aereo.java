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

public class Aereo extends Animal{
	
	private double altitude;
	
	/**
	 * Construtor
	 * 
	 * @param especie
	 * @param sexo
	 * @param nascimento
	 * @param altitude
	 */
	
	public Aereo(String especie, String sexo, double nascimento, double altitude) {
		super(especie, sexo, nascimento);
		this.altitude = altitude;

	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public void voar() {
		System.out.println("O animal está voando");
	}
	
	
	@Override
	public void comer() {
		System.out.println("O Animal Aereo está comendo");
		
		/** 
		 * Faz o animal comer
		 */

	
	}@Override
	public void perfil() {
		/**
		 * metodo para imprimir informações
		 */
	
		System.out.println("Especie do Animal" + getEspecie());
		System.out.println("Sexo do Animal" + getSexo());
		System.out.println("Nascimento do Animal" + getNascimento());
		System.out.println("O animal Aereo voa na altutede" + altitude);
		
	}

}
