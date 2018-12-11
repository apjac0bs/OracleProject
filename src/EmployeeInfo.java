/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.Scanner;
import java.util.regex.*;


public class EmployeeInfo {

  private StringBuilder name;
  private String code;

  private String deptId;
  private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
  private Scanner in;


  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName(); // set name using default constructor
    setDeptId();
    in.close();
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    // Test for validity - spaces
    if (checkName(name)) {
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "None";
    }
  }

  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    String nameString = in.nextLine();
    return nameString;
  }

  public String getDeptId() {
    System.out.print("Please enter the department ID: ");
    String id = in.nextLine();
    return id;
  }

  private void setDeptId() {
    String id = getDeptId();
    if (validId(id)) {
      this.deptId = reverseString(id);
//      this.deptId = id;
    } else {
      this.deptId = "None01";
    }
  }

  private String getId() {
    return this.deptId;
  }

  private boolean validId(String id) {
    Matcher matcher = p.matcher(id);
    return matcher.matches();
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  public String reverseString(String id) {
    byte [] strAsByteArray = id.getBytes();
    byte [] result = new byte [strAsByteArray.length];

    // Store result in reverse order into the
    // result byte[]
    for (int i = 0; i<strAsByteArray.length; i++) {
      result[i] = strAsByteArray[strAsByteArray.length - i - 1];
    }
    return new String(result);
  }

  public String toString() {
    return "Employee Code : " + this.code + "\n" +
        "Department Number : " + this.deptId + "\n";
  }

}