package geometry;

public class Point {

		private int x;
		private int y;
		private boolean selected;
		//polimorfizam isto ponosanja ne raylicite nacine
		//konstruktori su na vrhu klase, nemaju povratni tip podatka
		//implicitno podrayumjecvani konstruktor, ne mora eksplicitno da se navodi ako postoje drugi konstruktori
		public Point() {
			
		}
		// mozemo da imamo dva ista konstruktora, tj. metoda, samo ako su ima parametri razliciti
		// ova pojava se naziva--> Overloading
		public Point(int x, int y) {
			this.x = x;
			this.y = y;		
		}
		
		public Point(int x, int y, boolean selected) {
		/*  primjer nasledjivanja konstruktora
		 *  this.x = x;
			this.y = y;*/
			
			this(x, y);
			this.selected = selected;
		}
		public double distance(Point p) {
			int dx = x - p.getX();
			int dy = y - p.getY();
			return Math.sqrt(dx*dx + dy*dy);
		}
		@Override
		public String toString() {
			//return String.format("(%s,%s) " , x,y);
			
			return "(" + x + "," + y +")";
			
		}
		
		@Override 
		public boolean equals (Object o) {
			//kad stavimo object moyemo da prosledimo bilo sta
			if (o instanceof Point) {
				Point temp= (Point)o;//kastovanje reference
				if(this.x == temp.getX() && this.y== temp.getY()) 
					return true;
				
			}
			return false;
			
		}
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}//vraca celobrojnu vrijednost
		
		public boolean isSelected() {
			return selected;
		}//vraca true ili false
		
		public void setX(int x) {
			this.x = x; // diferenciramo atribut od parametra sa this.
			//referenca na objekat 
		}
		
		public void setY(int y) {
			this.y = y;
			
		}
		
		public void setSelected() {
			this.selected = selected;
		}

	//zadatak 3 i zadaci za samostalni rad za domacii
}
