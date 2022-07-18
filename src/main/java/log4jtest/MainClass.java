package log4jtest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class MainClass {
	static Logger log = Logger.getLogger(MainClass.class.getName()) ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("F:\\java_projects\\Selen\\seleniumtest\\src\\main\\java\\log4jtest\\log4j.properties");
		log.trace("Trace Level Message");
		log.debug("Debug Level Message");
		log.info("Info Level Message");
		log.warn("Warn Level Message");
		log.error("Error Level Message");
		log.fatal("Fatal level Message");
		System.out.println("Hellow World");
	}

}
