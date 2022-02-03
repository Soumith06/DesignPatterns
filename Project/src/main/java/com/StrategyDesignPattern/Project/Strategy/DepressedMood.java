package com.StrategyDesignPattern.Project.Strategy;

public class DepressedMood implements IMood {
    @Override
    public void toDo() {
        System.out.println("Person with depressed mood want to go to sleep for sometime");
    }
}
