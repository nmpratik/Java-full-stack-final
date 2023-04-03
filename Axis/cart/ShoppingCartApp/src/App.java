

import com.cart.item.ItemDb;
import com.cart.user.UserMenu;

public class App {
    public static void main(String[] args) throws Exception {

        ItemDb.addItem(01, "Pen", 05);
        ItemDb.addItem(02, "shirt", 0);
        ItemDb.addItem(03, "Watch", 0);
        ItemDb.addItem(04, "Notebook", 0);
        ItemDb.addItem(05, "", 0);
        ItemDb.addItem(06, null, 0);
        ItemDb.addItem(07, null, 0);

        UserMenu menu = new UserMenu();
        menu.performAction();
    }
}