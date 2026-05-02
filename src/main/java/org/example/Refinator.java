package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Refinator {
    private static Scanner scanner = new Scanner(System.in);
    private static int successChance;
    private static int failureChance;
    private static int destroyChance;
    public static void refineEquip(Equip equip) {
        switch (equip.getItemLevel()) {
            case 18:
                successChance = 1500;
                failureChance = 7820;
                destroyChance = 680;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 19:
                successChance = 1500;
                failureChance = 7650;
                destroyChance = 850;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 20:
                successChance = 3000;
                failureChance = 5950;
                destroyChance = 1050;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 21:
                successChance = 1500;
                failureChance = 7225;
                destroyChance = 1275;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 22:
                successChance = 1500;
                failureChance = 6800;
                destroyChance = 1700;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 23:
                successChance = 1000;
                failureChance = 7200;
                destroyChance = 1800;
                enhance(equip, successChance,failureChance,destroyChance);
                break;

            case 24:
                successChance = 1000;
                failureChance = 7200;
                destroyChance = 1800;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 25:
                successChance = 1000;
                failureChance = 7200;
                destroyChance = 1800;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            default:
                System.out.println("Item out of bounds");
                break;
        }
    }

   private static void enhance(Equip equip, int successChance, int failureChance, int destroyChance ){
       ArrayList<Integer> numbersTo999 = new ArrayList<>();
       for (int i = 0; i < 10000 ; i++) {
           numbersTo999.add(i);
       }
       ArrayList<Integer> succesNumbers = new ArrayList<>();
       ArrayList<Integer> failureNumbers = new ArrayList<>();
       ArrayList<Integer> destroyNumbers = new ArrayList<>();

       for (int i = 0; i < successChance ; i++) {
           int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.size());
           succesNumbers.add(numbersTo999.get(randomNumberFromArray));
           numbersTo999.remove(randomNumberFromArray);
       }
       for (int i = 0; i < failureChance ; i++) {
           int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.size());
           failureNumbers.add(numbersTo999.get(randomNumberFromArray));
           numbersTo999.remove(randomNumberFromArray);
       }
       for (int i = 0; i < destroyChance ; i++) {
           int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.size());
           destroyNumbers.add(numbersTo999.get(randomNumberFromArray));
           numbersTo999.remove(randomNumberFromArray);
       }
       int randomStarForceNumber = (int) Math.floor(Math.random() * 10000);
//       System.out.println(numbersTo999);
//       System.out.println("Success: " + succesNumbers);
//       System.out.println("Failure: "+ failureNumbers);
//       System.out.println("Destroy: " + destroyNumbers);
       if(succesNumbers.contains(randomStarForceNumber)){
           equip.increaseItemLevel();
//           System.out.println(" wwwwwww Success wwwwwww");
//           System.out.println("Number was: " + randomStarForceNumber);
       } else if (failureNumbers.contains(randomStarForceNumber)) {
//           System.out.println(" ------- Failure -------");
//           System.out.println("Number was: " + randomStarForceNumber);
       } else {
           equip.increaseNumberOfEquipmentsUsed();
           equip.destroyEquip();
//           System.out.println(" xxxxxxxx Destroyed xxxxxxxx");
//           System.out.println("Number was: " + randomStarForceNumber);
       }
//       System.out.println("Current Starforce level: " + equip.getItemLevel());
//       System.out.println("Number of items in this sessions: " + equip.getNumberOfEquipmentsUsed());
    }

}
