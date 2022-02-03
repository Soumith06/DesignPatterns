package com.StrategyDesignPattern.Project;

import com.StrategyDesignPattern.Project.Strategy.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {

		IMood depressedMood=new DepressedMood();
		Context context1=new Context();
		context1.setMood(depressedMood);
		context1.contextToDo();

		IMood eatingHomeFoodMood=new EatingHomeFoodMood();
		Context context2=new Context();
		context2.setMood(eatingHomeFoodMood);
		context2.contextToDo();

		IMood eatingOutsideFoodMood=new EatingOutsideFoodMood();
		Context context3=new Context();
		context3.setMood(eatingOutsideFoodMood);
		context3.contextToDo();

		IMood watchingMovieMood=new WatchingMovieMood();
		Context context4=new Context();
		context4.setMood(watchingMovieMood);
		context4.contextToDo();
	}

}
