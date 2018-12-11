/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */


//The MoviePlayerDriver class extends the Abstract Product Class.
public class MoviePlayerDriver {

  public static void testMoviePlayer() {

    MoviePlayer mp1 = new MoviePlayer("DBPOWER MK101",new Screen("720x480", 40,22), MonitorType.LCD);
    MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK",new Screen("1366x768", 40,22), MonitorType.LED);

    mp1.next();
    mp1.play();
    mp1.previous();
    mp1.stop();

    System.out.println(mp1);
    System.out.println(mp2);

  }
}
