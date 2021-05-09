package business.concretes;

import business.abstracts.OrderService;
import entities.Order;

public class OrderManager implements OrderService {
    @Override
    public void add(Order order) {
        System.out.println("Sipariş oluşturuldu.");
    }

    @Override
    public void update(Order order) {
        System.out.println("Sipariş güncellendi.");
    }

    @Override
    public void delete(Order order) {
        System.out.println("Sipariş silindi.");
    }

    @Override
    public void getAll() {
        System.out.println("Siparişler listendi say xd :).");
    }
}
