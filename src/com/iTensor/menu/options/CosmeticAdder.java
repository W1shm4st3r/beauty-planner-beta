package com.iTensor.menu.options;

import com.iTensor.cosmetic.Cosmetic;

import java.util.Scanner;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class CosmeticAdder {

    public static void addCosmetic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure? y/n");
        String decision = scanner.next();
        if (decision.equals("y") || decision.equals("Y")) {
            System.out.print("Name: ");
            scanner.useDelimiter("\n");
            String name;
            name = scanner.next();
            System.out.print("Opening date: ");
            String openingDate = scanner.next();
            System.out.print("Validity term: ");
            String validityTerm = scanner.next();
            Cosmetic c = new Cosmetic(
                    name,
                    openingDate,
                    validityTerm
            );
            cosmeticsList.addCosmeticToList(c);
            cosmeticsList.addIdToList(c.getId());
            System.out.println("Cosmetic added correctly");
        }
    }

    public static void addCosmetic(int id, String name, int applications, String openingDate, String validityTerm) {
        Cosmetic c = new Cosmetic(
                id,
                name,
                applications,
                openingDate,
                validityTerm
        );
        cosmeticsList.addCosmeticToList(c);
        cosmeticsList.addIdToList(c.getId());
    }
}
