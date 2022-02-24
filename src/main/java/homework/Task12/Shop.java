package homework.Task12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    List<ShopItem> listOfItem = new ArrayList<>();
    ShopItem shopItemFirst = new ShopItem("Электроника", 10000, "Iphone 4", 5);
    ShopItem shopItemSecond = new ShopItem("Электроника", 20000, "Iphone 5", 10);
    ShopItem shopItemThird = new ShopItem("Электроника", 30000, "Iphone 6", 15);
    ShopItem shopItemFour = new ShopItem("Электроника", 40000, "Iphone 7", 20);
    ShopItem shopItemFive = new ShopItem("Электроника", 50000, "Iphone 8", 25);
    ShopItem shopItemSix = new ShopItem("Электроника", 60000, "Iphone 9", 30);
    ShopItem shopItemSeven = new ShopItem("Электроника", 70000, "Iphone 10", 35);
    ShopItem shopItemEight = new ShopItem("Электроника", 80000, "Iphone 11", 40);
    ShopItem shopItemNine = new ShopItem("Электроника", 90000, "Iphone 12", 45);
    ShopItem shopItemTen = new ShopItem("Электроника", 100000, "Iphone 13", 50);

    public List<ShopItem> fillListOfItem (List<ShopItem> l){
        l = new ArrayList<>();
        l.add(shopItemFive);
        l.add(shopItemSecond);
        l.add(shopItemEight);
        l.add(shopItemFour);
        l.add(shopItemFirst);
        l.add(shopItemTen);
        l.add(shopItemSeven);
        l.add(shopItemThird);
        l.add(shopItemNine);
        l.add(shopItemSix);
        return l;
    }

    //не понимаю, как заполнить Лист компараторами
    public List<Comparator<ShopItem>> fillList (List<Comparator<ShopItem>> list){
        list = new ArrayList<>();
        Comparator<ShopItem> comparatorCategory = new ItemSorters()::sortByCategory;
        Comparator<ShopItem> comparatorTitle = new ItemSorters()::sortByTitle;
        Comparator<ShopItem> comparatorPrice = new ItemSorters()::sortByPrice;
        Comparator<ShopItem> comparatorQuantity = new ItemSorters()::sortByQuantity;
        list.add(comparatorCategory);
        list.add(comparatorTitle);
        list.add(comparatorPrice);
        list.add(comparatorQuantity);
        return list;
    }
}
