package com.StrategyDesignPattern.Project.Strategy;

public class EatingOutsideFoodMood implements IMood {

    @Override
    public void toDo() {
        System.out.println("Person with Eating outside food mood want to go out and Eat outside food");
    }
}
