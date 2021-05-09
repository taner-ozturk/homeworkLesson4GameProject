package adapter;

import business.abstracts.CustomerCheckService;
import entities.Customer;
import mernisServiceReferance.TSFKPSPublicSoap;

public class MernisCheckAdapter implements CustomerCheckService {
    @Override
    public boolean check(Customer customer) throws Exception {
        TSFKPSPublicSoap nglkpsPublicSoap = new TSFKPSPublicSoap();
        TSFKPSPublicSoap client =new TSFKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getYearOfBirth());
    }
}
