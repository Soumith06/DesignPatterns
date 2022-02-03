package com.StrategyDesignPattern.Project.Strategy;

public class WatchingMovieMood implements IMood {

    @Override
    public void toDo() {
        System.out.println("Person with watching movie mood want to Watch any movie");
    }


}
