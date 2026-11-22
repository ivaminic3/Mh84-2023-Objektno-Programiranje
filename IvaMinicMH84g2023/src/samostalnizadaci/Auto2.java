package samostalnizadaci;
 import vezbe.Auto;
public class Auto2 {

	public static void main(String[] args) {
	Auto auto1 = new Auto();
	Auto auto2 = new Auto();
	Auto auto3 = new Auto();
	
	/*auto1 – marka: „Korveta“,
	 *  brzina: 120, 
	 *  ukljucen: true
	 *   auto2 – marka: „Golf“
	 *   brzina: 0, ukljcen: false
	 *   auto3 – marka: „BMW“
	 *   brzina: 80, ukljucen: true*/
	auto1.setMarka("Korveta");
	auto1.setBrzina(120);
	auto1.setUkljucen(true);
	
	auto2.setMarka("Golf");
	auto2.setBrzina(0);
	auto2.setUkljucen(false);

	auto3.setMarka("BMW");
	auto3.setBrzina(80);
	auto3.setUkljucen(true);
	
	auto1.oAutu();
	auto1.ubrzanje(10);
	auto1.stani(0);
	auto1.oAutu();
	
	auto2.oAutu();
	auto2.ubrzanje(10);
	auto2.stani(0);
	auto2.oAutu();
	
	auto3.oAutu();
	auto3.ubrzanje(10);
	auto3.stani(0);
	auto3.oAutu();
	
	
	}

}
