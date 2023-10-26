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
	
	public double altitude;
	

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

	
	}@Override
	public void perfil() {
	
		System.out.println("Especie do Animal" + especie);
		System.out.println("Sexo do Animal" + sexo);
		System.out.println("Nascimento do Animal" + nascimento);
		System.out.println("quantidade de Animais" + contador);
		System.out.println("O animal Aereo voa na altutede" + altitude);
		
	}

}
