package pe.cibertec.Ecommerce.ApiShoppingCart.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import pe.cibertec.Ecommerce.ApiShoppingCart.DAO.OrderRepository;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.Purchase;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.PurchaseResponse;
import java.util.*;
import org.springframework.stereotype.Service;
import pe.cibertec.Ecommerce.ApiShoppingCart.Entity.Order;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
    @Autowired
    private OrderRepository orderRepository;
    
    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Order order = purchase.getOrder();
        order.setTrackingNumber(getTrackingNumber());
        purchase.getOrderItems().forEach(i->{
            order.addOrderItem(i);
                    });
        orderRepository.save(order);
        return new PurchaseResponse(order.getTrackingNumber());
    }
    
    private String getTrackingNumber(){
        return UUID.randomUUID().toString();
    }
}
