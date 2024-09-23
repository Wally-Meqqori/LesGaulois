
package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
<<<<<<< HEAD
		this.forcePotion = 1;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + ".");
=======
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + ".");
>>>>>>> 59c2b2eccf13b5bdf902170ce7964d60061c5141
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
<<<<<<< HEAD
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
		if (("Ob�lix").equals(gaulois.getNom())) {
			parler("Non, Ob�lix !... Tu n'auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);
=======
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
			this.parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		}
		else {
			gaulois.boirePotion(this.forcePotion);
>>>>>>> 59c2b2eccf13b5bdf902170ce7964d60061c5141
		}
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public static void main(String[] args) {
<<<<<<< HEAD
		Druide panoramix = new Druide("Panoramix",0,9);
		panoramix.preparerPotion();
=======
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();

>>>>>>> 59c2b2eccf13b5bdf902170ce7964d60061c5141
	}
}

