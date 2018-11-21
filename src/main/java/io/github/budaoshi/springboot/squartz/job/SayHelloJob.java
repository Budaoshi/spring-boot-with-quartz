package io.github.budaoshi.springboot.squartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author BDS
 * @version 0.0.1
 */

public class SayHelloJob implements Job {

	@Autowired
	private SayHelloService helloService;

	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		helloService.sayHello();
	}
}
