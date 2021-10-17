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

public class AppController {
    
    private AppView theView;
    private TextFileStatsModel statsModel;
    
    public AppController(AppView theView, TextFileStatsModel statsModel) {
        this.theView = theView;
        this.statsModel = statsModel;
    }
    
    public void getPathFromUser(){
     
        statsModel.setFilePath(theView.askForPath());
          
    }
    
    public void printFileContent() throws Exception{
        
        FileReader fr = new FileReader(statsModel.getFilePath());
        theView.printFile(fr);
    }
    
    public void printStats() {
        theView.printStats(statsModel.getCharCount(), statsModel.getVowelsCount(), statsModel.getConsonantsCount());
    }

}
