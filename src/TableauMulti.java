



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

			System.out.println("Bienvenue dans le jeu de dames. Ou voulez vous posez votre pion? Veuillez choisir votre ligne ");
			int positionLignePion = sc.nextInt();
			System.out.println("Bien... et votre colonne maintenant");
			int positionColonnePion = sc.nextInt();
		
			Methodes.placerPiont(damier, positionLignePion,positionColonnePion );
			Methodes.affichetableaux(damier);

	
			
	}
}