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
		Pays lePays = new Pays("Allemagne", "allemand", "Euro �");*/
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
								+ "\n1 - Pr�sentation des Pays"
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
								System.out.println("Quel est le nom du Pays recherch� ?");
								String leNom = clavier.nextLine();
								
								//Lancer la recherche
								System.out.println(unContinent.rechercherUnPays(leNom));
								
								break;
								
							case 4 :
								/* --- SUPPRIMER UN PAYS --- */
								//Questions
								System.out.println("Quel est le nom du Pays � supprim� ?");
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
							+ "\n1 - Pr�sentation des Villes"
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
							
							System.out.println("Quel est la superficie en km� de la ville ?");
							double uneSuperficie = clavier.nextFloat();
							
							//Ajouter la ville
							uneVille = new Ville(unNom, nbHabitant ,uneSuperficie, unPays);
							unPays.ajouterUneVille(uneVille);
							
							break;
							
						case 3 :
							/* --- RECHERCHER UNE VILLE --- */
							//Questions 
							System.out.println("Quel est le nom du Pays recherch� ?");
							String leNom = clavier.nextLine();
							
							//Lancer la recherche
							System.out.println(unContinent.rechercherUnPays(leNom));
							
							break;
							
						case 4 :
							/* --- SUPPRIMER UNE VILLE --- */
							//Questions
							System.out.println("Quel est le nom de la � supprim� ?");
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
			
		/*Hey, mgl je t'ais ajout� un de ces commentaire du turfu mamen*/
		
		/*C'est Lolo
		Je bois de l'Ice Tea quand j'suis fons-d�
		J'pisse sur le commissariat des cond�s
		Ouais, j'reviens dans le bizz, c'est comment?
		Jeune drogu�, passe ta commande
		J'suis en cavale un peu tout le temps
		J'vois des albums de merde se vendre
		Toutes mes putes me demandent "mais c'est qui ta besta?"
		Des turlutes sur demande, se�ora que pasa?
		En bagarre y'a mon sexe en guise de troisi�me bras
		Plusieurs sur la b�te comme � la corrida
		J'manie l'chibre comme Zorro
		Mes pecs dansent le flamenco
		Lolo l'empereur du sale, dans le deal on m'surnomme Joe La Crapule
		La came y'en a des kilos
		Distribu�e en tra�neau
		Pour remuer ton cul dans mon clip, faut qu'tu postules
		Sur le p�riph' en booster, �a s'amuse, � semer la B.A.C
		Une vodka Cacolac avec une Bernadette comme Jacques Chirac
		J'baise aussi les moches
		Ouais, ouais, j'fais preuve de charit�
		Sur mes couilles, �tale noisettes de beurre de karit�
		Trop de rod�o, j'repose les guibolles
		J'ai pas �t� � l'�cole
		Les flic attaquent avec des sex-toys
		J'ai appris � lire sur ma GameBoy
		Si j'connais ta meuf, �a veut dire qu't'es cocu
		Peau de b�b� dans mon slip quand le sexe est tondu
		Je snap des femmes � poil pour vous donner d'l'actu
		J'vends des m�docs pil�s et du plastique fondu
		Y'a un pack de douze � cot� du cadavre dans le coffre
		Pourquoi t'�tais Charlie mais t'�tais pas Jean-Pierre Coffe
		�a sniffe tellement la coke, mes crottes de nez c'est d'la MD
		J'd�teste juste les keufs, j'aime bien les ob�ses et les p�d�s
		Mam�ne finira dans le dico'
		J'ai qu'un reuf, le poto Rico
		�a rotte-ca l'argent des clodos
		C'est moi qu'�crit tous les pornos
		Cite-moi en contr�le de philo'
		Toutes les miss grimpent aux rideaux
		Dans ton cul, j'�teins mes m�gots
		Suce mes s7abs, m�me s'ils sont pas beaux*/
	
			
	}
		
}
