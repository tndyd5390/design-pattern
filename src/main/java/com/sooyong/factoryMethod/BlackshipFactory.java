package com.sooyong.factoryMethod;

public class BlackshipFactory implements ShipFactory {


  @Override
  public Ship createShit() {
    return new Balckship();
  }
}
