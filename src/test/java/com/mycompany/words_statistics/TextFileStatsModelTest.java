/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.words_statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Mateusz Grabowski
 */
public class TextFileStatsModelTest {
    
    private TextFileStatsModel testObj;
    
    /**
     * Setup functions which creates instace of tested class.
     */
    @BeforeEach
    public void setup(){
        testObj = new TextFileStatsModel();
    }

    /**
     * Test of incrementChars method, of class TextFileStatsModel.
     * @param incrementValue Value which increments count.
     */
    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 0, 1, 2})
    public void shouldIncrementCharsCountByProvidedValue(int incrementValue) {
        testObj.incrementChars(incrementValue);
        assertEquals(incrementValue, testObj.getCharCount(), "Chars number wrongly incremented.");
    }
    
    /**
     * Test of incrementVowels method, of class TextFileStatsModel.
     * @param incrementValue Value which increments count.
     */
    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 0, 1, 2})
    public void shouldIncrementVowelsCountByProvidedValue(int incrementValue) {
        testObj.incrementVowels(incrementValue);
        assertEquals(incrementValue, testObj.getVowelsCount(), "Vowels number wrongly incremented.");
    }
    
    /**
     * Test of incrementConsonants method, of class TextFileStatsModel.
     * @param incrementValue Value which increments count.
     */
    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 0, 1, 2})
    public void shouldIncrementConsonantsCountByProvidedValue(int incrementValue) {
        testObj.incrementConsonants(incrementValue);
        assertEquals(incrementValue, testObj.getConsonantsCount(), "Consonants number wrongly incremented.");
    }

}
