package com.iTensor.menu.options;

import com.iTensor.cosmetic.Cosmetic;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class ApplicationAdder {
    public static void addApplication() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Are you sure? y/n");
            String decision = scanner.next();
            if (decision.equals("y") || decision.equals("Y")) {
                try {
                    System.out.print("Type ID of a cosmetic you want to use: ");
                    int id = scanner.nextInt();
                    Cosmetic c = cosmeticsList.getCosmeticById(id);
                    c.setApplications(c.getApplications() + 1);
                    System.out.println("Number of applications of " + c.getName() + " increased by 1!");
                    System.out.println("Current number of applications: " + c.getApplications());
                } catch (NullPointerException e) {
                    System.out.println("No such ID!");
                }
            }
        } catch (InputMismatchException e){
            System.out.println("You have to type a number!");
        }
    }
}
