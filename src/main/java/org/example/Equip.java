package org.example;

public class Equip {
    private static Integer numberOfEquipmentsUsed = 1;
    private Integer itemLevel = 21;
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

    public Integer getNumberOfEquipmentsUsed() {
        return numberOfEquipmentsUsed;
    }
    public void increaseNumberOfEquipmentsUsed(){
        numberOfEquipmentsUsed += 1;
    }

    public void destroyEquip(){
        destroyed = true;
    }

}
