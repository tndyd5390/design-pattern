package com.sooyong.command.after;

import com.sooyong.command.before.Light;

public class LightOffCommand implements Command {

  private Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }
}
