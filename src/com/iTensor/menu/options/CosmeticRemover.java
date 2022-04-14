package com.iTensor.menu.options;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class CosmeticRemover {
    public static void removeCosmetic() {
        Scanner scanner = new Scanner(System.in);
        if (cosmeticsList.getCosmeticList().isEmpty()) {
            System.out.println("Lista jest pusta!");
        } else {
            try {
                System.out.println("Na pewno? y/n");
                String decision = scanner.next();
                if (decision.equals("y") || decision.equals("Y")) {
                    System.out.println("");
                    System.out.print("Podaj ID kosmetyku: ");
                    int id = scanner.nextInt();
                    if (cosmeticsList.getCosmeticsIds().contains(id)) {
                        cosmeticsList.removeCosmeticFromList(id);
                        System.out.println("Poprawnie usnieto kosmetyk");
                    } else {
                        System.out.println("Nie ma takiego ID!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Podaj liczbe!");
            }
        }
    }
}
