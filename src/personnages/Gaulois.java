package personnages;
import lieux.Musee;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbTrophees;
	private Equipement []trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

//	public String prendreParole() {
//		return "Le Gaulois "+ nom+ " : ";
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effetPotion);
//
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] ttrophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; ttrophees != null && i < ttrophees.length; i++, nbTrophees++) {
			trophees[nbTrophees] = ttrophees[i];
		}
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est "+this.effetPotion+" fois décuplée !");
	}

	public void faireUneDonation(Musee musee) {
	    if (this.nbTrophees > 0) {
	        StringBuilder texte = new StringBuilder();
	        texte.append("Je donne au musée tous mes trophées :");

	        for (int i = 0; i < this.nbTrophees; i++) {
	            if (this.trophees[i] != null) { 
	                texte.append("\n - ").append(this.trophees[i]);
	                musee.donnerTrophee(this, this.trophees[i]);
	            }
	        }

	        this.parler(texte.toString());
	    } else {
	        this.parler("Je n'ai aucun trophée à donner.");
	    }
	}

	
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",6);

		System.out.println("Le gaulois " + asterix.getNom() + " vient d'être créé.");
		asterix.parler("Bonjour");
		asterix.boirePotion(5);
		asterix.frapper(minus);

	}
}
