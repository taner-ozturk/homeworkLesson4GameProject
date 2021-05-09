package business.concretes;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService {
    private CustomerCheckService checkService;

    public CustomerManager(CustomerCheckService checkService) {
        this.checkService = checkService;
    }

    public void add(Customer customer) throws Exception {
        if (this.checkService.check(customer)) {
            System.out.println("Doğrulama başarılı.  " + customer.getFirstName());
        } else {
            System.out.println("Doğrulama başarısız kişi eklenemedi!");
        }

    }

    public void delete(Customer customer) {
        System.out.println("Müşteri silindi: " + customer.getFirstName());
    }

    public void update(Customer customer) {
        System.out.println("Müşteri güncellendi: " + customer.getFirstName());
    }

    public void getAll(Customer[] customers) {
        for (Customer customer: customers){
            System.out.println("Müşteriler: " + customer.getFirstName() + "\n");
        }

    }
}
