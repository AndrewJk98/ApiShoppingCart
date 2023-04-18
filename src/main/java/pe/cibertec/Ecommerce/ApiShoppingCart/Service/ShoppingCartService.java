package pe.cibertec.Ecommerce.ApiShoppingCart.Service;

import pe.cibertec.Ecommerce.ApiShoppingCart.DTO.*;

public interface ShoppingCartService {
    public PurchaseResponse placeOrder(Purchase purchase);
}
