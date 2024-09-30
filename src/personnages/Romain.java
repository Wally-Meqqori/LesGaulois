package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0 : "La force doit être positive.";
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() +"« " +texte + " »");
	}
	
	private String prendreParole() {
		return  "Le Romain " + nom + " : " ;
	}
	
//	public void recevoirCoup(int forceCoup) {
//		assert this.force > 0 : "La force du Romain doit être positive";
//		int forceInitiale = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert forceInitiale > force : "La force doit diminuer";
//	}
	

	private void  ajouterEquipement(Equipement nouveauEquipement) {
		equipements[nbEquipement] = nouveauEquipement;
		nbEquipement ++;
		System.out.println("Le soldat "+ this.nom + " s'equipe avec un " + nouveauEquipement +".");
	}
	
	public void sEquiper(Equipement nouveauEquipement) {
		
		switch (this.nbEquipement) {
			case 0 :
				ajouterEquipement(nouveauEquipement);
				break;
			case 1 :
				if(equipements[0] == nouveauEquipement) {
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
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null)) {
					if(equipements[i].equals(Equipement.CASQUE)) {
						resistanceEquipement += 8;
					} else if(equipements[i].equals(Equipement.BOUCLIER)){
						System.out.println("Equipement casque");
						resistanceEquipement += 5;
					}
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if (forceCoup == 0) {
			return 0;
		}
		else {
			return forceCoup;
		}
	}
	
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + this.nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		int i = 0;
		while(i < nbEquipement) {
			if(equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
			i++;
		}
		return equipementEjecte;
	}
	
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert this.force > 0;
		int oldForce = this.force;
		forceCoup = calculResistanceEquipement(forceCoup);
		this.force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if(this.force == 0) {
			parler("Aïe");
		}else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert this.force < oldForce;
		return equipementEjecte;
			
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

