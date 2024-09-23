package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0 : "La force doit être positive.";
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() +" " +texte + " ");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert this.force > 0 : "La force du Romain doit être positive";
		int forceInitiale = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert forceInitiale > force : "La force doit diminuer";
	}
	
	
	public static void main(String[] args) {
		Romain minus  = new Romain("Minus",6);
		System.out.println("Le romain " + minus.getNom() + " vient d'etre cree.");
		minus.parler("Bonjour");
		minus.recevoirCoup(2);
		minus.recevoirCoup(4);
	}
}

