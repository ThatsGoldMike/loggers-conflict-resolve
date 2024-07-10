package edu.logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoSlf4jV2Simple {
    private static final String MSG = "Slfj4j SIMPLE {}";
    private static final String VERSION = "v2.0.12";

    public static void main(String[] args) {
        log.atTrace().addArgument(() -> VERSION).log(MSG);
        log.atDebug().addArgument(() -> VERSION).log(MSG);
        log.atInfo().addArgument(() -> VERSION).log(MSG);
        log.atWarn().addArgument(() -> VERSION).log(MSG);
        log.atError().addArgument(() -> VERSION).log(MSG);
    }
}
