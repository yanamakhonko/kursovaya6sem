package com.milos.vulic.quiz.services;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Singleton {
    private static Singleton date;
    public static synchronized Singleton getInstance() {
        if (date == null) {
            date = new Singleton();
        }
        return date;
    }
    public void addPrWriteFile(String writeInfo){
        try {
            Date dateNow = new Date();
            String logFile =  writeInfo + ": " + dateNow.toString() + "\n";
            String filePath = "log.txt";
            FileWriter wr = new FileWriter(filePath, true);
            wr.append(logFile);
            wr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
