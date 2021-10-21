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
        
        FileReader fr = new FileReader(statsModel.getFilePath());
        theView.printFile(fr);
        analyzeText();
    }
    
    public void analyzeText() throws Exception{
        
        FileReader fr = new FileReader(statsModel.getFilePath());
       
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
}
