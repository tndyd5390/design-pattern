package com.sooyong.command.after;

import com.sooyong.command.before.Game;

public class GameStartCommand implements Command {

  private Game game;

  public GameStartCommand(Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.start();
  }
}
