/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.words_statistics.model;

/**
 * Model class of the text file statistics object.
 * 
 * @author Mateusz Grabowski
 */

import com.mycompany.words_statistics.model.TextFileModel;
import java.util.*;

public class TextFileStatsModel extends TextFileModel{
    
    /** Set of vowels characters
    */
    public static final Set<Character> VOWELS = Set.of('A', 'E', 'I', 'O', 'U');
    
    /** Set of consonants characters
    */
    public static final Set<Character> CONSONANTS = Set.of('B', 'C', 'D', 'F', 'G', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'S', 'T', 'V', 'X', 'Z', 'H', 'R', 'W', 'Y');
    
    /** Number of characters in the text.
    */
    private int charactersCount = 0;
    
    /** Number of vowels in the text.
    */
    private int vowelsCount = 0;
    
    /** Number of consonants in the text.
    */
    private int consonantsCount = 0;
    
    
    /**
     * Sets number of characters.
     *
     * @param number to set
     */
    public void setCharCount(int number){
     this.charactersCount = number;   
    }
    
    /**
     * Sets number of vowels.
     *
     * @param number to set
     */
    public void setVowelsCount(int number){
     this.vowelsCount = number;   
    }
    
    /**
     * Sets number of consonants.
     *
     * @param number to set
     */
    public void setConsonantsCount(int number){
     this.consonantsCount = number;   
    }
    
    /**
     * Gets number of characters.
     *
     * @return a private charactersCount from object.
     */
    public int getCharCount(){
     return this.charactersCount;   
    }
    
    /**
     * Gets number of vowels.
     *
     * @return a private vowelsCount from object.
     */
    public int getVowelsCount(){
     return this.vowelsCount;   
    }
    
    /**
     * Gets number of consonants.
     *
     * @return a private consonantsCount from object.
     */
    public int getConsonantsCount(){
     return this.consonantsCount;   
    }
    
    /**
     * Increases number of characters by one.
     */
    public void incrementChars(int number){
        this.charactersCount += number;
    }
    
    /**
     * Increases number of vowels by one.
     */
     public void incrementVowels(int number){
        this.vowelsCount += number;
    }
     
     /**
     * Increases number of consonants by one.
     */
      public void incrementConsonants(int number){
        this.consonantsCount += number;
    }
}