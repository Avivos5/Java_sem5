/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.words_statistics;

/**
 *
 * @author Mateusz Grabowski
 */
public class CharLambdaExpression {
    
    interface CharFn {
         String operation(char a);
    }

    String charOperation(char a, CharFn op) {
          return op.operation(a);
    }
}
