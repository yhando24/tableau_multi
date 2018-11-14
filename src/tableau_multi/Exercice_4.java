package tableau_multi;

public class Exercice_4 {


	public static void main(String[] args) {
		
//		EXERCICE 4 :

		int[][] tab = new int [6][13];
		int max = Integer.MIN_VALUE;
		
		// on rempli le tableau de 0.
		Methodes.remplirtableaux(tab);
		
		// on met la valeur maximum a trouver ensuite.
		tab[4][12] = 24;
		
		for(int i = 0; i<tab.length; i++) {
			for(int y = 0; y<tab[i].length; y++) {
				if(tab[i][y]>max) {
					max = tab[i][y];
				}
			}
		}
		System.out.println("Le chiffre maximum est bien de " + max);

	}
}
