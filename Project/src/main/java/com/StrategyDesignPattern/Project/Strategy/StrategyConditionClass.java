package com.StrategyDesignPattern.Project.Strategy;

import com.StrategyDesignPattern.Project.Strategy.*;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
public class StrategyConditionClass {

    private final Map<String, IMoodStrategy> conditions = new HashMap<>();

    public StrategyConditionClass() {
        conditions.put("Depressed",new DepressedMood());
        conditions.put("Eating Home Food",new EatingHomeFoodMood());
        conditions.put("Eating Outside Food",new EatingOutsideFoodMood());
        conditions.put("Watching Movie",new WatchingMovieMood());
    }
    public IMoodStrategy getStrategy(String condition) {
        return conditions.get(condition);
    }

}
