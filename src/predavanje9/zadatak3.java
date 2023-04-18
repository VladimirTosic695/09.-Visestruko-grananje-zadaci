package predavanje9;

import java.util.Scanner;

public class zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		char x;
		System.out.println("Unesite kategoriju vozacke dozvole. ");
		x = sc.next().charAt(0);
		sc.close();
		switch (x) {
		case 'A','a':{
			System.out.println("Sa A kategorijom mozete voziti motor.");
		break;
		}
		case 'B','b': {
			System.out.println("Sa B kategorijom mozete voziti auto.");
			break;
		}
		case 'C','c': {
			System.out.println("Sa C kategorijom mozete voziti auto i kamion.");
			break;
		}
		case 'D','d': {
			System.out.println("Sa D kategorijom mozete voziti auto, autobus i kamion.");
			break;
		}
		case 'E','e': {
			System.out.println("Sa E kategorijom mozete voziti auto i kamion sa prikolicom.");
			break;
		}
		default:
			System.out.println("Neispravan unos. Unesite ponovo kategoriju vozacke dozvole.");

	}
	}
}
