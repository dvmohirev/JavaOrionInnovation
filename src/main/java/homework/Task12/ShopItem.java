package homework.Task12;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ShopItem {
    public String category;
    public double price;
    public String title;
    public int quantity;
    public String id;

    public ShopItem(String category, double price, String title, int quantity) {
        this.category = category;
        this.price = price;
        this.title = title;
        this.quantity = quantity;
        this.id = RandomStringUtils.randomAlphanumeric(25);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ShopItem shopItem = (ShopItem) o;

        return new EqualsBuilder().append(price, shopItem.price).append(quantity, shopItem.quantity).append(category, shopItem.category).append(title, shopItem.title).append(id, shopItem.id).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(category).append(price).append(title).append(quantity).append(id).toHashCode();
    }
}
