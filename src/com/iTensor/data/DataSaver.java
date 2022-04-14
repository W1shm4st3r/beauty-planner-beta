package com.iTensor.data;

import com.iTensor.cosmetic.Cosmetic;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class DataSaver {
    public static void saveData() {
        EvidenceFileWriter writer = new EvidenceFileWriter();
        writer.clearFile("cosmetics.txt");
        for (Cosmetic c : cosmeticsList.getCosmeticList()) {
            writer.save(c);
        }
        System.out.println("Poprawnie zapisano");
    }
}
