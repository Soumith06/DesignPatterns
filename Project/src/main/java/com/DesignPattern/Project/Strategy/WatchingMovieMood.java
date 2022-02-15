package com.DesignPattern.Project.Strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WatchingMovieMood implements IMoodStrategy {

    private Logger logger= LogManager.getLogger(WatchingMovieMood.class);
    @Override
    public void toDo() {
        logger.info("Watch any movie");
    }


}
