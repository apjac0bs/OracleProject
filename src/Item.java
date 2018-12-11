
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.*; // Need to import the Java Utilities to use builtin Date method


// Create the Item interface
public interface Item {

  // Declaration of the MANUFACTURER constant
  String MANUFACTURER = "OracleProduction"; //  A constant called manufacturer that would be set to “OracleProduction”
  String DEFAULTNAME = "Product Name"; // The final keyword is redundant in Interface

  
  String getName(); // A method getName that would return a String

  
  Date getManufactureDate(); // A method getManufactureDate that would return a Date


  int getSerialNumber(); // A method getSerialNumber that would return an int


  void setProductionNumber(int pn); // A method setProductionNumber that would have one integer parameter

  void setName(String name); // A method setName that would have one String parameter

}
