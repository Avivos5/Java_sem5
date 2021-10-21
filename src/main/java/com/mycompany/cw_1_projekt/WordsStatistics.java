/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cw_1_projekt;

/**
 *
 * @author Mateusz Grabowski
 */
public class WordsStatistics {
    
    public static void main(String[] args) {
        
        AppView theView = new AppView();
        TextFileStatsModel statsModel = new TextFileStatsModel();
        AppController theController = new AppController(theView, statsModel);
        
        
        if(args.length != 0) {
            statsModel.setFilePath(args[0]);
        }
        else{
            theView.askForPath();
            theController.getPathFromUser();
        }
        
        try {
            theController.printFileContent();
        } 
        catch(Exception e) {
            theView.pringWrongPath();
            return;
        }
    }    
}
