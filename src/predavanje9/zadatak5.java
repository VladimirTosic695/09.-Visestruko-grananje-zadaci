package predavanje9;

import java.util.Scanner;

public class zadatak5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji omogucuje da za uneti naziv meseca i broj dana
		 * ispise horoskopski znak. Unesite mesec rodjenja: Oktobar Unesite dan
		 * rodjenja: 18 Vaga
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String mesec;
		int dan;
		System.out.println("Unesite dan rodjenja.");
		dan = sc.nextInt();
		System.out.println("Unesite mesec rodjenja.");
		mesec = sc.nextLine();
		
		sc.close();
		
		switch (mesec) {
		case "januar": {
			if(dan>0 && dan<=22) {
				System.out.println("Vi ste u horoskopu jarac.");
			} else if (dan>=23 && dan<=31) {
				System.out.println("Vi ste horoskopu vodolija.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		case "februar": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu vodolija.");
			} else if (dan>=23 && dan<=29) {
				System.out.println("Vi ste horoskopu riba.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "mart": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu riba.");
			} else if (dan>=23 && dan<=31) {
				System.out.println("Vi ste horoskopu ovan.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "april": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu ovan.");
			} else if (dan>=23 && dan<=30) {
				System.out.println("Vi ste horoskopu bik.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "maj": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu bik.");
			} else if (dan>=23 && dan<=31) {
				System.out.println("Vi ste horoskopu blizanac.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "jun": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu blizanac.");
			} else if (dan>=23 && dan<=30) {
				System.out.println("Vi ste horoskopu rak.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "jul": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu rak.");
			} else if (dan>=23 && dan<=31) {
				System.out.println("Vi ste horoskopu lav.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "avgust": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu lav.");
			} else if (dan>=23 && dan<=31) {
				System.out.println("Vi ste horoskopu devica.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "septembar": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu devica.");
			} else if (dan>=23 && dan<=30) {
				System.out.println("Vi ste horoskopu vaga.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "oktobar": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu vaga.");
			} else if (dan>=23 && dan<=31) {
				System.out.println("Vi ste horoskopu skorpija.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
	
		}
		
		
		case "novembar": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu skorpija.");
			} else if (dan>=23 && dan<=30) {
				System.out.println("Vi ste horoskopu strelac.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		case "decembar": {
			if (dan>0 && dan<=22) {
				System.out.println("Vi ste horoskopu strelac.");
			} else if (dan>=23 && dan<=31) {
				System.out.println("Vi ste horoskopu jarac.");
			} else {
				System.out.println("Neispravan unos. Unesite mesec i datum ponovo.");
			} break;
		}
		
		
		
		}
	}

}
