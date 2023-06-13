package com.sooyong.factoryMethod;

public class WhiteShipFactory implements ShipFactory {

  @Override
  public Ship createShit() {
    return new Whiteship();
  }
}
