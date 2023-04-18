package pe.cibertec.Ecommerce.ApiShoppingCart.Entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable //Con esto le decimo que el objeto Item es incrustale
public class Customer {
    private Long customerId;
    private String name;
    private String email;
    private String phone;
}
