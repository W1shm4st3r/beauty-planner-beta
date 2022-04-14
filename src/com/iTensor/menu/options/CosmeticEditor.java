package com.iTensor.menu.options;

import com.iTensor.cosmetic.Cosmetic;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class CosmeticEditor {

    public static void editCosmetic() {
        Scanner scanner = new Scanner(System.in);
        try {
            if (cosmeticsList.getCosmeticList().isEmpty()) {
                System.out.println("Lista jest pusta!");
            } else {
                System.out.println("Na pewno? y/n");
                String decision = scanner.next();
                if (decision.equals("y") || decision.equals("Y")) {
                    System.out.print("Podaj ID kosmetyku, ktory chcesz edytowac: ");
                    int id = scanner.nextInt();
                    Cosmetic c = cosmeticsList.getCosmeticById(id);
                    System.out.println("Ktora ceche chcesz edytowac?");
                    System.out.println("1. Nazwa");
                    System.out.println("2. Data otwarcia");
                    System.out.println("3. Data waznosci");
                    System.out.println("4. Liczba aplikacji");
                    System.out.print("Opcja: ");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1 -> {
                            System.out.print("Nazwa: ");
                            String name = scanner.next();
                            c.setName(name);
                        }
                        case 2 -> {
                            System.out.print("Data otwarcia: ");
                            String date = scanner.next();
                            c.setOpeningDate(date);
                        }
                        case 3 -> {
                            System.out.print("Termin waznosci: ");
                            String term = scanner.next();
                            c.setValidityTerm(term);
                        }
                        case 4 -> {
                            System.out.println("1. Zwieksz o 1");
                            System.out.println("2. Zmniejsz o 1");
                            System.out.println("3. Ustaw liczbe aplikacji");
                            System.out.print("Opcja: ");
                            int newOption = scanner.nextInt();
                            int old;
                            switch (newOption) {
                                case 1 -> {
                                    old = c.getApplications();
                                    c.setApplications(c.getApplications() + 1);
                                    System.out.println("Zmieniono liczbe aplikacji z " + old + " na " + c.getApplications());
                                }
                                case 2 -> {
                                    old = c.getApplications();
                                    c.setApplications(c.getApplications() - 1);
                                    System.out.println("Zmieniono liczbe aplikacji z " + old + " na " + c.getApplications());
                                }
                                case 3 -> {
                                    old = c.getApplications();
                                    int number;
                                    System.out.print("Nowa liczba aplikacji: ");
                                    number = scanner.nextInt();
                                    c.setApplications(number);
                                    System.out.println("Zmieniono liczbe aplikacji z " + old + " na " + c.getApplications());
                                }
                            }
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Podaj liczbe!");
        }
    }
}
