package com.sooyong.bridge.after;

import com.sooyong.bridge.before.Champion;

public class App {

  public static void main(String[] args) {
    Champion kda = new 아리(new KDA());
    kda.skillQ();
    kda.skillR();

    Champion poolParty아리 = new 아리(new PoolParty());
    poolParty아리.skillR();
    poolParty아리.skillQ();
  }
}
