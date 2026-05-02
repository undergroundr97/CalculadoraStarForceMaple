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
                successChance = 150;
                failureChance = 782;
                destroyChance = 68;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 19:
                successChance = 150;
                failureChance = 765;
                destroyChance = 85;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 20:
                successChance = 30;
                failureChance = 595;
                destroyChance = 105;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 21:
//                como fazer o 722 virar 72.25% e o destruction virar 12.75%

                successChance = 150;
                failureChance = 722;
                destroyChance = 130;
                enhance(equip, successChance,failureChance,destroyChance);
            case 22:
                successChance = 150;
                failureChance = 680;
                destroyChance = 170;
                enhance(equip, successChance,failureChance,destroyChance);
                break;
            case 23:
                successChance = 100;
                failureChance = 720;
                destroyChance = 180;
                enhance(equip, successChance,failureChance,destroyChance);

            case 24:
                successChance = 100;
                failureChance = 720;
                destroyChance = 180;
                enhance(equip, successChance,failureChance,destroyChance);
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
        String nextline = scanner.nextLine();
    }

}
