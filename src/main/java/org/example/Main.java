package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Equip equip = new Equip();
        String confirm = "";
        do {
            if (equip.getDestroyed()){
                equip = new Equip();
            }
            Refinator.refineEquip(equip);
             confirm = scanner.nextLine();
        } while (!confirm.equals("n"));
    }
}
