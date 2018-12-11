/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.io.*;
import java.nio.file.*;


public class ProcessFiles extends Exception {

  //The class will have three fields:
  private Path p = Paths.get("C:/LineTests");
  private Path p2 = Paths.get("TestResults.txt");
  private Path p3 = p.resolve(p2);

  public ProcessFiles(Object obj) {
    try {
      WriteFile(obj);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  //The following new methods have to be defined:
  private void CreateDirectory() {
    try {
      if (Files.notExists(p)) {
        Files.createDirectories(p);
      }//endif
      if (Files.notExists(p3)) {
        Files.createFile(p3);
      }//endif
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

/*  **
   * @param objName is the Java object to be processed.
   * @throws IOException
  public void WriteFile(EmployeeInfo objName) throws IOException {
    WriteFile(objName);
  }

   * @param products is the Java object to be processed.
   * @throws IOException
   *
  public void WriteFile(ArrayList<Product> products) throws IOException {
    WriteFile(products);
  }*/

  public void WriteFile(Object objName) throws IOException {
    CreateDirectory();
    String filepath = p3.toString();
    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filepath, true)));
    writer.println(objName);
    writer.close();
  }

}
