package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Equip equip = new Equip();
       while(!equip.getDestroyed())
            Refinator.refineEquip(equip);
            System.out.println("Press enter to continue");
            String enter = scanner.nextLine();
        };
}
