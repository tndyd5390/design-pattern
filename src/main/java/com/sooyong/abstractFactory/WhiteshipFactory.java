package com.sooyong.abstractFactory;

import com.sooyong.factoryMethod.Ship;
import com.sooyong.factoryMethod.ShipFactory;
import com.sooyong.factoryMethod.Whiteship;

public class WhiteshipFactory implements ShipFactory {

  private final ShipPartsFactory shipPartsFactory;

  public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
    this.shipPartsFactory = shipPartsFactory;
  }

  @Override
  public Ship createShip() {
    Ship ship = new Whiteship();
    ship.setAnchor(shipPartsFactory.createAnchor());
    ship.setWheel(shipPartsFactory.createWheel());
    return ship;
  }
}
