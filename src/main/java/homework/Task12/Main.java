package homework.Task12;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int rand = new Random().nextInt(4);
        Shop newShop = new Shop();
        List<Comparator<ShopItem>> comparatorList = null;
        List<ShopItem> shopItemList = null;
        shopItemList = newShop.fillListOfItem(shopItemList);
        comparatorList = newShop.fillList(comparatorList);
        System.out.println("Делаем сортировку");
        Collections.sort(shopItemList, comparatorList.get(rand));
        System.out.println("ID | Category | Title | Price | Quantity");
        for (ShopItem i: shopItemList ){
            System.out.printf("%s | %s | %s | %.1f | %d\n", StringUtils.abbreviate(i.id,10), StringUtils.abbreviate(i.category,10), StringUtils.abbreviate(i.title,10), i.price, i.quantity);
        }
    }
}
