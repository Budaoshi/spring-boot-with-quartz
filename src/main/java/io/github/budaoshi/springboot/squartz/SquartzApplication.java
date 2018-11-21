package io.github.budaoshi.springboot.squartz;

import io.github.budaoshi.springboot.squartz.spring.SchedulerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({SchedulerConfig.class})
@SpringBootApplication
public class SquartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquartzApplication.class, args);
	}
}
