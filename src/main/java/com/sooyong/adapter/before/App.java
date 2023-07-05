package com.sooyong.adapter.before;

import com.sooyong.adapter.before.security.AccountUserDetailService;
import com.sooyong.adapter.before.security.LoginHandler;
import com.sooyong.adapter.before.security.UserDetailsService;

public class App {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();
    UserDetailsService userDetailsService = new AccountUserDetailService(accountService);
    LoginHandler loginHandler = new LoginHandler(userDetailsService);
    String login = loginHandler.login("soo", "soo");
    System.out.println(login);
  }
}
