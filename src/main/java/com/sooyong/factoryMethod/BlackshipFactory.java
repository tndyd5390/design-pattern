package com.sooyong.factoryMethod;

public class BlackshipFactory implements ShipFactory {


  @Override
  public Ship createShip() {
    return new Balckship();
  }
}
