package histoire;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
<<<<<<< HEAD
		Gaulois obelix = new Gaulois("Obélix",25);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
=======
		Gaulois obelix = new Gaulois("ObÃ©lix",25);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		
		panoramix.parler("Je vais preparer une petite potion");
		panoramix.preparerPotion();
		
		panoramix.booster(obelix);
		obelix.parler("Par BÃ©lÃ©nos, ce n'est pas juste !");
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

>>>>>>> 59c2b2eccf13b5bdf902170ce7964d60061c5141
	}

}
