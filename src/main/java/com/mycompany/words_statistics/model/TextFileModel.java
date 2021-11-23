/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.words_statistics.model;

import com.mycompany.words_statistics.exceptions.IsEmptyException;

/**
 * Model class of the text file object.
 *
 * @author Mateusz Grabowski
 */
public class TextFileModel {
    
    /** Represents the employee’s address.
    */
    private String filePath = "";
    
    /** Sets private filePath value.
    * @param path Path to the text file.
    */
    public void setFilePath(String path){
        this.filePath = path;
    }
      
    /**
     * Gets filePath value.
     *
     * @return a private filePath value from object
     * @throws IsEmptyException when attempt to return empty path.
     */
    public String checkIfFilePathIsSet() throws IsEmptyException{
        if(this.filePath.isEmpty()){
            throw new IsEmptyException("The path is not set!");
        } else{
            return this.filePath;
        }
    }
    
}

