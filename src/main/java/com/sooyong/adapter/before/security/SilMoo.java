package com.sooyong.adapter.before.security;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class SilMoo {

  public static void main(String[] args) {
    //collections
    List<String> strings = Arrays.asList("a", "b", "c");
    Enumeration<String> enumeration = Collections.enumeration(strings);
    ArrayList<String> list = Collections.list(enumeration);

    //io
    try (InputStream is = new FileInputStream("input.txt")) {
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader reader = new BufferedReader(isr);
      while (reader.ready()) {
        System.out.println(reader.readLine());
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    
  }

}
