package Adapters;

import java.rmi.RemoteException;

import Business.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()) , customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),Integer.valueOf(customer.getYearOfBirth()));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}


}
