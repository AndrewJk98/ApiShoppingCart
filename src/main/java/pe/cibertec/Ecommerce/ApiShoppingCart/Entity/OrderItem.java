package pe.cibertec.Ecommerce.ApiShoppingCart.Entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
//import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrterItemId;
    @Embedded
    private Item item; //Aqui llamas al objeto Item, donde le indicamos que es incrustado
    private BigDecimal discount;
    private BigDecimal subTotal;
    @ManyToOne
    @JoinColumn(name="OrderId") //Nombre de la columna de la tabla que es llava primaria padre (el Id), verificas si no tiene @Columname 
    private Order order;//Un Item de pedido le corresponde siempre un Order(una venta)
}
