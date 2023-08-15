package com.sooyong.composite.after;

public class Client {

  public static void main(String[] args) {
    Item doranBlade = new Item("도란검", 450);
    Item healPotion = new Item("체력 물약", 50);

    Bag bag = new Bag();
    bag.add(doranBlade);
    bag.add(healPotion);
    bag.add(bag);

    Client client = new Client();
    client.printPrice(doranBlade);
    client.printPrice(bag);
  }

  private void printPrice(Component component) {
    System.out.println(component.getPrice());
  }

}
