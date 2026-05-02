package org.example;

public class Equip {
    private Integer itemLevel = 18;
    private Boolean destroyed = false;

//    public Equip() {
//        this.itemLevel = 18;
//    }

    public Integer getItemLevel() {
        return itemLevel;
    }
    public void increaseItemLevel(){
        itemLevel++;
    }

    public Boolean getDestroyed() {
        return destroyed;
    }

    public void destroyEquip(){
        destroyed = true;
    }

}
