package com.iTensor.menu.options;

import com.iTensor.cosmetic.Cosmetic;

import java.util.Scanner;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class MenuDisplayer {

    public static void displayMenu() {
        System.out.println("-----------------------------");
        System.out.println("KALKULATOR ZUZYCIA KOSMETYKOW");
        System.out.println("-----------------------------");
        System.out.println("LISTA KOSMETYKOW:");
        for (Cosmetic c : cosmeticsList.getCosmeticList()) {
            System.out.println(c.getId() + ". " + c.getName() + " | Liczba aplikacji: " + c.getApplications());
        }
        System.out.println("-----------------------------");
        System.out.println("1. Dodaj kosmetyk");
        System.out.println("2. Dodaj aplikacje");
        System.out.println("3. Edytuj kosmetyk");
        System.out.println("4. Lista kosmetykow");
        System.out.println("5. Usun kosmetyk");
        System.out.println("6. Zapisz zmiany");
        System.out.println("0. Zakoncz");
        System.out.print("Opcja: ");
    }

    public static void pressEnter() {
        System.out.println("Press ENTER to continue");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
