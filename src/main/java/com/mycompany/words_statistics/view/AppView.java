/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.words_statistics.view;

/**
 * View class of the application.
 * 
 * @author Mateusz Grabowski
 */

import com.mycompany.words_statistics.CharLambdaExpression;
import java.io.*;
import java.util.Set;
import java.util.stream.Stream;

public class AppView {
    
    /**
    * Prints request to enter the path to the console. 
    */
    public void askForPath(){
        System.out.println("Enter path to the file: ");  
    }
    
    /**
    * Prints the text file value.
    * 
    * @param fr FileReader type which represents file to print.
    * @throws Exception when problem with fr occurs.
    */
    public void printFile(FileReader fr) throws Exception{
        
        System.out.println("File Content: ");
        
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
        
        System.out.println("\n");
    }
    
    /**
    * Prints the statistics of the text file.
    * 
    * @param charactersCount Number of characters in text.
    * @param vowelsCount  Number of characters in text.
    * @param consonantsCount Number of consonants in text.
    * @param otherChars Number of other character types in text.
    */
    public void printStats(int charactersCount, int vowelsCount, int consonantsCount, int otherChars){
        System.out.println("File Statistics: ");
        System.out.println("Characters count: " + charactersCount);
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
        System.out.println("Other characters: " + otherChars);
    }
    
   /**
    * Prints information of wrong path. 
    */
   public void pringWrongPath(){
       System.out.println("Wrong path :/");
   }
   
    /**
     * Prints vowels and consonants used in program.
     * @param vowels set of Vowels
     * @param consonants set of Consonants
     * @param lambdaObj instance of lambda expression
     * @param makeLower instance of lambda function
     */
    public void printChars(Set<Character> vowels, Set<Character> consonants, CharLambdaExpression lambdaObj, CharLambdaExpression.CharFn makeLower){
       
       Stream<Character> vowelsStream = vowels.stream();
       Stream<Character> consonantsStream = consonants.stream();
       
       System.out.println("Vowels: ");
       vowelsStream.forEach(e -> System.out.print(lambdaObj.charOperation(e, makeLower) + " "));
       System.out.println("\n");
       
       System.out.println("Consonants: ");
       consonantsStream.forEach(e -> System.out.print(lambdaObj.charOperation(e, makeLower) + " "));
       System.out.println("\n");
   }
}
