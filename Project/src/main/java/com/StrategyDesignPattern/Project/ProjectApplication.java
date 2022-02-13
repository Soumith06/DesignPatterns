package com.StrategyDesignPattern.Project;

import com.StrategyDesignPattern.Project.Strategy.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	private static final StrategyConditionClass strategyConditionclass = new StrategyConditionClass();

	public static void decide(String someCondition) {
		IMoodStrategy mood = strategyConditionclass.getStrategy(someCondition);
		mood.toDo();
		}
	public static void main(String[] args) {
		decide("Depressed");
//		decide("Eating Home Food");
//		decide("Eating Outside Food");
//		decide("Watching Movie");
	}

}
