
public class Ville {

	/* --- ATTRIBUTS --- */
		private String nom;
		private int nbHabitants;
		private double superficie;
		//Autre
		private Pays sonPays;
	
	/* --- CONSTRUCTEURS --- */
		public Ville(){
			
		}
		
		
		public Ville(String unNom, int unNbHabitant, double uneSuperficie, Pays unPays){
			this.nom = unNom;
			this.nbHabitants = unNbHabitant;
			this.superficie = uneSuperficie;
			this.sonPays = unPays;
			this.sonPays.ajouterUneVille(this);
			
		}

	
	
	/* --- ACCESSEURS --- */

		//Nom
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}
		
		//Nb Habitants
		public int getNbHabitants() {
			return nbHabitants;
		}

		public void setNbHabitants(int nbHabitants) {
			this.nbHabitants = nbHabitants;
		}

		//Superficie
		public double getSuperficie() {
			return superficie;
		}

		public void setSuperficie(double superficie) {
			this.superficie = superficie;
		}
		
		//sonPays
		public Pays getSonPays() {
			return sonPays;
		}

		public void setSonPays(Pays sonPays) {
			this.sonPays = sonPays;
		}
		

	/* --- METHODES --- */
		//to String
		public String toString(){
			String chaine = "";
				
				if(this.nom != null){
					chaine = chaine + "Nom : " + this.nom + "\n";
				}
				if(this.nbHabitants != 0){
					chaine = chaine + "Le nombre d'habitant : " + this.nbHabitants + "\n";
				}
				if(this.superficie != 0){
					chaine = chaine + "La superfice est de : " + this.superficie + "km² \n\n";
				}
				if(this.sonPays != null){
					chaine = chaine + sonPays.toString();
				}
			
			
			return chaine;
		}
	
}
