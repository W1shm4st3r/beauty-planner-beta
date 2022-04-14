package com.iTensor.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EvidenceFileReader {
    public List<String> loadCosmetic() throws IOException {
        // Creates File object with path parameter
        File file = new File("cosmetics.txt");

        // Creates BufferedReader object with created File object as argument
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Initiates conditional variable to check if file is empty
        boolean isEmpty = true;

        String st;
        List<String> cosmeticInfo = new ArrayList<>();

        // Iterates through file
        while ((st = br.readLine()) != null) {
            isEmpty = false;
            if (st.contains("-----") || st.equals("")) {
            } else {
                cosmeticInfo.add(st);
                }
            }
        if (isEmpty) {
            System.out.println("File cosmetics.txt has no data to load. Program continue...");
        }
        return cosmeticInfo;
    }
}