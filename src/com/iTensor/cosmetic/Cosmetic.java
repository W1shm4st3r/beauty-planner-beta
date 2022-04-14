package com.iTensor.cosmetic;

import java.util.Collections;

import static com.iTensor.menu.EvidenceMenu.cosmeticsList;

public class Cosmetic implements Savable {
    private int id;
    private String name;
    private int applications = 0;
    private String openingDate;
    private String validityTerm;
    private static int cosmeticCount = 0;

    // Constructors
    public Cosmetic(String name, String openingDate, String validityTerm) {
        if (cosmeticsList.getCosmeticList().isEmpty()) {
            this.id = ++cosmeticCount;
        } else {
            this.id = Collections.max(cosmeticsList.getCosmeticsIds())+1;
        }
        this.name = name;
        this.openingDate = openingDate;
        this.validityTerm = validityTerm;
    }

    public Cosmetic(int id, String name, int applications, String openingDate, String validityTerm) {
        this.id = id;
        ++cosmeticCount;
        this.name = name;
        this.applications = applications;
        this.openingDate = openingDate;
        this.validityTerm = validityTerm;
    }

    // Methods
    public void info() {
        System.out.println("Cosmetic " + getId());
        System.out.println("Name:            " + getName());
        System.out.println("Opening date:    " + getOpeningDate());
        System.out.println("Validity term:  " + getValidityTerm());
        System.out.println("Number of applications: " + getApplications());
        System.out.println("-----------------------------");
    }

    public String getDataToSave() {
        return name + "\n"
                + applications + "\n"
                + openingDate + "\n"
                + validityTerm +
                "\n-----";

    }

    // Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApplications() {
        return applications;
    }

    public void setApplications(int applications) {
        this.applications = applications;
    }

    public int getId() {
        return id;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getValidityTerm() {
        return validityTerm;
    }

    public void setValidityTerm(String validityTerm) {
        this.validityTerm = validityTerm;
    }
}
