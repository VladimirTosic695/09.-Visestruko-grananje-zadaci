package predavanje9;

import java.util.Scanner;

public class primer1Vezba {

	public static void main(String[] args) {
		// Za uneta tri broja, ispisati najveci broj.
		Scanner sc = new Scanner (System.in);
		
		double prvi,drugi,treci,najveci;
		System.out.println("Unesite prvi broj.");
		prvi = sc.nextDouble();
		System.out.println("Unesite drugi broj.");
		drugi = sc.nextDouble();
		System.out.println("Unesite treci broj.");
		treci = sc.nextDouble();
		sc.close();
		
		if (prvi>drugi) {
			if(prvi>treci) {
				najveci = prvi;
			} else
				najveci = treci;
		} else if (drugi>treci) {
			najveci = drugi;
		} else {
			najveci = treci;
		}
		System.out.println("Najveci broj je "+najveci);
		
		/*if(prvi>drugi && prvi>treci) {
			najveci = prvi;
		}
		else if (drugi>treci) {
			najveci = drugi;
		} else {
			najveci = treci;
		}
		System.out.println("Najveci broj je "+najveci);*/
		
		
	}

}
