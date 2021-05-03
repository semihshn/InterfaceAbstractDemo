package Console;

import Adapters.MernisServiceAdapter;
import Business.CampaignManager;
import Business.CustomerManager;
import Business.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer(1,"","Semih","Þahan","1999");
		Game game=new Game(1,"Counter",50);
		Campaign campaign=new Campaign(1,75);
		
		CustomerManager manager=new CustomerManager(new MernisServiceAdapter());
		GameManager gameManager=new GameManager();
		
		manager.add(customer);
		gameManager.sell(game, customer,campaign);
	}

}
