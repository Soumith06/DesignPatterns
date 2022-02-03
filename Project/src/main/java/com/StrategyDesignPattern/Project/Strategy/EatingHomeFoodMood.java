package com.StrategyDesignPattern.Project.Strategy;

public class EatingHomeFoodMood implements IMood {
    @Override
    public void toDo() {
        System.out.println("Person with Eating Home Food mood want to Eat home food");
    }
}
