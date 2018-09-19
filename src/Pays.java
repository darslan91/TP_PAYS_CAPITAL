
import java.util.ArrayList;

public class Pays {
	
	/* --- ATTRIBUTS --- */
	/**
	 * 
	 */
		final static int MAX = 3;
		private String nom;
		private String langue;
		private String monnaie;
		private static int compteurPays;
		private Capitale saCapital;
		private ArrayList<Ville> lesVilles;
		//private Ville[] lesVilles;
		//private int nbElement;
		

	/* --- CONSTRUCTEUR --- */
		//Constructeur vide
		/**
		 * 
		 */
		public Pays(){
			//this.nbElement = 0;
			compteurPays = compteurPays + 1;
			this.lesVilles = new ArrayList<Ville>();
			//lesVilles = new Ville[MAX];
		}
		
		//Constructeur complet
		/**
		 * 
		 * @param unNom
		 * @param uneLangue
		 * @param uneMonnaie
		 * @param uneCapital
		 */
		public Pays(String unNom, String uneLangue, String uneMonnaie){
			this.nom = unNom;
			this.langue = uneLangue;
			this.monnaie = uneMonnaie;
			this.saCapital = new Capitale("Paris" , 2244000 , 105.4 , new Pays());
			//this.nbElement = 0;
			this.lesVilles = new ArrayList<Ville>();
			//lesVilles = new Ville[MAX];
			compteurPays = compteurPays + 1;	
		}	
		
		//Constructuer nom
		/**
		 * 
		 * @param unNom
		 */
		public Pays(String unNom){
			this.nom = unNom;
			compteurPays = compteurPays+1;
		}



		/* --- ACCESSEURS --- */
		//Nom
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		//Langue
		public String getLangue() {
			return langue;
		}

		public void setLangue(String langue) {
			this.langue = langue;
		}

		//Monnaie
		public String getMonnaie() {
			return monnaie;
		}

		public void setMonnaie(String monnaie) {
			this.monnaie = monnaie;
		}

		
		//Compteur Pays
		public static int getCompteurPays() {
			return compteurPays;
		}

		public static void setCompteurPays(int compteurPays) {
			Pays.compteurPays = compteurPays;
		}
		
		//saCapitale
		public Capitale getSaCapital() {
			return saCapital;
		}

		public void setSaCapital(Capitale saCapital) {
			this.saCapital = saCapital;
		}
		
		//lesVilles
		/*public Ville[] getLesVilles() {
			return lesVilles;
		}

		public void setLesVilles(Ville[] lesVilles) {
			this.lesVilles = lesVilles;
		}*/
		
		//nbElements
		/*public int getNbElement() {
			return nbElement;
		}

		public void setNbElement(int nbElement) {
			this.nbElement = nbElement;
		}*/
		
	/* --- METHODES --- */
		//to String
		public String toString(){
			String uneChaine = "";
			
			if(this.nom != null){
				uneChaine = uneChaine + "Le nom du PAYS :" + this.nom + "\n";
			}
			if(this.langue != null){
				uneChaine = uneChaine + "La langue parlée :" + this.langue + "\n";
			}
			if(this.monnaie != null){
				uneChaine = uneChaine + "La monnaie du PAYS :" + this.monnaie + "\n";
			}
			if(this.saCapital != null){
				uneChaine =  uneChaine + saCapital.toString()+"\n";
			}
			if(this.lesVilles != null){
				for(int i = 0 ; i < this.lesVilles.size() ; i++){
					uneChaine = uneChaine + this.lesVilles.get(i).toString();
				}
				//System.out.println("tableau vide");
			}
			else{
				uneChaine = uneChaine + "Aucun élément entrer \n"; 
			}
			
			return uneChaine;
			
		}
		
		//Ajouter une Ville
		public void ajouterUneVille(Ville uneVille){
			this.lesVilles.add(uneVille);
			//this.nbElement = this.nbElement + 1 ;
		}
		
		
		//Recherche une Ville
		public boolean rechercherUneVille(String unNom){
			
			//Déclaration et initialisation des variables
			//Ville uneVille = null;
			int i = 0;
			boolean trouver = false;
			
			//recherche
			while (i < this.lesVilles.size() && trouver != true){
				//System.out.println("while");
				if(this.lesVilles.get(i).getNom().equals(unNom)){
					//System.out.println("if");
					trouver = true;
					//uneVille = this.lesVilles.get(i);
				}
				
				else{
					i = i + 1;
				}
				//System.out.println("pas de ville dans le tableau !");
			}
			//System.out.println(" fin while");
			
			return trouver;
			
		}
		
		//Supprimer une ville
		public boolean supprimerVille(String unNom){
			int i = 0;
			boolean trouver = false;
			
			//recherche
			while (i <= this.lesVilles.size() && trouver != true){
				//System.out.println("while");
				if(this.lesVilles.get(i).getNom().equals(unNom)){
					//System.out.println("if");
					trouver = true;
					this.lesVilles.remove(i);
					//uneVille = this.lesVilles.get(i);
				}
				i = i + 1;
				//System.out.println("pas de ville dans le tableau !");
			}
			//System.out.println(" fin while");
			
			return trouver;
		}	
			
		
}