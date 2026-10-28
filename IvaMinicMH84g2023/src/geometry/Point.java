package geometry;

public class Point {

		private int x;
		private int y;
		private boolean selected;
		
		public double distance(Point p) {
			int dx = x - p.getX();
			int dy = y - p.getY();
			return Math.sqrt(dx*dx + dy*dy);
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

	
}
