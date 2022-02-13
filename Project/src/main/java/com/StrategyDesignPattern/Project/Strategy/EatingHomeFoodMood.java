package com.StrategyDesignPattern.Project.Strategy;

public class EatingHomeFoodMood implements IMoodStrategy {
    @Override
    public void toDo() {
        System.out.println("Eat home food");
    }
}
