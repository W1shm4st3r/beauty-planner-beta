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
                System.out.println("The list is empty!");
            } else {
                System.out.println("Are you sure? y/n");
                String decision = scanner.next();
                if (decision.equals("y") || decision.equals("Y")) {
                    System.out.print("Type ID of a cosmetic you want to edit: ");
                    int id = scanner.nextInt();
                    Cosmetic c = cosmeticsList.getCosmeticById(id);
                    System.out.println("What feature you want to edit?");
                    System.out.println("1. Name");
                    System.out.println("2. Opening date");
                    System.out.println("3. Validity term");
                    System.out.println("4. Number of applications");
                    System.out.print("Opction: ");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1 -> {
                            System.out.print("Name: ");
                            String name = scanner.next();
                            c.setName(name);
                        }
                        case 2 -> {
                            System.out.print("Opening date: ");
                            String date = scanner.next();
                            c.setOpeningDate(date);
                        }
                        case 3 -> {
                            System.out.print("Validity term: ");
                            String term = scanner.next();
                            c.setValidityTerm(term);
                        }
                        case 4 -> {
                            System.out.println("1. Increase by 1");
                            System.out.println("2. Decrease by 1");
                            System.out.println("3. Set the number of applications");
                            System.out.print("Option: ");
                            int newOption = scanner.nextInt();
                            int old;
                            switch (newOption) {
                                case 1 -> {
                                    old = c.getApplications();
                                    c.setApplications(c.getApplications() + 1);
                                    System.out.println("Number of applications change from " + old + " to " + c.getApplications());
                                }
                                case 2 -> {
                                    old = c.getApplications();
                                    c.setApplications(c.getApplications() - 1);
                                    System.out.println("Number of applications change from " + old + " to " + c.getApplications());
                                }
                                case 3 -> {
                                    old = c.getApplications();
                                    int number;
                                    System.out.print("New number of applications: ");
                                    number = scanner.nextInt();
                                    c.setApplications(number);
                                    System.out.println("Number of applications change from " + old + " to " + c.getApplications());
                                }
                            }
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You have to type a number!");
        }
    }
}
