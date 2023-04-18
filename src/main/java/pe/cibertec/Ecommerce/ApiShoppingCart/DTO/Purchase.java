package pe.cibertec.Ecommerce.ApiShoppingCart.DTO;

import java.util.Set;
import lombok.*;
import pe.cibertec.Ecommerce.ApiShoppingCart.Entity.Order;
import pe.cibertec.Ecommerce.ApiShoppingCart.Entity.OrderItem;

@Getter
@Setter
@AllArgsConstructor
public class Purchase {
    Order order;
    Set<OrderItem> orderItems;
}
