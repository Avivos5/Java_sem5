/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cw_1_projekt;

/**
 * Model class of the text file statistics object.
 * 
 * @author Mateusz Grabowski
 */

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
    public void incrementChars(){
        this.charactersCount++;
    }
    
    /**
     * Increases number of vowels by one.
     */
     public void incrementVowels(){
        this.vowelsCount++;
    }
     
     /**
     * Increases number of consonants by one.
     */
      public void incrementConsonants(){
        this.consonantsCount++;
    }
}