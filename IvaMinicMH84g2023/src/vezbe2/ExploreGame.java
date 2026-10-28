package vezbe2;

import java.util.Scanner;

public class ExploreGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the exploration game!");
		System.out.println("What is your name?");
		String name = scanner.next();
		System.out.println(name+ ", where do you wnat to go?");
		String destination = scanner.next();
		
		Explorer explorer = new Explorer(name, destination);
		
		System.out.println("The journey begins!");
		
		while(explorer.isAlive()) {
			explorer.explore();
			
			if(!explorer.isAlive()) {
				System.out.println("The explorer has parished, game over!");
				explorer.explorerDied();
				continue;
			}
			if(explorer.getKnowledge() >=100){
				System.out.println("Congradulation, you are very lucky!");
				break;
				
			}
			
			System.out.println("After " + explorer.getTurn() + " days of exploration is over we currently have following stats:");
			System.out.println("supplies: " + explorer.getSupplies() + " ,knowledge:" + explorer.getKnowledge());
			
			System.out.println("If you want to continue the journey plese press 1, otherwise exploration ends!");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				continue;
			}else {
				break;
			}
		}
		
		System.out.println("Your final knowledge score is: " + explorer.getKnowledge());
		scanner.close();
		
			
		}
	}

