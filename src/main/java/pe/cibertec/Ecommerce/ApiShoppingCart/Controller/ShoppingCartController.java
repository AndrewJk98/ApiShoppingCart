
package pe.cibertec.Ecommerce.ApiShoppingCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.Purchase;
import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.PurchaseResponse;
import pe.cibertec.Ecommerce.ApiShoppingCart.Service.ShoppingCartService;

@RestController
@RequestMapping("/api/shoppingcart")//Base Path
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService cartService;
    
    @PostMapping("/placeOrder")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        return cartService.placeOrder(purchase);
    }
}
