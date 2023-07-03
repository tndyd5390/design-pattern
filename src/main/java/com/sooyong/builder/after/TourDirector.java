package com.sooyong.builder.after;

import com.sooyong.builder.before.TourPlan;
import java.time.LocalDate;

public class TourDirector {

  private final TourPlanBuilder tourPlanBuilder;

  public TourDirector(TourPlanBuilder tourPlanBuilder) {
    this.tourPlanBuilder = tourPlanBuilder;
  }

  public TourPlan usTrip() {
    return tourPlanBuilder.title("미국 여행")
        .nightsAndDays(2, 3)
        .startDate(LocalDate.of(2020, 12, 9))
        .whereToStay("리조트")
        .addPlan(0, "체크인하고 짐 풀기")
        .addPlan(0, "저녁 식사")
        .getPlan();
  }

  public TourPlan longBeachTrip() {
    return tourPlanBuilder.title("롱비치")
        .startDate(LocalDate.of(2021, 7, 15))
        .getPlan();
  }
}
