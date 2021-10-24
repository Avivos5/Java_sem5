/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cw_1_projekt;

/**
 *
 * @author Mateusz Grabowski
 */
public class TextFileModel {
    
    private String filePath;
    
    public void setFilePath(String path){
        this.filePath = path;
    }
            
    public String getFilePath() throws IsEmptyException{
        if(this.filePath.isEmpty()){
            throw new IsEmptyException("The path is not set!");
        } else{
            return this.filePath;
        }
    }
    
}

