package edu.logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoSlf4jReload4j {
    private static final String MSG = "Slfj4j - reload4j {}";
    private static final String VERSION = "v1.7.36 - v1.2.25";

    public static void main(String[] args) {
        log.trace(MSG, VERSION);
        log.debug(MSG, VERSION);
        log.info(MSG, VERSION);
        log.warn(MSG, VERSION);
        log.error(MSG, VERSION);
    }
}
