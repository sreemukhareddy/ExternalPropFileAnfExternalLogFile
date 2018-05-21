package com.log.SpringExternalLogFile;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExternalLogFileApplication implements CommandLineRunner{

	static Logger log=  Logger.getLogger(SpringExternalLogFileApplication.class.getName());
	
	@Value("${foo.name}")
	public String name;
	
	public static void main(String[] args) {
		//log.info("INFOOOO -> {}");
		//log.warning("WARNING -> {}");
		SpringApplication.run(SpringExternalLogFileApplication.class, args);
		log.warning("WARNING -> {}");
		log.info("End---------End");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("NAME -> {}" + name);
	}
}
