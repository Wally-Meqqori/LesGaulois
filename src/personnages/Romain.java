package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0 : "La force doit être positive.";
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() +"« " +texte + " »");
	}
	
	private String prendreParole() {
		return  "Le Romain " + nom + " : " ;
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
	

	private void  ajouterEquipement(Equipement nouveauEquipement) {
		equipement[nbEquipement] = nouveauEquipement;
		nbEquipement ++;
		System.out.println("Le soldat "+ this.nom + " s'equipe avec un " + nouveauEquipement +".");
	}
	
	public void sEquiper(Equipement nouveauEquipement) {
		
		switch (this.nbEquipement) {
			case 0 :
				ajouterEquipement(nouveauEquipement);
				break;
			case 1 :
				if(equipement[0] == nouveauEquipement) {
					System.out.println("Le soldat " + this.nom + " possède déjà un " + nouveauEquipement +" !" );
				}
				else {
					ajouterEquipement(nouveauEquipement);
				}
				break;
			case 2 : 
				System.out.println("Le soldat " + this.nom + " est déjà bien protégé.");
				break;
		}
	}
	
	public static void main(String[] args) {
		Romain minus  = new Romain("Minus",6);
		System.out.println("Le Romain " + minus.getNom() + " vient d'etre cree.");
		Equipement bouclier = Equipement.BOUCLIER;
		Equipement casque = Equipement.CASQUE;
		minus.sEquiper(casque);
		minus.sEquiper(casque);
		minus.sEquiper(bouclier);
		minus.sEquiper(bouclier);
	}
}

