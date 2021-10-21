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

public class AppView {
    
    public void askForPath(){
        System.out.println("Enter path to the file: ");
        
    }
    
    public void printFile(FileReader fr) throws Exception{
        
        System.out.println("File Content: ");
        
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
        
        System.out.println("\n");
    }
    
    public void printStats(int charactersCount, int vowelsCount, int consonantsCount, int otherChars){
        System.out.println("File Statistics: ");
        System.out.println("Characters count: " + charactersCount);
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
        System.out.println("Other characters: " + otherChars);
    }
    
   public void pringWrongPath(){
       System.out.println("Wrong path :/");
   }
}
