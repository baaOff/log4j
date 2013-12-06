package ru.vsu.cs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
    private static Logger logger = LogManager.getLogger("HelloWorld");

	
    public static void main( String[] args )
    {
        logger.info("Program run...");
    }
}
