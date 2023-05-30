import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> products;
    private final List<Product> productList;
    private static int orderCount = 1;

    public Order() {
        this.products = new ArrayList<>();
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        productList.add(product);
    }

    public void clearOrder() {
        products.clear();
        productList.clear();
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
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + ". " + productList.get(i).getName() + " | W " + productList.get(i).getPrice() + " | " + productList.get(i).getDescription());
        }
    }


    public int placeOrder() {
        int orderNumber = orderCount;
        orderCount++;
        return orderNumber;
    }
}
