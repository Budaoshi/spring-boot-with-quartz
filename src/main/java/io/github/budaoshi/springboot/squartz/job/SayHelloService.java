package io.github.budaoshi.springboot.squartz.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author BDS
 * @version 0.0.1
 */
@Service
public class SayHelloService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public void sayHello() {
		logger.info("Hello World! Hello Quartz!!!");
	}
}
