package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if(nbVillageois < villageois.length) {
			this.villageois[nbVillageois] = gaulois;
			this.nbVillageois ++;
		}
		else {
			System.out.println("Le village est plein.");
		}
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
			return this.villageois[numVillageois-1];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+ this.chef.getNom() + " vivent les légendaires gaulois :");
		for(int i = 0 ; i < this.nbVillageois;i++) {
			System.out.println("- " + villageois[i].getNom());
		}
		
	}
	public void setChef(Chef chef){
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	public static void main(String[] args) {
		Village village = new Village("Village des irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30)
		//Erreur car 30 est un indice en dehors du tableau
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",25);
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//Cela affiche la référence de notre gaulois ajouté auparavant, soit Astérix.
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}