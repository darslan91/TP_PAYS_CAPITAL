import java.util.Scanner;

public class Main{
	
	private static Scanner clavier;
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		clavier = new Scanner(System.in);
		
		
		/* --- DECLARATION --- */
		Ville uneVille;
		/*int nbHabitant;
		float uneSuperficie;
		Pays lePays = new Pays("Allemagne", "allemand", "Euro €");*/
		Continent unContinent = new Continent("Europe");
		Pays unPays = new Pays();
		
		
		int choix;
		int choixP;
		int choixV;
		
		
		do{
			
			System.out.println("\n***** MENU TP PAYS_CAPITALE *****"
					+ "\n1 - MENU PAYS"
					+ "\n2 - MENU VILLE"
					+ "\n0 - QUITTER LE PROGRAMME");
			
			
			System.out.println("Quelle  est votre choix ? ");
			choix = clavier.nextInt();
			clavier.nextLine();
			
			while (choix > 2){
				System.out.println("Se choix n'existe pas, retapez votre choix :");
				choix = clavier.nextInt();
				clavier.nextLine();
			}
			
			
			switch(choix){
			
				case 1 :
					
					do{
						
						/* --- MENU PAYS --- */
						System.out.println("\n***** MENU PAYS *****"
								+ "\n1 - Présentation des Pays"
								+ "\n2 - Ajouter un Pays"
								+ "\n3 - Rechercher un Pays"
								+ "\n4 - Supprimer un Pays"
								+ "\n0 - Quitter");
						
						System.out.println("Quelle  est votre choix ? ");
						choixP = clavier.nextInt();
						clavier.nextLine();
						
						while (choixP > 4){
							System.out.println("Se choix n'existe pas, retapez votre choix :");
							choixP = clavier.nextInt();
							clavier.nextLine();
						}
						
						switch(choixP){
						
							case 1 :
								/* --- PRESENTATION PAYS --- */
								System.out.println(unContinent.toString());
								
								break;
								
							case 2 :
								/* --- AJOUTER UN PAYS --- */
								//Questions
								System.out.println("Quel est le nom du Pays ?");
								String unNom = clavier.nextLine();
								
								System.out.println("Quelle est la langue du Pays ?");
								String uneLangue = clavier.nextLine();
								
								System.out.println("Quelle est la monnaie de ce Pays ?");
								String uneMonnaie = clavier.nextLine();
								
								//Ajouter le pays 
								unPays = new Pays(unNom, uneLangue, uneMonnaie);
								unContinent.ajouterUnPays(unPays);
								
								break;
								
							case 3 :
								/* --- RECHERCHER UN PAYS --- */
								//Questions 
								System.out.println("Quel est le nom du Pays recherché ?");
								String leNom = clavier.nextLine();
								
								//Lancer la recherche
								System.out.println(unContinent.rechercherUnPays(leNom));
								
								break;
								
							case 4 :
								/* --- SUPPRIMER UN PAYS --- */
								//Questions
								System.out.println("Quel est le nom du Pays à supprimé ?");
								String nomSupp = clavier.nextLine();
								
								//Lancement suppression
								
								System.out.println(unContinent.supprimerPays(nomSupp));
								
								break;
								
							case 0 :
								/* --- RETOUR MENU --- */
								System.out.println("Retour Menu principal");
								
								break;
						}
							
					}while(choixP != 0);
					
				break;	
					
					
				case 2 :
					
					/* --- MENU VILLE --- */
					System.out.println("\n***** MENU VILLE *****"
							+ "\n1 - Présentation des Villes"
							+ "\n2 - Ajouter une Ville"
							+ "\n3 - Rechercher une Ville"
							+ "\n4 - Supprimer une Ville"
							+ "\n0 - Quitter");
					
					System.out.println("Quelle  est votre choix ? ");
					choixV = clavier.nextInt();
					clavier.nextLine();
					
					while (choixV > 4){
						System.out.println("Se choix n'existe pas, retapez votre choix :");
						choixV = clavier.nextInt();
						clavier.nextLine();
					}
					
					switch(choixV){
					
						case 1 :
							/* --- PRESENTATION VILLES --- */
							System.out.println(unPays.toString());
							
							break;
							
						case 2 :
							/* --- AJOUTER UNE VILLE --- */
							//Questions
							System.out.println("Quel est le nom de la ville ?");
							String unNom = clavier.nextLine();
							
							System.out.println("Quel est le nombre d'habitants ?");
							int nbHabitant = clavier.nextInt();
							clavier.nextLine();
							
							System.out.println("Quel est la superficie en km² de la ville ?");
							double uneSuperficie = clavier.nextFloat();
							
							//Ajouter la ville
							uneVille = new Ville(unNom, nbHabitant ,uneSuperficie, unPays);
							unPays.ajouterUneVille(uneVille);
							
							break;
							
						case 3 :
							/* --- RECHERCHER UNE VILLE --- */
							//Questions 
							System.out.println("Quel est le nom du Pays recherché ?");
							String leNom = clavier.nextLine();
							
							//Lancer la recherche
							System.out.println(unContinent.rechercherUnPays(leNom));
							
							break;
							
						case 4 :
							/* --- SUPPRIMER UNE VILLE --- */
							//Questions
							System.out.println("Quel est le nom de la à supprimé ?");
							String nomSupp = clavier.nextLine();
							
							//Lancement suppression
							
							System.out.println(unPays.supprimerVille(nomSupp));
							
							break;
							
						case 0 :
							/* --- RETOUR MENU --- */
							System.out.println("Retour Menu principal");
							
							break;
					
						
					}while(choixV != 0);					
					
			break;	
			}		
		
		}while(choix != 0);
			
		

	
			
	}
		
}
