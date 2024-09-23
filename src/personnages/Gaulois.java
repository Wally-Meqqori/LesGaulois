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
		System.out.println(prendreParole() + " ‚Äú " + texte + " ‚Äù");
	}

	public void frapper(Romain romain) {
<<<<<<< HEAD
		System.out.println(nom + " envoie un grand coup dans la m‚choire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
=======
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom() );
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est "+this.effetPotion+" fois d√©cupl√©e !");
>>>>>>> 59c2b2eccf13b5bdf902170ce7964d60061c5141
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois dÈcuplÈe !");
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
<<<<<<< HEAD
		Romain minus = new Romain("Minus",6);
		System.out.println("Le gaulois " + asterix.getNom() + " vient d'Ítre crÈÈ.");
		asterix.parler("Bonjour");
		asterix.frapper(minus);
		asterix.boirePotion(5);
=======
		Romain minus = new Romain("minus",5);
		System.out.println("Le gaulois " + asterix.getNom() + " vient d'etre cree.");
		asterix.parler("Bonjour");
		asterix.boirePotion(5);
		asterix.frapper(minus);
>>>>>>> 59c2b2eccf13b5bdf902170ce7964d60061c5141
	}
}
