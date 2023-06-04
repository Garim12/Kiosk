import java.util.Scanner;
import static java.lang.System.*;

class Menu {
    public static void printMainMenu() {
        out.println("\n===============================");
        out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요. \n");
        out.println("[ SHAKESHACK MENU ]");
        out.println("1. Burgers          | 앵거스 비프 통살을 다져만든 버거");
        out.println("2. Frozen Custard   | 매장에서 신선하게 만드는 아이스크림");
        out.println("3. Drinks           | 매장에서 직접 만드는 음료");
        out.println("4. Beer             | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        out.println("\n[ ORDER MENU ]");
        out.println("5. Order            | 장바구니를 확인 후 주문합니다.");
        out.println("6. Cancel           | 진행중인 주문을 취소합니다.");
        out.println("===============================");
        out.print("선택: ");
    }

    public static void printSubMenu(String category) {

        if (category.equalsIgnoreCase("Burgers")) {
            String[] burgerMenu = {
                    "ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거",
                    "SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",
                    "Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",
                    "Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",
                    "Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
            };

            MenuTitle(category, burgerMenu);
        } else if (category.equalsIgnoreCase("Frozen Custard")) {
            String[] frozenCustardMenu = {
                    "Shakea | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피",
                    "Shake of the Week | W 6.5 | 특별한 커스터드 플레이버",
                    "Red Bean Shake | W 6.5 | 신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크",
                    "Floats | W 5.9 | 루트 비어, 퍼플 카우, 크림시클",
                    "Cups & Cones | W 5.9 | Double"
            };

            MenuTitle(category, frozenCustardMenu);
        } else if (category.equalsIgnoreCase("Drinks")) {
            String[] drinksMenu = {
                    "Shack-made Lemonade | R 3.9 | 매장에서 직접 만드는 상큼한 레몬에이드",
                    "Fresh Brewed Iced Tea | R 3.4 | 직접 유기농 홍차를 우려낸 아이스티",
                    "Fifty / Fifty | R 3.5 | 레몬에이드와 아이스티의 만남",
                    "Fountain Soda | R 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프",
                    "Abita Root Beer | R 5.9 | 청량감 있는 독특한 미국식 무알콜 탄산음료"
            };

            MenuTitle(category, drinksMenu);
        } else if (category.equalsIgnoreCase("Beer")) {
            String[] beerMenu = {
                    "ShackMeister Ale | R 9.8 | 뉴욕 브루클린 맥주",
                    "MBCO | R 6.8 | Pale Ale, Draft 맥주"
            };

            MenuTitle(category, beerMenu);
        } else {
            out.println("\n잘못된 카테고리입니다.\n");
        }
    }

    private static void MenuTitle(String category, String[] burgerMenu) {
        out.println("\n" + "[ " +category + " MENU ]");
        for (int i = 0; i < burgerMenu.length; i++) {
            out.println((i + 1) + ". " + burgerMenu[i]);
        }
        out.println("-------------------------------");
        out.print("선택: ");
    }
}