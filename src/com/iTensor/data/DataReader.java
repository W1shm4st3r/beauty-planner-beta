package com.iTensor.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public static List<String> readData(){
        EvidenceFileReader reader = new EvidenceFileReader();
        List<String> loadedInfo = new ArrayList<>();
        try {
            loadedInfo = reader.loadCosmetic();
        } catch (IOException e){
            System.out.println("Couldn't read the cosmetics.txt file!");
        }
        return loadedInfo;
    }
}
