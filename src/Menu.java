import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String title;
    private List<MenuItem> menuItems;

    public Menu(String title) {
        this.title = title;
        this.menuItems = new ArrayList<>();
    }

    public void addSubMenu(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void displayMenu() {
        System.out.println("\n[" + title + "]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).getTitle());
        }
        System.out.println("0. 종료");
    }

    public void displayCart() {
        System.out.println("\n장바구니 내역:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i).getTitle());
        }
    }

    public void placeOrder() {
        System.out.println("주문이 완료되었습니다!");
        System.out.println("대기번호는 [ " + (int) (Math.random() * 100) + " ] 번 입니다.");
        try {
            Thread.sleep(3000); // 3초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}