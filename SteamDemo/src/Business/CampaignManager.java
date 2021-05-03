package Business;

import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("%"+campaign.getDiscountRate()+" campaigns saved");
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("%"+campaign.getDiscountRate()+" campaigns updated");
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println("%"+campaign.getDiscountRate()+" campaigns deleted");
	}

}
