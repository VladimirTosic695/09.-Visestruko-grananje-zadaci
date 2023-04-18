package predavanje9;

import java.util.Scanner;

public class primer2Vezba {

	public static void main(String[] args) {
		// Za unetu kategoriju vozačke dozvole, 
		// ispisati kojom vrstom vozila je moguće upravljati. (IF ELSE).

		Scanner sc = new Scanner(System.in);
		char vozacka;
		System.out.println("Unesite kategoriju vozacke dozvole.");
		vozacka = sc.next().charAt(0);
		sc.close();
		if(vozacka=='A' || vozacka=='a') 
			System.out.println("Za unetu vozacku "+vozacka+" kategorije, mozete upravljati motorom.");
		 else if (vozacka=='B' || vozacka=='b')
			System.out.println("Za unetu vozacku "+vozacka+" kategorije, mozete upravljati autom.");
		 else if (vozacka=='C' || vozacka=='c')
			 System.out.println("Za unetu vozacku "+vozacka+" kategorije, mozete upravljati autom i kamionom.");
		 else if (vozacka=='D' || vozacka=='d')
			 System.out.println("Za unetu vozacku "+vozacka+" kategorije, mozete upravljati autom, kamionom i autobusom.");
		 else if (vozacka=='E' || vozacka=='e')
			 System.out.println("Za unetu vozacku "+vozacka+" kategorije, mozete upravljati autom i kamionom sa prikolicom.");
		 else
			 System.out.println("Pogresan unos. Unesite ponovo kategoriju vozacke dozvole.");
	}

}
