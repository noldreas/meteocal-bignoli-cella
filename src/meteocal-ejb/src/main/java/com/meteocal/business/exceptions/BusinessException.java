/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meteocal.business.exceptions;

/**
 *
 * @author Andrea Bignoli
 */
public class BusinessException extends Exception {
    
    public static final String MISSING_PASSWORD = "[SECURITY] Current password is required to perform this operation.";
    public static final String WRONG_PASSWORD = "[SECURITY] The given password doesn't match the current database entry.";

    public static final String INCONSISTENT_NOTIFICATION_CANCEL = "[NOTIFICATION CREATION] Requested notification cancel for a non canceled event.";
    
    public static String EVENT_CREATION_INTERNAL_PROCESSING = "[EVENT CREATION] Event creation internall processing: couldn't find creator.";
    
    /**
     * Creates a new instance of <code>BusinessException</code> without detail
     * message.
     */
    public BusinessException() {
    }

    /**
     * Constructs an instance of <code>BusinessException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public BusinessException(String msg) {
        super(msg);
    }
}
