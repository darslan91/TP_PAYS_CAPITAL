
import java.util.ArrayList;


public class Continent {

	/* --- ATTRIBUT --- */
	private String nom;
	private ArrayList<Pays> lesPays;
	
	
	/* --- CONSTRUCTEURS --- */
	public Continent(){
		this.lesPays = new ArrayList<Pays>();
	}
	
	public Continent(String unNom){
		this.nom = unNom;
		this.lesPays = new ArrayList<Pays>();
	}

	
	/* --- ACCESSEURS --- */
		//Nom
		public String getNom() {
			return nom;
		}
	
		public void setNom(String nom) {
			this.nom = nom;
		}
	
	
	
	/* --- METHODES --- */
		//Présentation
		public String toString(){
			String uneChaine = "";
			
			if(this.nom != null){
				uneChaine = uneChaine + "Nom du Continent : " + this.nom + "\n";
			}
			if(this.lesPays != null){
				for(int i = 0 ; i < this.lesPays.size() ; i++){
					uneChaine = uneChaine + this.lesPays.get(i).toString();
				}
				//System.out.println("tableau vide");
			}
			else{
				uneChaine = uneChaine + "Aucun élément entrer \n"; 
			}
			
			return uneChaine;
		}
		
		
		//Ajouter un Pays
		public void ajouterUnPays(Pays unPays){
			this.lesPays.add(unPays);
			//this.nbElement = this.nbElement + 1 ;
		}
		
		
		//Recherche un Pays
		public boolean rechercherUnPays(String unNom){
					
			//Déclaration et initialisation des variables
			//Ville uneVille = null;
			int i = 0;
			boolean trouver = false;
					
			//recherche
			while (i < this.lesPays.size() && trouver != true){
				//System.out.println("while");
				if(this.lesPays.get(i).getNom().equals(unNom)){
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
		
		
		//Supprimer un Pays
				public boolean supprimerPays(String unNom){
					int i = 0;
					boolean trouver = false;
					
					//recherche
					while (i <= this.lesPays.size() && trouver != true){
						//System.out.println("while");
						if(this.lesPays.get(i).getNom().equals(unNom)){
							//System.out.println("if");
							trouver = true;
							this.lesPays.remove(i);
							//uneVille = this.lesVilles.get(i);
						}
						i = i + 1;
						//System.out.println("pas de ville dans le tableau !");
					}
					//System.out.println(" fin while");
					
					return trouver;
				}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
}
