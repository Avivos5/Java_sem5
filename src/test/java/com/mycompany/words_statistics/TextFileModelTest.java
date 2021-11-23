/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.words_statistics;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author mateg
 */
public class TextFileModelTest {
    
     private TextFileModel testObj;
    
    /**
     * Setup functions which creates instace of tested class.
     */
    @BeforeEach
    public void setup(){
        testObj = new TextFileModel();
    }
    
    
    /**
     * Test which checks if Exeption is throwed in checkIfFilePathIsSet method.
     * @param pathContent content of the path.
     */
    @ParameterizedTest
    @ValueSource(strings = {""})
    public void getFilePathExeption(String pathContent){
        try {
            testObj.setFilePath(pathContent);
            testObj.checkIfFilePathIsSet();
            fail("An exception should be thrown when path is empty");
        } catch (IsEmptyException e) {
            assertTrue(e.getMessage().contains("The path is not set!"), "Unexpected message!");
        }
    }
    
}
