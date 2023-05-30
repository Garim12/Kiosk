import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu mainMenu = new Menu("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        MenuItem burgerMenu = new MenuItem("Burgers");
        burgerMenu.addSubMenu(new MenuItem("Hamburger"));
        burgerMenu.addSubMenu(new MenuItem("Cheeseburger"));
        burgerMenu.addSubMenu(new MenuItem("Chicken Burger"));
        burgerMenu.addSubMenu(new MenuItem("Veggie Burger"));
        mainMenu.addSubMenu(burgerMenu);
        mainMenu.addSubMenu(new MenuItem("Frozen Custard"));
        mainMenu.addSubMenu(new MenuItem("Drinks"));
        mainMenu.addSubMenu(new MenuItem("Beer"));
        mainMenu.addSubMenu(new MenuItem("Order"));
        mainMenu.addSubMenu(new MenuItem("Cancel"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            mainMenu.displayMenu();
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice == 5) {
                mainMenu.displayCart();
                System.out.println("\n[ ORDER MENU ]");
                System.out.println("1. 주문하기");
                System.out.println("2. 취소");
                System.out.print("메뉴를 선택하세요: ");
                int option = scanner.nextInt();

                if (option == 1) {
                    mainMenu.placeOrder();
                    mainMenu = new Menu("SHAKESHACK BURGER 에 오신걸 환영합니다.");
                    burgerMenu = new MenuItem("Burgers"); // 수정된 부분
                    burgerMenu.addSubMenu(new MenuItem("Hamburger"));
                    burgerMenu.addSubMenu(new MenuItem("Cheeseburger"));
                    burgerMenu.addSubMenu(new MenuItem("Chicken Burger"));
                    burgerMenu.addSubMenu(new MenuItem("Veggie Burger"));
                    mainMenu.addSubMenu(burgerMenu);
                    mainMenu.addSubMenu(new MenuItem("Frozen Custard"));
                    mainMenu.addSubMenu(new MenuItem("Drinks"));
                    mainMenu.addSubMenu(new MenuItem("Beer"));
                    mainMenu.addSubMenu(new MenuItem("Order"));
                    mainMenu.addSubMenu(new MenuItem("Cancel"));
                }
            } else if (choice == 6) {
                System.out.println("진행중인 주문을 취소합니다.");
                mainMenu = new Menu("SHAKESHACK BURGER 에 오신걸 환영합니다.");
                burgerMenu = new MenuItem("Burgers"); // 수정된 부분
                burgerMenu.addSubMenu(new MenuItem("Hamburger"));
                burgerMenu.addSubMenu(new MenuItem("Cheeseburger"));
                burgerMenu.addSubMenu(new MenuItem("Chicken Burger"));
                burgerMenu.addSubMenu(new MenuItem("Veggie Burger"));
                mainMenu.addSubMenu(burgerMenu);
                mainMenu.addSubMenu(new MenuItem("Frozen Custard"));
                mainMenu.addSubMenu(new MenuItem("Drinks"));
                mainMenu.addSubMenu(new MenuItem("Beer"));
                mainMenu.addSubMenu(new MenuItem("Order"));
                mainMenu.addSubMenu(new MenuItem("Cancel"));
            } else {
                MenuItem selectedMenuItem = mainMenu.getMenuItems().get(choice - 1);
                Menu selectedMenu = selectedMenuItem.getSubMenu();
                if (selectedMenu != null) {
                    selectedMenu.displayMenu();
                }
            }
        }
    }
}