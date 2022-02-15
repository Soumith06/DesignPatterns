package com.DesignPattern.Project.Strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EatingHomeFoodMood implements IMoodStrategy {
    private Logger logger=LogManager.getLogger(EatingHomeFoodMood.class);
    @Override
    public void toDo() {
        logger.info("Eat home food");
    }
}
