package com.sooyong.chain.after;

import com.sooyong.chain.before.Request;

public class LoggingRequestHandler extends RequestHandler {

  public LoggingRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println("로깅");
    super.handle(request);
  }
}
