package com.sda.log4j;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Logger {


     static  Logger logger = null;
     private final String filename = "logger.log";
     private PrintWriter printWriter;

     public Logger(){
         FileWriter fw = null;
         try {
             fw=new FileWriter(filename);
         } catch (IOException e) {
             e.printStackTrace();
         }
         printWriter = new PrintWriter(fw, true);
     }

     static synchronized Logger getInstance(){
        if(logger == null){
            System.out.println("Tworze instacje klasy Logger");
            logger=new Logger();
        }
        return logger;
    }

    public void error(String message){
         printWriter.println("ERROR: "+message);
    }
    public void log(String message){
        printWriter.println("LOG: "+message);
    }
    public void debug(String message){
        printWriter.println("DEBUG: "+message);
    }

}
