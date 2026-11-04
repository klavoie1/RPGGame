package item;

import enums.ItemRarity;

public abstract class Item {

    private final String label;
    private final ItemRarity itemRarity;

    protected Item(String label, ItemRarity itemRarity) {
        this.label = label;
        this.itemRarity = itemRarity;
    }

    public String getLabel() {
        return label;
    }

    public ItemRarity getItemRarity() {
        return itemRarity;
    }
}
