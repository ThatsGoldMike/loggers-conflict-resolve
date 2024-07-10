package edu.logger;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.slf4j.bridge.SLF4JBridgeHandler;

import java.time.LocalDateTime;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("This is main demo application");
        log.warn("It uses SLF4J API 2.0.13 + logback 1.5.6");
        log.error("Console messages should be colorful");
        MDC.put("app", "main");
        MDC.put("start time", LocalDateTime.now().toString());
        log.trace("We also have MDC values");

        log.info("--- Lets try to run function from module with java.util.logging --- ");
        MDC.put("app", "demo-jul");
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        edu.logger.DemoJul.main(new String[0]);

        MDC.put("app", "main");
        log.info("-- Lets  try module with SLF4J V1 ---");
        MDC.put("app", "demo-slf4j-v1");
        edu.logger.DemoSlf4jV1.main(new String[0]);

        MDC.put("app", "main");
        log.info("-- Lets  try module with SLF4J V2 ---");
        MDC.put("app", "demo-slf4j-v2");
        edu.logger.DemoSlf4jV2.main(new String[0]);

        MDC.put("app", "main");
        log.info("-- No need to exclude slf4j api from dependencies - it will be suppressed by local slf4j api ---");
        log.info("-- Lets try module with SLF4J V2 with SIMPLE implementation ---");
        log.info("-- logback implementation will suppress simple and work out of the box, but lest exclude it anyway ---");
        MDC.put("app", "demo-slf4j-v2-simple");
        edu.logger.DemoSlf4jV2Simple.main(new String[0]);

        MDC.put("app", "main");
        log.info("-- Lets try module with LOG4J V2 ---");
        log.info("-- if log4j-to-slf4j is installed, it will replace log4j-api in dependencies at reroute to SLF4j---");
        log.info("-- so it will work fine out of the box ---");
        log.info("-- log4j implementation remains in classpath, but will be never used ---");
        log.info("-- but we can remove log4j-api and log4j-core just in case, to avoid conflict in dependencies ---");
        MDC.put("app", "demo-log4jv2");
        edu.logger.DemoLogj4V2.main(new String[0]);

        MDC.put("app", "main");
        log.info("-- Lets try module with slf4j-api + reload4j implementation ---");
        edu.logger.DemoSlf4jReload4j.main(new String[0]);

        MDC.clear();
        log.info("--- That's all, folks --- ");
    }
}
