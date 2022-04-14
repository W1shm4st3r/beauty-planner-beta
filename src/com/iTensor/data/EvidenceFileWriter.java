package com.iTensor.data;

import com.iTensor.cosmetic.Cosmetic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EvidenceFileWriter {

    public void save(Cosmetic cosmetic){
        BufferedWriter br = null;
        try {
            FileWriter fw = new FileWriter("cosmetics.txt", true);
            br = new BufferedWriter(fw);
            br.write(cosmetic.getDataToSave());
            br.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR: Nie mozna otworzyc pliku cosmetics.txt");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("ERROR: Nie mozna zamknac pliku cosmetics.txt");
                e.printStackTrace();
            }
        }
    }

    public void clearFile(String filePath) {
        BufferedWriter br = null;
        try {
            FileWriter fw = new FileWriter(filePath);
            br = new BufferedWriter(fw);
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR: Nie mozna otworzyc pliku cosmetics.txt");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("ERROR: Nie mozna zamknac pliku cosmetics.txt");
                e.printStackTrace();
            }
        }
    }
}

