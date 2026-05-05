package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String confirm = "";
        int iterations = 1000;
        ArrayList<Integer> resultados = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            Equip equip;
            int totalEquips = 0;
            for (int j = 0; j < 1 ; j++) {
                equip = new Equip();
                while(!equip.getItemLevel().equals(22)){
                    if (equip.getDestroyed()){
                        totalEquips += 1;
                        equip = new Equip();
                    }
                    Refinator.refineEquip(equip);
//                    System.out.println("This is iteration: " + i);
                }

            }

            resultados.add(totalEquips);
        }

//        while(!equip.getItemLevel().equals(25)){
//            if (equip.getDestroyed()){
//                equip = new Equip();
//            }
//            Refinator.refineEquip(equip);
//        }
        int total = 0;
        for (Integer resultado : resultados) {
            total += resultado;
        }
        System.out.println("Total de itens: " + total);
        System.out.println("Range of booms: " + resultados.stream().mapToInt(Integer::intValue).min().getAsInt() + " " +
                "- " + resultados.stream().mapToInt(Integer::intValue).max().getAsInt());
        System.out.println("Average: " + resultados.stream().mapToInt(Integer::intValue).average().getAsDouble());
//        System.out.println("Booms avg 18-22: " + (double) total / iterations);
//        do {
//            if (equip.getDestroyed()){
//                equip = new Equip();
//            }
//            Refinator.refineEquip(equip);
//             confirm = scanner.nextLine();
//        } while (!confirm.equals("n"));
    }
}
