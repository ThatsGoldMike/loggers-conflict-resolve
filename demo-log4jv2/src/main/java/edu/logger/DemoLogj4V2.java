package edu.logger;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DemoLogj4V2 {
    private static final String MSG = "Log4j V2 {}";
    private static final String VERSION = "v2.23.1";

    public static void main(String[] args) {
        log.trace(MSG, () -> VERSION);
        log.debug(MSG, () -> VERSION);
        log.info(MSG, () -> VERSION);
        log.warn(MSG, () -> VERSION);
        log.error(MSG, () -> VERSION);
    }
}
