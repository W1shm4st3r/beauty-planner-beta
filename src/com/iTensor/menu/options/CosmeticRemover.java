package com.iTensor.menu.options;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class CosmeticRemover {
    public static void removeCosmetic() {
        Scanner scanner = new Scanner(System.in);
        if (cosmeticsList.getCosmeticList().isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            try {
                System.out.println("Are you sure? y/n");
                String decision = scanner.next();
                if (decision.equals("y") || decision.equals("Y")) {
                    System.out.println("");
                    System.out.print("Type ID of a cosmetic you want to remove: ");
                    int id = scanner.nextInt();
                    if (cosmeticsList.getCosmeticsIds().contains(id)) {
                        cosmeticsList.removeCosmeticFromList(id);
                        System.out.println("Cosmetic removed correctly");
                    } else {
                        System.out.println("No such ID!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("You have to type a number!");
            }
        }
    }
}
