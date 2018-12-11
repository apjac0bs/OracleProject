
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.*; // Need to import the Java Utilities to use builtin Date method


// Create an abstract type called Product that will implement the Item interface
public abstract class Product implements Item, Comparable<Product> {

  /**
   * Returns a composed {@code Product}. If performing either operation throws an exception, it is
   * relayed to the caller of the composed operation.  If performing this operation throws an
   * exception, the {@code Product} operation will not be performed.
   */

  // Declaration of class variables
  private int serialNumber;
  private Date manufacturedOn;
  private String name;

  private static int currentProductionNumber; // Add an integer class variable called currentProductionNumbe

  // Implementation of Interface methods

  @Override
  public void setName(String name) {
    this.name = name;
  }

  // Default Constructor
  public Product() {
    setProductionNumber(currentProductionNumber);
    this.name = DEFAULTNAME;
    this.serialNumber = currentProductionNumber;
    this.manufacturedOn = new java.util.Date();
  }

  // Constructor with product name parameter of the String type

  public Product(String name) {
    setProductionNumber(currentProductionNumber);
    this.name = name;
    this.serialNumber = currentProductionNumber;
    this.manufacturedOn = new java.util.Date();
  }

  @Override
  public String getName() { // Add a constructor that will take in the name of the product and set this to the field variable name
    return this.name;
  }

  @Override
  public Date getManufactureDate() {
    return (Date) manufacturedOn.clone();
  }

  @Override
  public int getSerialNumber() {
    return this.serialNumber;
  }

  public static void setPN(int cPN) {
    Product.currentProductionNumber = ++cPN;
  }

  @Override
  public void setProductionNumber(int pn) {
    setPN(pn);
  }

  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.getName());
  }

  // Overriding the Java toString method

  /**
   * @return {@code String} formatted per assignment
   */
  public String toString() {
    return "Manufacturer : " + Product.MANUFACTURER + "\n" +
        "Serial Number : " + this.serialNumber + "\n" +
        "Date : " + this.manufacturedOn + "\n" +
        "Name : " + this.name + "\n";
  }
}
