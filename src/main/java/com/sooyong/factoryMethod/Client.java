package com.sooyong.factoryMethod;

public class Client {

  public static void main(String[] args) {

    Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
    System.out.println(whiteship);

    Ship blackship = new BlackshipFactory().orderShip("Blackship", "keesun@mail.com");
    System.out.println(blackship);
  }

}
