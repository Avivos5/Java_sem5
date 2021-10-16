/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cw_1_projekt;

import java.io.*;
import java.util.*; 

/**
 *
 * @author Mateusz Grabowski
 */
public class WordsStatistics {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter path to the file: ");  
        String filePath= sc.nextLine();
        System.out.println("You have entered: "+filePath);
        
        FileReader fr = new FileReader(filePath);
 
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char)i);
    
    }    
}
