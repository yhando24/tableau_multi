



import java.util.Scanner;

public class TableauMulti {

	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
////		EXERCICE 1 :
		
//			int[][] tableaumulti = new int [6][13];
//			// on rempli le tableau de 0.
//			Methodes.remplirtableaux(tableaumulti);
//	
//	
//// 		EXERCICE 4 :
//	
//			int[][] tab = new int [6][13];
//			int max = Integer.MIN_VALUE;
//			
//			// on rempli le tableau de 0.
//			Methodes.remplirtableaux(tab);
//			
//			// on met la valeur maximum a trouver ensuite.
//			tab[4][12] = 24;
//			
//			for(int i = 0; i<tab.length; i++) {
//				for(int y = 0; y<tab[i].length; y++) {
//					if(tab[i][y]>max) {
//						max = tab[i][y];
//					}
//				}
//			}
//			System.out.println("Le chiffre maximum est bien de " + max);
//			
////	 		EXERCICE 5 :
//			
//			
//			int [][] notes = new int [4][3];
//			
//			
//			// SAISIE DES NOTES :
//			
//			for(int i = 0; i<notes.length; i++) {
//				if(i==0) {
//					System.out.println("Vous allez saisir les notes obtenues en Maths");
//				}
//				if(i==1) {
//					System.out.println("Vous allez maintenant saisir les notes obtenues en Francais");
//				}
//				if(i==2) {
//					System.out.println("Vous allez pour terminer saisir les notes obtenues en Anglais");
//				}
//				if(i==3) {
//					System.out.println("Vous allez pour terminer saisir les notes obtenues en G�ographie");
//				}
//				for(int y = 0; y<notes[i].length; y++) {
//					System.out.println("Veuillez saisir la note numero : " + (y+1));
//					notes[i][y]= sc.nextInt();
//				}
//			}	
//			
//			// AFFICHAGE DE LA MOYENNE :
//			int moyenne = 0;
//			int moyenneMaths = 0;
//			int moyenneFrancais = 0;
//			int moyenneAnglais = 0;
//			int moyennegeographie = 0;
//			for(int i = 0; i<notes.length; i++) {
//		
//					if(i == 0) {
//						for(int y = 0; y<notes[i].length; y++) {
//						
//							moyenne += notes[i][y];
//							
//						}
//						 moyenneMaths = moyenne/notes[i].length;
//						System.out.println("moyenne de l'eleve en maths : " + (moyenne/notes[i].length));
//					}
//					if(i == 1) {
//						moyenne = 0;
//						for(int y = 0; y<notes[i].length; y++) {
//					
//							moyenne += notes[i][y];
//							
//						}
//						moyenneFrancais = moyenne/notes[i].length;
//						System.out.println("moyenne de l'eleve en Francais : " + (moyenne/notes[i].length));
//					}
//					if(i == 2) {
//						moyenne = 0;
//						for(int y = 0; y<notes[i].length; y++) {
//				
//							moyenne += notes[i][y];
//			
//						}
//						moyenneAnglais = moyenne/notes[i].length;
//						System.out.println("moyenne de l'eleve en Anglais : " + (moyenne/notes[i].length));
//					}
//					if(i == 3) {
//						moyenne = 0;
//						for(int y = 0; y<notes[i].length; y++) {
//					
//							moyenne += notes[i][y];
//					
//						}
//						moyennegeographie = moyenne/notes[i].length;
//						System.out.println("moyenne de l'eleve en Géographie : " + (moyenne/notes[i].length));
//					}
//		
//			}
//			System.out.println("Moyenne générale de l'eleve : " + ((moyenneMaths+moyenneFrancais+moyenneAnglais+moyennegeographie)/4));
			

			// EXERCICE 6
			
	
		int [][] damier = Methodes.init();

		boolean mouvementOk = true;
		
			System.out.println("Bienvenue dans le jeu de dames. Ou voulez vous posez votre pion? Veuillez choisir votre ligne ");
			int positionLignePion = sc.nextInt();
			System.out.println("Bien... et votre colonne maintenant");
			int positionColonnePion = sc.nextInt();
	
			Methodes.placerPiont(damier, (positionLignePion-1),(positionColonnePion-1) );
			positionLignePion -= 1;
			positionColonnePion -= 1;
			Methodes.affichetableaux(damier);
			while(mouvementOk = true) {
				
			
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
						System.out.println("position ligne : " + positionLignePion );
						System.out.println("position colonne : " + positionColonnePion );
						Methodes.placerPiont(damier, (positionLignePion) ,positionColonnePion);
					
						break;
						
					case 1 : 
					
						// deplacement en haut a droite
						positionLignePion = ((positionLignePion +9) % 10);
						positionColonnePion = ((positionColonnePion +11) % 10);
						Methodes.placerPiont(damier, (positionLignePion) ,positionColonnePion);
						System.out.println("position ligne : " + positionLignePion );
						System.out.println("position colonne : " + positionColonnePion );
						break;
					
					case 2 : 
						
						// deplacement en bas a droite
						
						positionLignePion = ((positionLignePion +11) % 10);
						positionColonnePion = ((positionColonnePion +9) % 10);
						Methodes.placerPiont(damier, (positionLignePion) ,positionColonnePion);
						System.out.println("position ligne : " + positionLignePion );
						System.out.println("position colonne : " + positionColonnePion );
						break;
						
						// deplacement en bas a gauche
					case 3 : 
			
						positionLignePion = ((positionLignePion +11) % 10);
						positionColonnePion = ((positionColonnePion +11) % 10);
						Methodes.placerPiont(damier, (positionLignePion) ,positionColonnePion);
						
						System.out.println("position ligne : " + positionLignePion );
						System.out.println("position colonne : " + positionColonnePion );
						break;
					case 4 : 	mouvementOk = false;
					break;
					
					default :System.out.println("Mauvais choix, veuillez recommencer");
				}
			Methodes.affichetableaux(damier);

			}
	}
}