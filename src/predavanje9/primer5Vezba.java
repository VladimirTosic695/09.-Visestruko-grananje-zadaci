package predavanje9;

import java.util.Scanner;

public class primer5Vezba {

	public static void main(String[] args) {
		// Napisati program koji omogucuje da za uneti naziv meseca
		// i broj dana ispise horoskopski znak.
		
	Scanner sc = new Scanner(System.in);
	String mesec;
	int dan;
	System.out.println("Unesite mesec rodjenja.");
	mesec = sc.nextLine();
	System.out.println("Unesite dan u mesecu rodjenja.");
	dan = sc.nextInt();
	sc.close();
	
	switch (mesec) {
	case "April","april": {
		if(dan<=20)
			System.out.println("Vi ste ovan u horoskopu.");
		else if (dan<=30)
			System.out.println("Vi ste bik u horoskopu.");
		break;
	}
	case "Maj","maj": {
		if(dan<=21)
			System.out.println("Vi ste bik u horoskopu.");
		else if (dan<=31)
			System.out.println("Vi ste blizanac u horoskopu.");
		break;
	}
	case "Jun","jun": {
		if(dan<=21)
			System.out.println("Vi ste blizanac u horoskopu.");
		else if (dan<=30)
			System.out.println("Vi ste rak u horoskopu.");
		break;
	}
	case "Jul","jul": {
		if(dan<=22)
			System.out.println("Vi ste rak u horoskopu.");
		else if (dan<=31)
			System.out.println("Vi ste lav u horoskopu.");
		break;
	}
	case "Avgust","avgust": {
		if(dan<=22)
			System.out.println("Vi ste lav u horoskopu.");
		else if (dan<=31)
			System.out.println("Vi ste devica u horoskopu.");
		break;
	}
	case "Septembar","septembar": {
		if(dan<=22)
			System.out.println("Vi ste devica u horoskopu.");
		else if (dan<=30)
			System.out.println("Vi ste vaga u horoskopu.");
		break;
	}
	case "Oktobar","oktobar": {
		if(dan<=23)
			System.out.println("Vi ste vaga u horoskopu.");
		else if (dan<=31)
			System.out.println("Vi ste skorpija u horoskopu.");
		break;
	}
	case "Novembar","novembar": {
		if(dan<=22)
			System.out.println("Vi ste skorpija u horoskopu.");
		else if (dan<=30)
			System.out.println("Vi ste strelac u horoskopu.");
		break;
	}
	case "Decembar","decembar": {
		if(dan<=21)
			System.out.println("Vi ste strelac u horoskopu.");
		else if (dan<=31)
			System.out.println("Vi ste jarac u horoskopu.");
		break;
	}
	case "Januar","januar": {
		if(dan<=20)
			System.out.println("Vi ste jarac u horoskopu.");
		else if (dan<=31)
			System.out.println("Vi ste vodolija u horoskopu.");
		break;
	}
	case "Februar","februar": {
		if(dan<=19)
			System.out.println("Vi ste vodolija u horoskopu.");
		else if (dan<=29)
			System.out.println("Vi ste riba u horoskopu.");
		break;
	}
	case "Mart","mart": {
		if(dan<=20)
			System.out.println("Vi ste riba u horoskopu.");
		else if (dan<=31)
			System.out.println("Vi ste ovan u horoskopu.");
		break;
	}
	default:
		System.out.println("Taj mesec ne postoji. Unesite ponovo.");
	
	}
	
	
		
	}

}
