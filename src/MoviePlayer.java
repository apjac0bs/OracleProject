/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.*;


//The MoviePlayer class extends the Abstract Product Class.
public class MoviePlayer extends Product implements MultimediaControl{

  private Screen screen;
  private MonitorType monitorType;

  public MoviePlayer(String name, Screen screen, MonitorType mType) {
    super(name); // Call to 'super()' must be first statement in constructor body
    this.screen = new Screen();
    this.monitorType = mType;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");
  }

  @Override
  public void next() {
    System.out.println("Next");
  }


  // Overriding the Java toString method

  /**
   * @return {@code String} formatted per assignment
   */
  public String toString() {
    return super.toString() +
        "Screen : " + this.screen +
        "Monitor Type : " + this.monitorType + "\n";
  }
}
