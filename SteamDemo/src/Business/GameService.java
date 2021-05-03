package Business;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface GameService {
	public void sell(Game game,Customer customer);
	public void sell(Game game,Customer customer,Campaign campaign);
	
	public void add(Game game);
	public void update(Game game);
	public void delete(Game game);
}
