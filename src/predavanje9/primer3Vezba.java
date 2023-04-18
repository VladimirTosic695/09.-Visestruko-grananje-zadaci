package predavanje9;

import java.util.Scanner;

public class primer3Vezba {

	public static void main(String[] args) {
		// Za unetu kategoriju vozačke dozvole, 
		// ispisati kojom vrstom vozila je moguće upravljati.(SWITCH-CASE)
		
		Scanner sc = new Scanner(System.in);
		char vozacka;
		System.out.println("Unesite kategoriju vozacke dozvole.");
		vozacka = sc.next().charAt(0);
		sc.close();
		
		switch (vozacka) {
		case 'A','a':{
			System.out.println("Sa vozackom dozvolom "+vozacka+" kategorije, mozete upravljati motorom.");
		break;
		}
		case 'B','b':{
			System.out.println("Sa vozackom dozvolom "+vozacka+" kategorije, mozete upravljati autom.");
		break;	
		}
		case 'C','c':{
			System.out.println("Sa vozackom dozvolom "+vozacka+" kategorije, mozete upravljati autom i kamionom.");
			break;
		}
		case 'D','d':{
			System.out.println("Sa vozackom dozvolom "+vozacka+" kategorije, mozete upravljati autom, kamionom i autobusom.");
			break;
		}
		case 'E','e': {
			System.out.println("Sa vozackom dozvolom "+vozacka+" kategorije, mozete upravljati autom i kamionom sa prikolicom.");
			break;
		}	
		default:
			System.out.println("Unesite ponovo kategoriju vozacke dozvole.");

		}	
	}

}
