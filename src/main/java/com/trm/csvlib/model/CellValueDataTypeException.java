/*
 *  Copyright (c) 2020, trm factory, Lukas Trommer. All rights reserved.
 *  This software is provided under a separate licence agreement only.
 *  Further usage, modification and/or redistribution without the written permission of the author(s)
 *  is strictly prohibited.
 */

package com.trm.csvlib.model;

/**
 * @author Lukas Trommer
 * @since 1.0
 */
public class CellValueDataTypeException extends CellValueException {

    public CellValueDataTypeException(CellAddress address) {
        super(address);
    }

    public CellValueDataTypeException(String message, CellAddress address) {
        super(message, address);
    }
}
