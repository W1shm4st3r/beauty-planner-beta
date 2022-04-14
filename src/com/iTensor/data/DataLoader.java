package com.iTensor.data;

import com.iTensor.menu.options.CosmeticAdder;

import java.util.List;

public class DataLoader {
    public static void loadEvidenceState() {
        List<String> loadedCosmeticsInfo = DataReader.readData();
        int i = 0;
        int j = 1;
        while (i < loadedCosmeticsInfo.size()) {
            int id = j++;
            String name = loadedCosmeticsInfo.get(i++);
            int applications = Integer.parseInt(loadedCosmeticsInfo.get(i++));
            String openingDate = loadedCosmeticsInfo.get(i++);
            String validityTerm = loadedCosmeticsInfo.get(i++);
            CosmeticAdder.addCosmetic(id, name, applications, openingDate, validityTerm);
        }
    }
}


