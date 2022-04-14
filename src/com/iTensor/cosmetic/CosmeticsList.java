package com.iTensor.cosmetic;

import java.util.ArrayList;
import java.util.List;

public class CosmeticsList {
    public List<Cosmetic> cosmeticList = new ArrayList<>();
    public List<Integer> cosmeticsIds = new ArrayList<>();

    public void addCosmeticToList(Cosmetic cosmetic) {
        cosmeticList.add(cosmetic);
    }

    public void addIdToList(int id) {
        cosmeticsIds.add(id);
    }

    public void removeCosmeticFromList(int id) {
        cosmeticList.removeIf(c -> c.getId() == id);
    }

    public Cosmetic getCosmeticById(int id) {
        for (Cosmetic c : cosmeticList) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    // Setters and Getters
    public List<Cosmetic> getCosmeticList() {
        return cosmeticList;
    }

    public List<Integer> getCosmeticsIds() {
        return cosmeticsIds;
    }
}
