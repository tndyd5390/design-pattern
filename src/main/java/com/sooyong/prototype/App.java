package com.sooyong.prototype;

public class App {

  // prototype 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법
  // 복잡한 객체를 만드는 과정을 숨길 수 있다.
  // 복잡한 객체를 만드는 과정 자체가 복잡할 수 있다.
  public static void main(String[] args) throws CloneNotSupportedException {
    GithubRepository repository = new GithubRepository();
    repository.setUser("whiteship");
    repository.setName("live-study");

    GithubIssue githubIssue = new GithubIssue(repository);
    githubIssue.setId(1);
    githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

    String url = githubIssue.getUrl();
    System.out.println(url);

    GithubIssue clone = (GithubIssue) githubIssue.clone();
    System.out.println(clone.getUrl());

    repository.setUser("sooyong");

    System.out.println(clone != githubIssue);
    System.out.println(clone.equals(githubIssue));
    System.out.println(clone.getClass() == githubIssue.getClass());
    System.out.println(clone.getRepository() == githubIssue.getRepository());
    System.out.println(clone.getRepository().getUser());
  }

}
