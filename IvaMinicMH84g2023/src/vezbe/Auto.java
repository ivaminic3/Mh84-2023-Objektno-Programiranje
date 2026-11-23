
package vezbe;
/*U okviru paketa vezbe kreirati klasu Auto, data klasa poseduje atribute int brzina,
 * 
 *  String marka i boolean ukljucen. Osim navedenih atributa klasa poseduje i sledeće metode:
•ubrzaj(int brzina) –metoda koja povećava trenutnu brzinu auta za vrednost prosleđenog parametra 
ukoliko je auto uključen
•stani()–metoda koja predstavlja zaustavljanje auta. 
Ova metoda bi trebalo da se izvrši samo ukoliko je auto uključen. 

Ona na konzoli ispisuje tekst u kome navodi da je auto zaustavljen za određeno vreme, 
to vreme zavisi od brzine auto u trenutku pozivanja metode. 

Ako je brzina auta manja od 50 onda će se zaustaviti za 4 sekunde, 

ako je ta brzina između 50 i 100 onda će se zaustaviti za 8 sekundi

 i konačno ako je brzina iznad 100 onda će se zaustaviti za 12 sekundi
 
•oAutu() –Metoda koja na konzoli ispisuje informacije o autu u trenutku pozivanja,
 u vidu teksta se ispisuje marka automobila,
 
  da li je uključen ili isključen 
 i ukoliko jeste ispisuje se i trenutna brzina. 
 U tekstu se ne smeju pojaviti reči true ili false.
 
Za svaki atribut napraviti odgovarajuću get i set metodu.*/


public class Auto {
	private int brzina;
	private String marka;
	private boolean ukljucen;
	public Auto() {
		
	};
	public Auto(String marka, int brzina) {
		this.brzina = brzina;
		this.marka = marka;
	};
	
	public Auto(String marka, int brzina, boolean ukljucen) {
		
		this(marka,brzina);
		this.ukljucen = ukljucen;
		
	}
	@Override
	/*„Objekat klase Auto, marke <marka> , koji je trenutno 
	<ukljucen> i kreće se brzinom od <brzina> km/h“. 
	Prilikom ove metode obavezno uzeti u obzir da li je auto 
	uključen ili ne i na osnovu toga modifikovati poruku 
	slično kao kod oAutu() metodi. Nakon implementacije 
	ove metode izbrisati metodu oAutu(). Primer izvršavanja
	 ove metode: „Objekat klase Auto, marke Pezo, 
	koji je trenutno upaljen i krece se brzinom od 50 km/h“.*/
	
	public String toString() {
		if(ukljucen) {
			return "Objekat klase Auto, marke "+marka+" , koji je trenutno \r\n"
					+ "	<ukljucen> i kreće se brzinom od "+brzina+" km/h.";}
			else {
				
				return "Objekat klase Auto, marke "+marka+" je ugasen.";
			}
		
		
		
	}
	@Override 
	
	public boolean equals(Object o) {
		if(o instanceof Auto) {
			Auto drugi = (Auto) o;
			return marka.equals(drugi.marka);
		}
		
		return false;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public boolean isUkljucen() {
		return ukljucen;
	}

	public void setUkljucen(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}
	
	//metoda za ubrzavanje
	
	public void ubrzanje(int brzina) {
		
		if (ukljucen) {
			this.brzina += brzina;
		}
	}
	//metoda za usoravanje
	
	public void stani(int brzina) {
		if (ukljucen) {
			if(brzina<50)	{
				System.out.println("Auto će se zaustaviti na 4s!");
			} else if(brzina<=100) {
				
				System.out.println("Auto će se zaustaviti na 8s!");
			} else if(brzina>100) {
				System.out.println("Auto će se zaustaviti na 12s!");
			}
			brzina=0;
				}
	}
	/*•oAutu() –Metoda koja na konzoli ispisuje informacije o autu u trenutku pozivanja,
	 u vidu teksta se ispisuje marka automobila,
	 
	  da li je uključen ili isključen 
	 i ukoliko jeste ispisuje se i trenutna brzina. 
	 U tekstu se ne smeju pojaviti reči true ili false.*/
	 
	public void oAutu() {
		System.out.println("Maraka automobila:" + marka);
		if(ukljucen) {
			System.out.println("Auto je ukljucen");
			System.out.println("Trenutna brzina:" + brzina);
			
		}else {
			System.out.println("Auto je iskljucen");
			
		}
	}
	
}
