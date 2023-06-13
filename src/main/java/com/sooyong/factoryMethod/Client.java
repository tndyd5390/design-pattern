package com.sooyong.factoryMethod;

public class Client {

  public static void main(String[] args) {
    Client client = new Client();
    client.print(new WhiteShipFactory(), "whiteship", "tndyd5390@naver.com");
    client.print(new BlackshipFactory(), "blackship", "tndyd5390@naver.com");

  }

  private void print(ShipFactory shipFactory, String name, String email) {
    System.out.println(shipFactory.orderShip(name, email));
  }

}
