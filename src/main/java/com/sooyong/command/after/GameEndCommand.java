package com.sooyong.command.after;

import com.sooyong.command.before.Game;

public class GameEndCommand implements Command {

  private Game game;

  public GameEndCommand(Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.end();
  }
}
