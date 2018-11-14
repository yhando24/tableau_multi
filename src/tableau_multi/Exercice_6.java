package tableau_multi;
import java.util.Scanner;

public class Exercice_6 {


	public static void main(String[] args) {
		
		
//		EXERCICE 6 :
		

		
	Scanner sc = new Scanner(System.in);
	
	
	
	int [][] damier = Methodes.init();

	boolean mouvementOk = true;
	
		System.out.println("Bienvenue dans le jeu de dames. Ou voulez vous posez votre pion? Veuillez choisir votre ligne ");
		int positionLignePion = sc.nextInt();
		System.out.println("Bien... et votre colonne maintenant");
		int positionColonnePion = sc.nextInt();
		
		
		// on enleve 1 sachant que la premiere ligne pour le client n'est pas de 1 mais de 0
		positionLignePion -= 1;
		positionColonnePion -= 1;
		Methodes.placerPiont(damier, (positionLignePion),(positionColonnePion) );
	
		Methodes.affichetableaux(damier);
		while(mouvementOk == true) {
			
		
		System.out.println("Bien... Allons voyager. Quel est votre destination : ");
				System.out.println("- 0 pour aller en haut a gauche");
				System.out.println("- 1 pour aller en haut a droite");
				System.out.println("- 2 pour aller en bas a gauche");
				System.out.println("- 3 pour aller en bas a droite");
				System.out.println("- 4 pour quitter le jeu");

		int mouvement = sc.nextInt();
		
		switch (mouvement) {
		
				case 0 : 
					
					// deplacement en haut a gauche
			
					positionLignePion = ((positionLignePion +9) % 10);
					positionColonnePion = ((positionColonnePion +9) % 10);
					Methodes.placerPiont(damier, (positionLignePion) ,positionColonnePion);
				
					break;
					
				case 1 : 
				
					// deplacement en haut a droite
					positionLignePion = ((positionLignePion +9) % 10);
					positionColonnePion = ((positionColonnePion +11) % 10);
					Methodes.placerPiont(damier, (positionLignePion) ,positionColonnePion);
					break;
				
				case 2 : 
					
					// deplacement en bas a droite
					
					positionLignePion = ((positionLignePion +11) % 10);
					positionColonnePion = ((positionColonnePion +9) % 10);
					Methodes.placerPiont(damier, (positionLignePion) ,positionColonnePion);
					break;
					
					// deplacement en bas a gauche
				case 3 : 
		
					positionLignePion = ((positionLignePion +11) % 10);
					positionColonnePion = ((positionColonnePion +11) % 10);
					Methodes.placerPiont(damier, (positionLignePion) ,positionColonnePion);
					break;
	
				case 4 : 	mouvementOk = false;
							break;
				
				default :System.out.println("Mauvais choix, veuillez recommencer");
			}
		Methodes.affichetableaux(damier);

		}
		
		if(mouvementOk==false) {
			System.out.println("Merci d'avoir joué !");
			}
		}

}
