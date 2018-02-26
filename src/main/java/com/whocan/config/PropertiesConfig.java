package com.whocan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
@Configuration
@PropertySource({	
					"classpath:db.${spring.profiles.active}.properties", 
					"classpath:conf.${spring.profiles.active}.properties"
				})
public class PropertiesConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
}
