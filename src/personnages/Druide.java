
package personnages;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public void preparerPotion() {
		Random random;
		random = new Random();
		this.forcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1 );
		this.forcePotion = forcePotion + effetPotionMin;
		if(forcePotion > 7) {
			this.parler("J'ai prepare une super potion de force !" + " La potion a une force de " + forcePotion);
		}else {
			this.parler("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force " + forcePotion);
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (("Obélix").equals(gaulois.getNom())) {
			parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",0,9);
		panoramix.preparerPotion();
	}
}

