package com.sooyong.abstractFactory;

import com.sooyong.factoryMethod.Ship;
import com.sooyong.factoryMethod.ShipFactory;

public class ShipInventory {

  public static void main(String[] args) {
    ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsProFactory());
    Ship ship = shipFactory.createShip();
    System.out.println(ship.getAnchor().getClass());
    System.out.println(ship.getWheel().getClass());
  }
}
