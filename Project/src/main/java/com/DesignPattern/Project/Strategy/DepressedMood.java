package com.DesignPattern.Project.Strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DepressedMood implements IMoodStrategy {
    private Logger logger= LogManager.getLogger(DepressedMood.class);
    @Override
    public void toDo() {
        logger.info("Sleep for sometime");
    }
}
