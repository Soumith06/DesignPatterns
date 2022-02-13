package com.StrategyDesignPattern.Project.Strategy;

public class WatchingMovieMood implements IMoodStrategy {

    @Override
    public void toDo() {
        System.out.println("Watch any movie");
    }


}
