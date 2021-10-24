/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cw_1_projekt;

/**
 * Exception class for objects thrown when attempting to return empty value.
 *
 * @author Gall Anonim
 */
class IsEmptyException extends Exception {

    /**
     * Non-parameter constructor
     */
    public IsEmptyException() {
    }

    /**
     * Exception class constructor
     *
     * @param message display message
     */
    public IsEmptyException(String message) {
        super(message);
    }
}
