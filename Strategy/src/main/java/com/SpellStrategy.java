package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpellStrategy implements DragonSlayingStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpellStrategy.class);

    @Override
    public void execute() {
        LOGGER.info("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }

}