package predavanje9;

import java.util.Scanner;

public class sedmiDan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d,m,g,dan,mesec,godina;
		System.out.println("Unesite dan, mesec i godinu");
		d = sc.nextInt();
		m = sc.nextInt();
		g = sc.nextInt();
		
		
		/*if (d>=1 && d<31)
			dan = d+7;
		else if (dan>31)
			mesec = m+1;
		if(mesec>12)
			godina = g+1;*/
		if (m==4 || m==6 || m==9 || m==11) {
			if (d>=1 && d<=30 && m>=1 && m<=12) {
			dan = d+7;
			} else if (dan > 31) {
				mesec = m+1;
			} else (mesec>12) {
				mesec = 1;
				godina = g+1;
			}
			else if (m==2 && d>=1 && d<=28) {
				dan = d+7;
			} else if (dan >28) {
				mesec=3;
			} else if ()
				
		}
	}

}
