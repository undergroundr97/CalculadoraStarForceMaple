package org.example;

public class Equip {
    private Integer itemLevel;
    private Boolean destroyed = false;

    public Equip() {
        this.itemLevel = 18;
    }

    public Integer getItemLevel() {
        return itemLevel;
    }
    public void increaseItemLevel(){
        itemLevel++;
    }
    public void destroyEquip(){
        destroyed = true;
    }

}
