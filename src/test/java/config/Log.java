package config;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log {

    private static Logger logger = Logger.getLogger(Log.class);

    static {
        //DOMConfigurator is used to configure logger from xml configuration file
        DOMConfigurator.configure("log4j-config.xml");
        //Log in console in and log file
        logger.debug("Log4j appender configuration is successful !!");
    }

    public static void startTestCase(String sTestCaseName) {
        logger.info("Started Test case: " + sTestCaseName);
    }


    public static void endTestCase(String sTestCaseName) {
        logger.info("Ended Test Case: " + sTestCaseName);
    }

    public static void info(String message) {
        logger.info(message);
    }

}