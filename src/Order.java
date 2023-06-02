import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Order extends Menu{
    private final List<Product> products;
    private static int orderCount = 1;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void clearOrder() {
        products.clear();
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void printOrder() {
        for (int i = 0; i < products.size(); i++) {
            out.println((i + 1) + ". " + products.get(i).getName() + " | W " + products.get(i).getPrice() + " | " + products.get(i).getDescription());
        }
    }


    public static int placeOrder() {
        int orderNumber = orderCount;
        orderCount++;
        return orderNumber;
    }
}
