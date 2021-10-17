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
import java.io.*;

public class AppView {
    
    public String askForPath(){
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter path to the file: ");  
        String filePath= input.nextLine();
        
        return filePath;
    }
    
    public void printFile(FileReader fr) throws Exception{
        
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
        
        System.out.println("\n");
    }
    
    public void printStats(int charactersCount, int vowelsCount, int consonantsCount){
        System.out.println("Characters count: " + charactersCount);
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
    }
}
