package com.DesignPattern.Project;

import com.DesignPattern.Project.BuilderDesignPattern.User;
import com.DesignPattern.Project.BuilderDesignPattern.UserBuilder;
import com.DesignPattern.Project.Strategy.IMoodStrategy;
import com.DesignPattern.Project.Strategy.StrategyConditionClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	private static Logger logger= LogManager.getLogger(ProjectApplication.class);

	private static final StrategyConditionClass strategyConditionclass = new StrategyConditionClass();

	public static void decide(String condition) {
		IMoodStrategy mood = strategyConditionclass.getStrategy(condition);
		mood.toDo();
		}
	public static void main(String[] args) {
		decide("Depressed");
		decide("Eating Home Food");
		decide("Eating Outside Food");
		decide("Watching Movie");

		User user=new UserBuilder().setUserName("sou").getUser();
		logger.info(user.toString());
	}

}
