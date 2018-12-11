/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.io.*;
import java.nio.file.*;


public class ViewFileInfo {

  public ViewFileInfo() {
    ReadFile();
  }

  private static void ReadFile() {
    //The class will have three fields:
    Path p = Paths.get("C:/LineTests");
    Path p2 = Paths.get("TestResults.txt");
    Path p3 = p.resolve(p2);

    String filepath = p3.toString();

    try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
      StringBuilder fileContents = new StringBuilder();
      String line = br.readLine();
      while (line != null) {
        fileContents.append(line);
        fileContents.append(System.lineSeparator());
        line = br.readLine();
      }//end while
      String fileComplete = fileContents.toString();
      System.out.println(fileComplete);
    }//end try
    catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }//end ReadFile
}
