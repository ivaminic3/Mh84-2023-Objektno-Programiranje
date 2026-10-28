package vezbe2;

public class Explorer {
	private String name;
	private String destination;
	private double supplies;
	private double knowledge;
	private boolean alive;
	private int turn;
	
	public Explorer(String name, String destination) {
		//spec jer nemamo povratni tip podatka jer vracemo objekat
		this.name = name;
		this.destination = destination;
		this.supplies = 100;
		this.knowledge = 0;
		this.alive = true;
		this.turn = 0;
	}
	
	public void explore() {
		randomEvent();
		loseSupplies(10);
		gainKnowledge(5);
		this.turn++;
	}
	public void randomEvent() {
		double badEventChance = Math.min(0.5,  0.2 + turn*0.1);
		double goodEventChance = Math.min(0.3, 0.15 + turn*0.05);
		
		double randomValue = Math.random();
		if(randomValue < badEventChance ) {
			
			System.out.println("We got caught in the storm, and thrown of the course," + "we have lost supplies!");
			loseSupplies(10);
		}else if(randomValue < badEventChance + goodEventChance) {
			double rewardType = Math.random();
			int rewardValue = (int) (Math.random()* 0.4 * 100);
			if(rewardType <= 0.49) {
				System.out.println("Favorable winds have pushed us further,"+"we have gaind"+ rewardValue + "additional knowledge");
				gainKnowledge(rewardValue);
			}else {
				System.out.println("faver");
			}
		}
	}
	public String getName(){
		return name;
		
	}
	public String getDestination() {
		return destination;
	}
	
	public double getSupplies(){
		return supplies;
	}
	public double getKnowledge() {
		return knowledge;
		
	}
	public boolean isAlive() {
		
		return alive;
	}
	public int getTurn() {
		return turn;
	}
	
	public void loseSupplies(double amount) {
		this.supplies -= amount;
		if(this.supplies <= 0) {
			this.alive= false;
		}
	}
	public void gainSupplies(double amount) {
		this.supplies += amount;
		if(this.supplies > 100) {
			this.supplies= 100;
		}
		}
		
	public void gainKnowledge(double amount) {
		
		this.knowledge += amount;
	
	}
	
	public void explorerDied() {
		this.knowledge = 0;
	}
	}



