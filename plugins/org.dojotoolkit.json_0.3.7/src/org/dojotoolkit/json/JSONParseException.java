/*
    Copyright (c) 2004-2010, The Dojo Foundation All Rights Reserved.
    Available via Academic Free License >= 2.1 OR the modified BSD license.
    see: http://dojotoolkit.org/license for details

    This code has been generously donated by Pat Mueller (http://muellerware.org/)
*/
package org.dojotoolkit.json;

import java.io.IOException;

/**
 *
 */
public class JSONParseException extends IOException {

    /**
     * 
     */
    public JSONParseException() {
        super();
    }
    
    /**
     * 
     */
    public JSONParseException(String message) {
        super(message);
    }
}
