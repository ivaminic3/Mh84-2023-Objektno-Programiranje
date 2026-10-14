package vezbe;

import java.util.Scanner;

public class main {
// Deklarisanje i inicijalizaciju
	public static void PrvaVezba() {
		int broj;
		broj=33;
		double dec = 50.5;
		String tekst = "Nas prvi string";
		System.out.println(broj);
		System.out.println("decimalni broj koji imamo je:" + dec);
		System.out.println(tekst);
	}

	public static void drugaVezba(){
		//scanner sluzi za prikupljanje inputa sa konzole
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj");
		int broj = scanner.nextInt();
		
		
		//Oerator koji se zove moduo sluzi za racunanje ostatka pri deljenju
		
		if(broj% 2 == 0) {
			
			System.out.println("Broj "+ broj + " je paran");
			
		}else
		{
			System.out.println("Broj "+ broj +" je neparan");
		}
		
	}

	public static void trecaVjezba() {
		System.out.println("Unesite broj");
		Scanner scanner = new Scanner(System.in);
		int broj = scanner.nextInt();
		//for petlja
		for(int brojac = 0; brojac<= broj; brojac++) {
			System.out.println(brojac);
			
		}
		
		// while petlja
		int brojac = 0;
		while(brojac >= broj) {
			System.out.println(brojac);
			brojac++;
		}
	}
	
public static void main (String[] args){
	PrvaVezba();
	drugaVezba();
	trecaVjezba();
}

}