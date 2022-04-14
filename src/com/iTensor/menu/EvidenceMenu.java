package com.iTensor.menu;

import com.iTensor.cosmetic.CosmeticsList;
import com.iTensor.data.DataLoader;
import com.iTensor.data.DataSaver;
import com.iTensor.menu.options.*;
import static com.iTensor.menu.options.MenuDisplayer.pressEnter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvidenceMenu {
    public static CosmeticsList cosmeticsList = new CosmeticsList();

    public void start() {
        DataLoader.loadEvidenceState();
        int option = -1;
        while (option != 0) {
            MenuDisplayer.displayMenu();
            Scanner scanner = new Scanner(System.in);
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You have to type a number!");
                continue;
            }
            switch (option) {
                case 1 -> {
                    CosmeticAdder.addCosmetic();
                    pressEnter();
                }
                case 2 -> {
                    ApplicationAdder.addApplication();
                    pressEnter();
                }
                case 3 -> {
                    CosmeticEditor.editCosmetic();
                    pressEnter();
                }
                case 4 -> {
                    MenuOptionsDisplayer.displayCosmeticsList();
                    pressEnter();
                }
                case 5 -> {
                    CosmeticRemover.removeCosmetic();
                    pressEnter();
                }
                case 6 -> {
                    DataSaver.saveData();
                    pressEnter();
                }
                case 0 -> DataSaver.saveData();
            }
        }
    }
}
