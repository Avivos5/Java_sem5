/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cw_1_projekt;

/**
 *
 * @author Mateusz Grabowski
 */

import java.util.*;

public class TextFileStatsModel extends TextFileModel{
    
    public static final Set<Character> VOWELS = Set.of('A', 'E', 'I', 'O', 'U');
    public static final Set<Character> CONSONANTS = Set.of('B', 'C', 'D', 'F', 'G', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'S', 'T', 'V', 'X', 'Z', 'H', 'R', 'W', 'Y');
    private int charactersCount = 0;
    private int vowelsCount = 0;
    private int consonantsCount = 0;
    
    public int getCharCount(){
     return this.charactersCount;   
    }
    
    public int getVowelsCount(){
     return this.vowelsCount;   
    }
    
    public int getConsonantsCount(){
     return this.consonantsCount;   
    }
    
    public void incrementChars(){
        this.charactersCount++;
    }
    
     public void incrementVowels(){
        this.vowelsCount++;
    }
     
      public void incrementConsonants(){
        this.consonantsCount++;
    }
}