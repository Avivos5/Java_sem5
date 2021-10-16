/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cw_1_projekt;

/**
 *
 * @author Mateusz Grabowski
 */
public class TextFileStatsModel extends TextFileModel{
    
//    private String filePath;
    private int charactersCount = 0;
    private int vowelsCount = 0;
    private int consonantsCount = 0;
    
    
//    public TextFileStatsModel(String path){
//        super(path);
//    }
    
    public int getCharCount(){
     return this.charactersCount;   
    }
    
    public int getVowelsCount(){
     return this.vowelsCount;   
    }
    
    public int getConsonantsCount(){
     return this.consonantsCount;   
    }
}