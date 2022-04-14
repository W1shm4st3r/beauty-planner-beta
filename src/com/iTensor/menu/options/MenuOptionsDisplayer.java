package com.iTensor.menu.options;

import com.iTensor.cosmetic.Cosmetic;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class MenuOptionsDisplayer {
    public static void displayCosmeticsList() {
        if (cosmeticsList.getCosmeticList().isEmpty()) {
            System.out.println("Lista jest pusta!");
        } else {
            System.out.println("LISTA KOSMETYKOW:");
            System.out.println("-----------------------------");
            for (Cosmetic c : cosmeticsList.getCosmeticList()) {
                c.info();
            }
        }
    }
}
