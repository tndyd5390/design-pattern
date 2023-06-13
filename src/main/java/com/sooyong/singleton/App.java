package com.sooyong.singleton;

public class App {

  public static void main(String[] args) {
    Settings settings = Settings.getInstance();
    System.out.println(Settings.getInstance() == settings);
  }
}
