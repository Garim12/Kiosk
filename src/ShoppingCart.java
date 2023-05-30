import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<MenuItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("장바구니가 비어 있습니다.");
        } else {
            System.out.println("장바구니 내역:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i).getName());
            }
        }
    }

    public void clearCart() {
        items.clear();
    }
}
