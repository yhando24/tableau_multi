package tableau_multi;
import java.util.Scanner;

public class Exercice_5 {

	public static void main(String[] args) {
//		EXERCICE 5 :
	
	
	int [][] notes = new int [4][3];
	
	Scanner sc = new Scanner(System.in);
	
	// SAISIE DES NOTES :
	
	for(int i = 0; i<notes.length; i++) {
		if(i==0) {
			System.out.println("Vous allez saisir les notes obtenues en Maths");
		}
		if(i==1) {
			System.out.println("Vous allez maintenant saisir les notes obtenues en Francais");
		}
		if(i==2) {
			System.out.println("Vous allez pour terminer saisir les notes obtenues en Anglais");
		}
		if(i==3) {
			System.out.println("Vous allez pour terminer saisir les notes obtenues en G�ographie");
		}
		for(int y = 0; y<notes[i].length; y++) {
			System.out.println("Veuillez saisir la note numero : " + (y+1));
			notes[i][y]= sc.nextInt();
		}
	}	
	
	// AFFICHAGE DE LA MOYENNE :
	int moyenne = 0;
	int moyenneMaths = 0;
	int moyenneFrancais = 0;
	int moyenneAnglais = 0;
	int moyennegeographie = 0;
	for(int i = 0; i<notes.length; i++) {

			if(i == 0) {
				for(int y = 0; y<notes[i].length; y++) {
				
					moyenne += notes[i][y];
					
				}
				 moyenneMaths = moyenne/notes[i].length;
				System.out.println("moyenne de l'eleve en maths : " + (moyenne/notes[i].length));
			}
			if(i == 1) {
				moyenne = 0;
				for(int y = 0; y<notes[i].length; y++) {
			
					moyenne += notes[i][y];
					
				}
				moyenneFrancais = moyenne/notes[i].length;
				System.out.println("moyenne de l'eleve en Francais : " + (moyenne/notes[i].length));
			}
			if(i == 2) {
				moyenne = 0;
				for(int y = 0; y<notes[i].length; y++) {
		
					moyenne += notes[i][y];
	
				}
				moyenneAnglais = moyenne/notes[i].length;
				System.out.println("moyenne de l'eleve en Anglais : " + (moyenne/notes[i].length));
			}
			if(i == 3) {
				moyenne = 0;
				for(int y = 0; y<notes[i].length; y++) {
			
					moyenne += notes[i][y];
			
				}
				moyennegeographie = moyenne/notes[i].length;
				System.out.println("moyenne de l'eleve en Géographie : " + (moyenne/notes[i].length));
			}

	}
	
	// AFFICHAGE DE LA MOYENNE GENERALE:
	System.out.println("Moyenne générale de l'eleve : " + ((moyenneMaths+moyenneFrancais+moyenneAnglais+moyennegeographie)/4));
	

	}

}
