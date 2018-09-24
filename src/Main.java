import java.util.Scanner;

public class Main{
	
	private static Scanner clavier;
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		clavier = new Scanner(System.in);
		
		
		/* --- DECLARATION --- */
		
		//une nouvelles ville
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
		/*
		 * Voici le deuxieme commentaire 
		 * pour utiliser github desktop
		 */
			
		/*Hey, mgl je t'ais ajouté un de ces commentaire du turfu mamen*/
		
		/*C'est Lolo
		Je bois de l'Ice Tea quand j'suis fons-dé
		J'pisse sur le commissariat des condés
		Ouais, j'reviens dans le bizz, c'est comment?
		Jeune drogué, passe ta commande
		J'suis en cavale un peu tout le temps
		J'vois des albums de merde se vendre
		Toutes mes putes me demandent "mais c'est qui ta besta?"
		Des turlutes sur demande, señora que pasa?
		En bagarre y'a mon sexe en guise de troisième bras
		Plusieurs sur la bête comme à la corrida
		J'manie l'chibre comme Zorro
		Mes pecs dansent le flamenco
		Lolo l'empereur du sale, dans le deal on m'surnomme Joe La Crapule
		La came y'en a des kilos
		Distribuée en traîneau
		Pour remuer ton cul dans mon clip, faut qu'tu postules
		Sur le périph' en booster, ça s'amuse, à semer la B.A.C
		Une vodka Cacolac avec une Bernadette comme Jacques Chirac
		J'baise aussi les moches
		Ouais, ouais, j'fais preuve de charité
		Sur mes couilles, étale noisettes de beurre de karité
		Trop de rodéo, j'repose les guibolles
		J'ai pas été à l'école
		Les flic attaquent avec des sex-toys
		J'ai appris à lire sur ma GameBoy
		Si j'connais ta meuf, ça veut dire qu't'es cocu
		Peau de bébé dans mon slip quand le sexe est tondu
		Je snap des femmes à poil pour vous donner d'l'actu
		J'vends des médocs pilés et du plastique fondu
		Y'a un pack de douze à coté du cadavre dans le coffre
		Pourquoi t'étais Charlie mais t'étais pas Jean-Pierre Coffe
		Ça sniffe tellement la coke, mes crottes de nez c'est d'la MD
		J'déteste juste les keufs, j'aime bien les obèses et les pédés
		Mamène finira dans le dico'
		J'ai qu'un reuf, le poto Rico
		Ça rotte-ca l'argent des clodos
		C'est moi qu'écrit tous les pornos
		Cite-moi en contrôle de philo'
		Toutes les miss grimpent aux rideaux
		Dans ton cul, j'éteins mes mégots
		Suce mes s7abs, même s'ils sont pas beaux*/
	
			
	}
		
}
