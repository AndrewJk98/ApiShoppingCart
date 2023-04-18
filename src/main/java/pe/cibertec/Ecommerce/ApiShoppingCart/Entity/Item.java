package pe.cibertec.Ecommerce.ApiShoppingCart.Entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Embeddable //Con esto le decimo que el objeto Item es incrustale
public class Item {
    private Long ProductId;
    private String productName;
    private BigDecimal UnitPrice;
}
