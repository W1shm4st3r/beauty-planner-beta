package com.iTensor.menu.options;

import com.iTensor.cosmetic.Cosmetic;

import java.util.Scanner;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class MenuDisplayer {

    public static void displayMenu() {
        System.out.println("-----------------------------");
        System.out.println("COSMETICS CONSUMPTION CALCULATOR");
        System.out.println("-----------------------------");
        System.out.println("LIST OF COSMETICS:");
        for (Cosmetic c : cosmeticsList.getCosmeticList()) {
            System.out.println(c.getId() + ". " + c.getName() + " | Number of applications: " + c.getApplications());
        }
        System.out.println("-----------------------------");
        System.out.println("1. Add cosmetic");
        System.out.println("2. Add application");
        System.out.println("3. Edit cosmetic");
        System.out.println("4. List of cosmetics");
        System.out.println("5. Remove cosmetic");
        System.out.println("6. Save changes");
        System.out.println("0. Exit");
        System.out.print("Option: ");
    }

    public static void pressEnter() {
        System.out.println("Press ENTER to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
