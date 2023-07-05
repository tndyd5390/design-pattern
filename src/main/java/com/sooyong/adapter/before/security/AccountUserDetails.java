package com.sooyong.adapter.before.security;

import com.sooyong.adapter.before.Account;

public class AccountUserDetails implements UserDetails {

  Account account;

  public AccountUserDetails(Account account) {
    this.account = account;
  }

  @Override
  public String getUsername() {
    return this.account.getName();
  }

  @Override
  public String getPassword() {
    return this.account.getPassword();
  }
}
