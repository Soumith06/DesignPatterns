package com.StrategyDesignPattern.Project.Strategy;

public class DepressedMood implements IMoodStrategy {
    @Override
    public void toDo() {
        System.out.println("Sleep for sometime");
    }
}
