package com.sooyong.chain.after;

import com.sooyong.chain.before.Request;

public class Client {

  private RequestHandler requestHandler;

  public Client(RequestHandler requestHandler) {
    this.requestHandler = requestHandler;
  }

  public static void main(String[] args) {
    RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
    Client client = new Client(chain);
    client.doWork();

  }

  public void doWork() {
    Request request = new Request("뽑기");
    requestHandler.handle(request);
  }
}
