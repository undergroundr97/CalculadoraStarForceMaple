package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Refinator {
    private static Scanner scanner = new Scanner(System.in);
    private static int successChance;
    private static int failureChance;
    private static int destroyChance;
    static ArrayList<Integer> numbersTo999 = new ArrayList<>();
    static {
        for (int i = 0; i < 10000 ; i++) {
            numbersTo999.add(i);
        }
    }
    static ArrayList<Integer> succesNumbers;
    static ArrayList<Integer> failureNumbers;

    public static void refineEquip(Equip equip) {
        switch (equip.getItemLevel()) {
            case 18:
                successChance = 1500;
                failureChance = 7820;
                destroyChance = 680;
                enhance(equip, successChance,failureChance);
                break;
            case 19:
                successChance = 1500;
                failureChance = 7650;
                destroyChance = 850;
                enhance(equip, successChance,failureChance);
                break;
            case 20:
                successChance = 3000;
                failureChance = 5950;
                destroyChance = 1050;
                enhance(equip, successChance,failureChance);
                break;
            case 21:
                successChance = 1500;
                failureChance = 7225;
                destroyChance = 1275;
                enhance(equip, successChance,failureChance);
                break;
            case 22:
                successChance = 1500;
                failureChance = 6800;
                destroyChance = 1700;
                enhance(equip, successChance,failureChance);
                break;
            case 23, 24, 25:
                successChance = 1000;
                failureChance = 7200;
                destroyChance = 1800;
                enhance(equip, successChance,failureChance);
                break;
            default:
                System.out.println("Item out of bounds");
                break;
        }
    }


    private static void enhance(Equip equip, int successChance, int failureChance){
       Collections.shuffle(numbersTo999);
       succesNumbers = new ArrayList<>(numbersTo999.subList(0,(successChance-1)));
       failureNumbers = new ArrayList<>(numbersTo999.subList(successChance, (failureChance + successChance)));
//        System.out.println(failureNumbers.size());
//       ArrayList<Integer> destroyNumbers = new ArrayList<>(numbersTo999.subList(failureChance, numbersTo999.size()));

//       for (int i = 0; i < successChance ; i++) {
//           int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.size());
//           succesNumbers.add(numbersTo999.get(randomNumberFromArray));
//           numbersTo999.remove(randomNumberFromArray);
//       }
//       for (int i = 0; i < failureChance ; i++) {
//           int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.size());
//           failureNumbers.add(numbersTo999.get(randomNumberFromArray));
//           numbersTo999.remove(randomNumberFromArray);
//       }
//       for (int i = 0; i < destroyChance ; i++) {
//           int randomNumberFromArray = (int) Math.floor(Math.random() * numbersTo999.size());
//           destroyNumbers.add(numbersTo999.get(randomNumberFromArray));
//           numbersTo999.remove(randomNumberFromArray);
//       }
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
