package homework.Task12;

public class ItemSorters {
    public int sortByCategory(ShopItem p1, ShopItem p2){
        System.out.println("Сортировка по категориям");
        return p1.category.length() - p2.category.length();
    }
    public int sortByTitle(ShopItem p1, ShopItem p2){
        System.out.println("Сортировка по названию");
        return p1.title.length() - p2.title.length();
    }
    public int sortByPrice(ShopItem p1, ShopItem p2){
        System.out.println("Сортировка по цене");
        return  (int) (p1.price - p2.price);
    }
    public int sortByQuantity(ShopItem p1, ShopItem p2){
        System.out.println("Сортировка по количеству");
        return p1.quantity - p2.quantity;
    }

}
