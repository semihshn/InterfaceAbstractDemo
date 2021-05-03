package Business;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService{
	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Saved to db : "+game.getName());
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Updated to db : "+game.getName());
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Deleted to db : "+game.getName());
		
	}

	@Override
	public void sell(Game game, Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" oyunu "+customer.getFirstName()+" satýldý.");
		
	}
	
	@Override
	public void sell(Game game, Customer customer,Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" oyunu %"+campaign.getDiscountRate()+" indirim ile "+customer.getFirstName()+" satýldý.");
		
	}
}
