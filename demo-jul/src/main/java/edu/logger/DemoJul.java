package edu.logger;

import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class DemoJul {
    private static final String MSG = "java.util.logging {0}";

    public static void main(String[] args) {
        log.setLevel(Level.FINEST);
        log.log(Level.FINEST, MSG, Level.FINEST);
        log.log(Level.FINER, MSG, Level.FINER);
        log.log(Level.FINE, MSG, Level.FINE);
        log.log(Level.CONFIG, MSG, Level.CONFIG);
        log.log(Level.INFO, MSG, Level.INFO);
        log.log(Level.WARNING, MSG, Level.WARNING);
        log.log(Level.SEVERE, MSG, Level.SEVERE);
    }
}
