package com.sooyong.chain.after;

import com.sooyong.chain.before.Request;

public class AuthRequestHandler extends RequestHandler {

  public AuthRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    System.out.println("인증이 되었는가?");
    super.handle(request);
  }
}
