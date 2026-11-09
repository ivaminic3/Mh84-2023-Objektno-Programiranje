package geometry;

public class Testing {

	public static void main(String[] args) {
		Point p1 = new Point(); // cesto kod prof dobijemo pitanje za new- 
//konstruktor Point nam ukazuje na objekat new otvara memoriju
//		p1.x = 50;//p1 nije objekat vec referenca na objekat
		//Enkapsulacija-ne dodjeljujemo jednu vrijednost vec promjenu stanja i dobijanje stanja objekta
		p1.setX(50);//tackom pristupamo objektu
		p1.setY(20);
		Point p2 = new Point();
		p2.setX(40);
		p2.setY(30);//0,30
		
		p1=p2;
		p1.setX(200);
		
		System.out.println(p2.getX());
		p2.setY(100);
	
		System.out.println(p1.getY());
		
		
		
		
		// Vjezba 3
		
		Line l1 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(new Point());
		//moyemo da prosledimo postojecu referencu ili da prosledimo neki novi objekat
		System.out.println(l1.getStartPoint());
		System.out.println(l1.getEndPoint());
		System.out.println(l1.isSelected());
		System.out.println(l1.getStartPoint().getX());
		
		
		//Vjezba 4
		//public Rectangle(
		Rectangle r1= new Rectangle(new Point(20,20), 50, 50);// pozivamo novi konstruktor Point i dajemo mu koordinate, yatim sirinu i duzinu pravougaonikaa
		
		// metoda toString je zaduzena za tekstuanu repreyentaciju
		System.out.println(r1.toString());
		System.out.println(r1);
		
		// am metoda equals je zaduzena za poredjenje reference
		Rectangle r2=r1;
		Rectangle r3 = new Rectangle(new Point(20,20), 50, 50);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		
		System.out.println("Dali su pravougaonici instance klase object?");
		//instance off je operator koji provjerava da li je objekat instance neke klase
		System.out.println(r1 instanceof Object);
//      r1 je Ractangle ali objekat na koji pokazuje je istovremeno vise stvari
		Object ob = new Object();
		System.out.println("Objekti klase Object nisu instance bilo koje druge kalase");
		System.out.println(ob instanceof Rectangle);
		
		
		System.out.println("Testiranje toString metode");
		System.out.println(p1);
		
		System.out.println(p1.equals(r1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(ob));
		
		/*p1.equals(r1);
		p1.equals(p2);
		p1.equals(ob);
		*/ 
		
	}

}
