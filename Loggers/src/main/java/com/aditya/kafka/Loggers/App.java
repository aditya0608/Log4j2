package com.aditya.kafka.Loggers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger logger=LogManager.getLogger(App.class);
    public static void main( String[] args ) throws InterruptedException
    {
    	while(true)
    	{
    	String username="Aditya";
    	System.out.println("Hello");
       logger.info("Hello {}",username);
       logger.debug("Hello {}",username);  
       logger.warn("Hello");
       logger.error("hello");
       Thread.sleep(1000);
    	}
       }
}
