package predavanje9;

import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double a,b,c,x;
		System.out.println("Unesite prvi broj.");
		a = sc.nextDouble();
		System.out.println("Unesite drugi broj.");
		b = sc.nextDouble();
		System.out.println("Unesite treci broj.");
		c = sc.nextDouble();
		sc.close();
		
		if (a>b) {
			if(a>c) {
			x = a;
			} else {
				x = c;
			}
		} else {
			if (b>c) {
				x =b;
			} else {
				x = c;
			}
		}
		
		System.out.println("Najveci od unetih brojeva je " + x);
	}

}
