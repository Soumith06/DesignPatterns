package com.StrategyDesignPattern.Project.Strategy;

public class EatingOutsideFoodMood implements IMoodStrategy {

    @Override
    public void toDo() {
        System.out.println("Go out and Eat outside food");
    }
}
