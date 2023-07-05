package com.sooyong.adapter.before.security;

public interface UserDetailsService {

  UserDetails loadUser(String username);

}
