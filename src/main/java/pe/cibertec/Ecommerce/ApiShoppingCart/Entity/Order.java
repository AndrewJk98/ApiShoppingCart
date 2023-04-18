package pe.cibertec.Ecommerce.ApiShoppingCart.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrderId;
    @Embedded
    private Customer customer;//Aqui llamas al objeto customer,donde le indicamos que es incrustado
    private Date orderDate;
    private String trackingNumber;
    private BigDecimal amount;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL) //Aqui llamas al nombre de la propiedad hijo (private Order order)
    private Set<OrderItem> orderItems;
    
    public void addOrderItem(OrderItem orderItem){
        if(orderItems == null){
            orderItems = new HashSet<>();
        }
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }
}
