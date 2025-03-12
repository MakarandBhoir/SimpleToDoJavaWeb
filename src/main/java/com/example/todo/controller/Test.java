package com.example.todo.controller;

import java.util.logging.Logger;

public class Test {
    // Create a duplicate code so that sonar cloud can detect it
    // dummy change
    // dummy change 2
    Logger logger = Logger.getLogger(Test.class.getName());

    public void duplicateCode() {
        if (false)
            logger.info("This is a test message");

    }

}
