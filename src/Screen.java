/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */


//The Device class extends the Abstract Product Class.
public class Screen implements ScreenSpec {

  private static String resolution;
  private static int refreshrate;
  private static int responsetime;

  public Screen(){}
  public Screen(String resolution, int refreshrate, int responsetime){

    setResolution(resolution);
    setRefreshRate(refreshrate);
    setResponseTime(responsetime);
  }

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshrate;
  }

  @Override
  public int getResponseTime() {
    return this.responsetime;
  }

  private void setResolution(String resolution) {
    this.resolution = resolution;
  }

  private void setRefreshRate(int refreshrate) {
    this.refreshrate = refreshrate;
  }

  private void setResponseTime(int responsetime) {
    this.responsetime = responsetime;
  }

  // Overriding the Java toString method

  public String toString() {
    return "Resolution : " + getResolution() + "\n" +
        "Refresh rate : " + getRefreshRate() + "\n" +
        "Response time : " + getResponseTime() + "\n";
  }
}
