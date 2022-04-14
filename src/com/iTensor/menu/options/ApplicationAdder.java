package com.iTensor.menu.options;

import com.iTensor.cosmetic.Cosmetic;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class ApplicationAdder {
    public static void addApplication() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Na pewno? y/n");
            String decision = scanner.next();
            if (decision.equals("y") || decision.equals("Y")) {
                try {
                    System.out.print("Podaj ID kosmetyku, ktorego chcesz uzyc: ");
                    int id = scanner.nextInt();
                    Cosmetic c = cosmeticsList.getCosmeticById(id);
                    c.setApplications(c.getApplications() + 1);
                    System.out.println("Liczba aplikacji " + c.getName() + " zwiekszona o 1!");
                    System.out.println("Aktualna liczba aplikacji: " + c.getApplications());
                } catch (NullPointerException e) {
                    System.out.println("Nie ma takiego ID!");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("Podaj liczbe!");
        }
    }
}
