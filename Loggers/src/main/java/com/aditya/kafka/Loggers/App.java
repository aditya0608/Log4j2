package com.aditya.kafka.Loggers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger logger=LogManager.getLogger("com.mlit");
    public static void main( String[] args ) throws InterruptedException
    {
    	while(true)
    	{
    	String username="Aditya";
    	System.out.println("Hello");
       logger.info("Hello {}",username);
       logger.debug("Hello {}",username);  
       logger.warn("Hello");
       logger.error("hello",new Throwable(new Exception("Aditya excpetion ")));
       Thread.sleep(1000);
    	}
       }
}
