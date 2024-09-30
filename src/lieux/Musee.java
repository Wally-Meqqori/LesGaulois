package lieux;

import personnages.Gaulois;
import personnages.Equipement;
import java.util.Arrays;
import objet.Trophee;


public class Musee {
	private Trophee [] trophee = new Trophee[200];
	private int nbTrophee = 0;
	
	@Override
	public String toString() {
		return "Musee [trophee=" + Arrays.toString(trophee) + ", nbTrophee=" + nbTrophee + "]";
	}


	public void donnerTrophee(Gaulois gaulois,Equipement equipement) {
		if(this.nbTrophee < this.trophee.length) {
			this.trophee[this.nbTrophee] = new Trophee(gaulois, equipement);
			this.nbTrophee++;
		}
		
	}

	
	public String extraireInstructionsCaml() {
		StringBuilder resultBuilder = new StringBuilder();
		resultBuilder.append("let musee = [ ");
		
		for(int i = 0; i < this.nbTrophee; i++) {
			resultBuilder.append("(\"" + this.trophee[i].donnerNom() + "\", \"" + this.trophee[i].getEquipement() + "\")");
			if(i < this.nbTrophee-1) { resultBuilder.append("; "); }
		}
		
		resultBuilder.append(" ] ;;");
		System.out.println(resultBuilder);
		return resultBuilder.toString();
	}
}
