package com.DesignPattern.Project.Strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EatingOutsideFoodMood implements IMoodStrategy {

    private Logger logger= LogManager.getLogger(EatingOutsideFoodMood.class);
    @Override
    public void toDo() {
        logger.info("Go out and Eat outside food");
    }
}
