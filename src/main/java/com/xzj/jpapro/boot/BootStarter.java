package com.xzj.jpapro.boot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by zhxue on 8/3/2017.
 */
@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.xzj.jpapro.dao")
@EntityScan("com.xzj.jpapro.entity")
@ComponentScan(basePackages = "com.xzj.jpapro") // 扫遍路径定义,可为逗号间隔的多个路径、
@PropertySource(value = "classpath:database.properties")
public class BootStarter {

	private static Log logger = LogFactory.getLog(BootStarter.class);

	public static void main(String... args) {
		try {						
			SpringApplication.run(BootStarter.class);

		} catch (Throwable t) {
			logger.error("Throwable Occurs in Container!", t);
		}
	}

	
}
