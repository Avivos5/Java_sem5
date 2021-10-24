/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cw_1_projekt;

/**
 *
 * @author Mateusz Grabowski
 */

import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class AppController {
    
    private AppView theView;
    private TextFileStatsModel statsModel;
    public AppController(AppView theView, TextFileStatsModel statsModel) {
        this.theView = theView;
        this.statsModel = statsModel;
    }
    
    public void getPathFromUser(){
        
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        statsModel.setFilePath(path);
          
    }
    
    public void printFileContent() throws Exception{
        
        String filePath;
        try{
            filePath = statsModel.getFilePath();
            FileReader fr = new FileReader(filePath);
            theView.printFile(fr);
            analyzeText();
        }
        catch(IsEmptyException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void analyzeText() throws Exception{
        
        String filePath;
        try{
            filePath = statsModel.getFilePath();
            FileReader fr = new FileReader(filePath);
            int i;
        while ((i = fr.read()) != -1){
            statsModel.incrementChars();

            if(TextFileStatsModel.VOWELS.contains(Character.toUpperCase((char)i))){
                statsModel.incrementVowels();
            }
            else if(TextFileStatsModel.CONSONANTS.contains(Character.toUpperCase((char)i))){
                statsModel.incrementConsonants();
            } 
        }
        int otherChars = statsModel.getCharCount() - (statsModel.getVowelsCount() + statsModel.getConsonantsCount());
        theView.printStats(statsModel.getCharCount(), statsModel.getVowelsCount(), statsModel.getConsonantsCount(), otherChars);
        }
        catch(IsEmptyException ex){
            System.out.println(ex.getMessage());
        }
    }
}
