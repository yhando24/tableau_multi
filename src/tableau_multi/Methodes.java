package tableau_multi;


public class Methodes {
//	METHODE QUI REMPLI UN TABLEAU A UNE DIMENSION
	
	public static void remplirtableau(int tab []) {
		for (int i = 0; i<tab.length; i++) {
			tab[i]=0;
		}
	
	}
	
//	METHODE QUI REMPLI UN TABLEAU A DEUX DIMENSION
	
	public static void remplirtableaux(int tab [] []) {
		for (int i = 0; i<tab.length; i++) {
			for(int y =0; y<tab[i].length; y++) {
				tab[i][y]=0;
			}
		}
	}
	
//	METHODE QUI AFFICHE UN TABLEAU A UNE DIMENSION
	
	public static void affichetableau(int tab []) {
		for (int i = 0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
	
//	METHODE QUI AFFICHE UN TABLEAU A DEUX DIMENSION
	
	public static void affichetableaux(int tab [] []) {
		for (int i = 0; i<tab.length; i++) {
			for(int y =0; y<tab[i].length; y++) {			
				System.out.print(tab[i][y]);
			}
			System.out.println(" ");
		}
	}
//	METHODE QUI CREE LE TABLEAU DE DAME
	
	public static int[][] init() {
		int [][] damier = new int [10][10];
		for (int i = 0; i<damier.length; i++) {
			for(int y =0; y<damier[i].length; y++) {
				damier[i][y]=0;
			}
		}
		return damier;
	}
	
//	METHODE QUI DEPLACE LE PIONT
	public static int[][] placerPiont(int damier [][], int ligne, int colonne) {
		remplirtableaux(damier);
	  damier[ligne][colonne] = 1;
	  return damier;
		
		
	}

}
