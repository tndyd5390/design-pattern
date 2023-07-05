package com.sooyong.adapter.before.security;

import com.sooyong.adapter.before.Account;
import com.sooyong.adapter.before.AccountService;

public class AccountUserDetailService implements UserDetailsService {

  private final AccountService accountService;

  public AccountUserDetailService(AccountService accountService) {
    this.accountService = accountService;
  }

  @Override
  public UserDetails loadUser(String username) {
    Account account = accountService.findAccountByUsername(username);
    return new AccountUserDetails(account);
  }
}
