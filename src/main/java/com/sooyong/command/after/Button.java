package com.sooyong.command.after;

import com.sooyong.command.before.Game;

public class Button {

  private Command command;

  public Button(Command command) {
    this.command = command;
  }

  public static void main(String[] args) {
    Button button = new Button(new GameEndCommand(new Game()));

    button.press();
    button.press();
  }

  public void press() {
    command.execute();
  }
}
