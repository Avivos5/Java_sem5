/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.words_statistics;

import com.mycompany.words_statistics.controller.AppController;
import com.mycompany.words_statistics.view.AppView;
import com.mycompany.words_statistics.view.GUI_View;
import com.mycompany.words_statistics.model.TextFileStatsModel;

/**
 * Main class o the application which prints statistics of a text in text file.
 *
 * @author Mateusz Grabowski
 */
public class WordsStatistics {
    
    /**
     * Main method of the application.
     *
     * @param args first arg - path to the text file.
     */
    public static void main(String[] args) {
        
//       CharLambdaExpression lambdaObj = new CharLambdaExpression();
//       CharLambdaExpression.CharFn makeLower = a -> String.valueOf(Character.toLowerCase(a));
        
//        AppView theView = new AppView();
        GUI_View theView = new GUI_View();
        TextFileStatsModel statsModel = new TextFileStatsModel();
        AppController theController = new AppController(theView, statsModel);
        
        theController.initController();
                
//        if(args.length != 0) {
//            statsModel.setFilePath(args[0]);
//        }
//        else{
//            theView.askForPath();
//            theController.getPathFromUser();
//        }
//        
//        theView.printChars(TextFileStatsModel.VOWELS, TextFileStatsModel.CONSONANTS, lambdaObj, makeLower);
//        
//        try {
//            theController.printFileContent();
//        }
//        catch(Exception ex) {
//            theView.pringWrongPath();
//            return;
//        }
    }    
}
