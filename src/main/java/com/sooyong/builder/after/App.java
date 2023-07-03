package com.sooyong.builder.after;

import com.sooyong.builder.before.TourPlan;

public class App {

  // 장점과 단점
  // 만들기 복잡한 인스턴스를 편하게 만들게 해준다.
  // 잘 설계한다면 순서를 강제할 수도 있다.

  // 영상에서는 디렉터까지 만들어야 한다고 하는데 굳이 만들 필요는 없다고 생각됨
  // annotation을 사용하여 기본값을 지정할수는 있지만 사용방법이 만족스럽지 못하다.
  // lombok을 사용하면 구현은 편하지만 잘못 입력한 값이나 범위를 벗어나는 등의 유효성 검사를 하기 어렵다.
  // 또한 pojo의 경우 객체 필드가 변경되면 나는 모든 파일에서 에러가 발생하길 원하는데 builder를 사용할 경우 에러가 발생하지 않는다.
  // 차라리 정적 팩토리메소드를 사용하는것이 낫다

  public static void main(String[] args) {
    TourDirector director = new TourDirector(new DefaultTourBuilder());
    TourPlan tourPlan = director.usTrip();
    TourPlan tourPlan1 = director.longBeachTrip();

  }

}
