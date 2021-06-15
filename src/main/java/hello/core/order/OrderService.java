package hello.core.order;

public interface OrderService {
    Order createOrder(Long meberId, String itemName, int itemPrice);

}
