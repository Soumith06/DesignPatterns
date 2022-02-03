package com.StrategyDesignPattern.Project;

import com.StrategyDesignPattern.Project.Strategy.IMood;
import lombok.Setter;

@Setter
public class Context {

    private IMood mood;



    public void contextToDo(){
        mood.toDo();
    }

}
