package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public String prendreParole() {
		return "Le Gaulois "+ nom+ " : ";
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + " “ " + texte + " ”");
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom() );
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est "+this.effetPotion+" fois décuplée !");
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("minus",5);
		System.out.println("Le gaulois " + asterix.getNom() + " vient d'etre cree.");
		asterix.parler("Bonjour");
		asterix.boirePotion(5);
		asterix.frapper(minus);
	}
}
