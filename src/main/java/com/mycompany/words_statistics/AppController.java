/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.words_statistics;

/**
 * Controller class of the application.
 * 
 * @author Mateusz Grabowski
 */

import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class AppController {
    
    /**
    * Instance of AppView class.
    */
    private AppView theView;
    
    /**
    * Instance of TextFileStatsModel class.
    */
    private TextFileStatsModel statsModel;
    
    /**
    * Constructructor with parameters.
    * 
    * @param theView instance of AppView class.
    * @param statsModel istance of TextFileStatsModel.
    */
    public AppController(AppView theView, TextFileStatsModel statsModel) {
        this.theView = theView;
        this.statsModel = statsModel;
    }
    
    /**
    * Request user to enter path to the text file.
    */
    public void getPathFromUser(){
        
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        statsModel.setFilePath(path);
          
    }
    
    
    /**
    * Gets file path from Model and pass it to the View to print it in console.
    * 
    * @throws Exception when problem with file path occurs.
    */
    public void printFileContent() throws Exception{
        
        String filePath;
        try{
            filePath = statsModel.checkIfFilePathIsSet();
            FileReader fr = new FileReader(filePath);
            theView.printFile(fr);
            analyzeText();
        }
        catch(IsEmptyException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    /**
     * Analyze text character by character and count statistics
     * 
     * @throws Exception when problem with file path occurs.
     */
    public void analyzeText() throws Exception{
        
        String filePath;
        try{
            filePath = statsModel.checkIfFilePathIsSet();
            FileReader fr = new FileReader(filePath);
            int i;
        while ((i = fr.read()) != -1){
            statsModel.incrementChars(1);

            if(TextFileStatsModel.VOWELS.contains(Character.toUpperCase((char)i))){
                statsModel.incrementVowels(1);
            }
            else if(TextFileStatsModel.CONSONANTS.contains(Character.toUpperCase((char)i))){
                statsModel.incrementConsonants(1);
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
