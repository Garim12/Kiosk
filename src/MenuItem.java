public class MenuItem {
    private String title;
    private Menu subMenu;

    public MenuItem(String title) {
        this.title = title;
    }

    public void addSubMenu(MenuItem menuItem) {
        if (subMenu == null) {
            subMenu = new Menu(title);
        }
        subMenu.addSubMenu(menuItem);
    }

    public String getTitle() {
        return title;
    }

    public Menu getSubMenu() {
        return subMenu;
    }
}