package ReinoAnimalTeste;

/**
 * 
 * 
 * Classe responsável para um cadastro de animais terrestres
 * 
 * 
 * @author Rayssa
 *
 */

import ReinoAnimal.Aereo;
import ReinoAnimal.Animal;
import ReinoAnimal.Aquatico;
import ReinoAnimal.Terrestre;


public class Principal {
	public static void main(String[] args) {
		

		Aquatico a1= new Aquatico("Carcharias taurus", "Femea", 7, "Salgada", false);
		
		Aquatico a2= new Aquatico("Pygocentrus natterer", "Macho", 3, "água doce", true);
		
		Terrestre t1 = new Terrestre("Felis catus", "Fêmea", 2, "Ásia", true);
		
		Terrestre t2 = new Terrestre("Hydrochoerus hydrochaeris", "Macho", 8, "América do Sul", true);
		
		Aereo ar1= new Aereo("Coragyps atratus", "Macho", 3, 54.5);
		Aereo ar2= new Aereo("Amazona aestiva", "fêmea", 7, 37.9);
		
	
 a2.comer();
 a1.comer();
 
 t1.mover();
 t2.mover();
 
 ar1.voar();
 ar2.voar();
 
 a1.perfil();
 t1.perfil();
 a2.toString();
 
 a1.membros();
	}
}