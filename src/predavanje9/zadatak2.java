package predavanje9;

import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char x;
		
		System.out.println("Unesite kategoriju vozacke dozvole");
		x = sc.next().charAt(0);
		sc.close();
		
		if (x=='A' && x =='a') {
			System.out.println("Sa A kategorijom mozete voziti motor.");
		}
		else if (x=='B'&& x =='b') {
			System.out.println("Sa B kategorijom mozete voziti auto.");
		}
		else if (x=='C' && x =='c') {
			System.out.println("Sa C kategorijom mozete voziti auto i kamion.");
		}
		else if (x=='D' && x =='d') {
			System.out.println("Sa D kategorijom mozete voziti auto, autobus i kamion.");
		}
		else if (x=='E' && x =='e') {
			System.out.println("Sa E kategorijom mozete voziti auto i kamion sa prikolicom.");
		} else {
			System.out.println("Neispravan unos. Ponovo unesite kategoriju vozacke dozvole.");
		}
		
	}

}
