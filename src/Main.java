import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Order order = new Order();

        while (true) {
            Menu.printMainMenu();
            int choice = scanner.nextInt();

            if ((choice >= 1) && (choice <= 4)) {
                Menu.printSubMenu((choice == 1) ? "Burgers" :
                        ((choice == 2) ? "Frozen Custard" :
                                ((choice == 3) ? "Drinks" :
                                        "Beer")));

                int subChoice = scanner.nextInt();
                String[] menuItems;

                if (choice == 1) {

                    menuItems = new String[]{
                            "ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                            "SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                            "Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",
                            "Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                            "Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
                    };
                } else if (choice == 2) {

                    menuItems = new String[]{
                            "Shakea | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피",
                            "Shake of the Week | W 6.5 | 특별한 커스터드 플레이버",
                            "Red Bean Shake | W 6.5 | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크",
                            "Floats | W 5.9 | 루트 비어, 퍼플 카우, 크림시클",
                            "Cups & Cones | W 5.9 | Double"
                    };
                } else if (choice == 3) {

                    menuItems = new String[]{
                            "Shack-made Lemonade | R 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드",
                            "Fresh Brewed Iced Tea | R 3.4 | 직접 유기농 홍차를 우려낸 아이스티",
                            "Fifty / Fifty | R 3.5 | 레몬에이드와 아이스티의 만남",
                            "Fountain Soda | R 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프",
                            "Abita Root Beer | R 5.9 | 청량감 있는 독특한 미국식 무알콜 탄산음료"
                    };
                } else {

                    menuItems = new String[]{
                            "ShackMeister Ale | R 9.8 | 뉴욕 브루클린 맥주",
                            "MBCO | R 6.8 | Pale Ale, Draft 맥주"
                    };
                }

                if (subChoice >= 1 && subChoice <= menuItems.length) {
                    String menu = menuItems[subChoice - 1];
                    out.println("\n" + menu);
                    out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    out.println("1. 확인\t2. 취소");

                    int confirmChoice = scanner.nextInt();
                    if (confirmChoice == 1) {
                        order.addProduct(new Product(menu.split("\\|")[0].trim(), Double.parseDouble(menu.split("\\|")[1].trim().replaceAll("[^0-9.]", "")), menu.split("\\|")[2].trim()));


                        out.println("메뉴가 장바구니에 추가되었습니다.\n");
                    } else {
                        out.println("메뉴 추가가 취소되었습니다.\n");
                    }
                } else {
                    out.println("잘못된 선택입니다.\n");
                }
            } else if (choice == 5) {
                if (order.getProducts().isEmpty()) {
                    out.println("\n주문 내역이 비어있습니다. 메인 메뉴로 이동합니다.\n");
                    continue;
                }
                out.println("[ Orders ]");
                order.printOrder();

                out.println("[ Total ]");
                out.println("W " + order.getTotalPrice());

                out.println("1. 주문\t2. 메뉴판");
                int orderChoice = scanner.nextInt();
                if (orderChoice == 1) {
                    int orderNumber = Order.placeOrder();
                    out.println("\n주문이 완료되었습니다!\n");
                    out.println("대기번호는 [ " + orderNumber + " ] 번 입니다.");
                    out.println("(3초 후 메뉴판으로 돌아갑니다.)\n");

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    order.clearOrder();
                } else if (orderChoice == 2) {
                    Menu.printMainMenu();
                } else {
                    out.println("\n잘못된 선택입니다.\n");
                }
            } else if (choice == 6) {
                out.println("진행하던 주문을 취소하시겠습니까?");
                out.println("1. 확인\t2. 취소");

                int cancelChoice = scanner.nextInt();
                if (cancelChoice == 1) {
                    order.clearOrder();
                    out.println("\n진행하던 주문이 취소되었습니다.\n");
                } else {
                    out.println("\n취소되지 않았습니다.\n");
                }
            }
        }
    }
}
