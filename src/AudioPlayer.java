/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import java.util.*;



//The Device class extends the Abstract Product Class.

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType = ItemType.AUDIO;

  public AudioPlayer(String name, String audioSpecification) {
    super(name); // Call to 'super()' must be first statement in constructor body
    setMediaType(mediaType);
    setAudioSpecification(audioSpecification);
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

  private void setMediaType(ItemType mediaType){
    this.mediaType = mediaType;
  }
  private void setAudioSpecification(String audioSpecification){
    this.audioSpecification = audioSpecification;
  }
  private ItemType getMediaType(){
    return this.mediaType;
  }
  private String getAudioSpecification(){
    return this.audioSpecification;
  }


  // Overriding the Java toString method

  /**
   * @return {@code String} formatted per assignment
   */
  public String toString() {
    return super.toString() +
        "Audio Spec : " + getAudioSpecification() + "\n" +
        "Type : " + getMediaType()+ "\n";
  }
}
