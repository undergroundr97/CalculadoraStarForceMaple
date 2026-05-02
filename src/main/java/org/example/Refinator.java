package org.example;

import java.util.ArrayList;

public class Refinator {
    private static int successChance;
    private static int failureChance;
    private static int destroyChance;
    public static void refineEquip(Equip equip) {
        switch (equip.getItemLevel()) {
            case 18:
                successChance = 150;
                failureChance = 782;
                destroyChance = 68;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            default:
                System.out.println("Item out of bounds");
                break;


        }
    }

   private static void enhance(Equip equip, int successChance, int failureChance, int destroyChance ){
        ArrayList<Integer> numbersTo999 = new ArrayList<>();
        for (int i = 0; i < 1000 ; i++) {
            numbersTo999.add(i);
        }
        ArrayList<Integer> succesNumbers = new ArrayList<>();
        ArrayList<Integer> failureNumbers = new ArrayList<>();
        ArrayList<Integer> destroyNumbers = new ArrayList<>();

        for (int i = 0; i < successChance ; i++) {
            int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.toArray().length);
            succesNumbers.add(numbersTo999.get(randomNumberFromArray));
            numbersTo999.remove(randomNumberFromArray);
        }
        for (int i = 0; i < failureChance ; i++) {
            int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.toArray().length);
            failureNumbers.add(numbersTo999.get(randomNumberFromArray));
            numbersTo999.remove(randomNumberFromArray);
        }
        for (int i = 0; i < destroyChance ; i++) {
            int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.toArray().length);
            destroyNumbers.add(numbersTo999.get(randomNumberFromArray));
            numbersTo999.remove(randomNumberFromArray);
        }
        int randomStarForceNumber = (int) Math.floor(Math.random() * 1000);
        System.out.println(numbersTo999);
        System.out.println("Success: " + succesNumbers);
        System.out.println("Failure: "+ failureNumbers);
        System.out.println("Destroy: " + destroyNumbers);
        if(succesNumbers.contains(randomStarForceNumber)){
            equip.increaseItemLevel();
            System.out.println("Success");
            System.out.println("Number was: " + randomStarForceNumber);
        } else if (failureNumbers.contains(randomStarForceNumber)) {
            System.out.println("Failure");
            System.out.println("Number was: " + randomStarForceNumber);
        } else {
            equip.destroyEquip();
            System.out.println("Destroyed");
            System.out.println("Number was: " + randomStarForceNumber);
        }
    }

}
