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
		
	}

}
