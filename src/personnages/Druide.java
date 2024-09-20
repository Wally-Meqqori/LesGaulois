
package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "“ " + texte + " ”");
	}
	public void preparerPotion(String texte) {
		System.out.println(prendreParole() + "“ " + texte + " ”");
	}

	public void preparerPotion() {
		Random random = new Random();
		this.forcePotion = effetPotionMin + random.nextInt( effetPotionMax - effetPotionMin + 1);
		if (this.forcePotion > 7) {
			this.parler("J'ai prepare une super potion de force " + this.forcePotion);
		}
		else {
			this.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+ this.forcePotion);
		}
	}
	public void booster(Gaulois gaulois) {
		if("Obélix".equals(gaulois.getNom())) {
			this.parler("Non, Obsélix !... Tu n'auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(this.forcePotion);
		}
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();

	}
}

