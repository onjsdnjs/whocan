package com.whocan.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.whocan.common.mongo.MongoTemplate;

/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
@Configuration
public class MongoConfig {
	
//	@Autowired Environment env;
//	
//    @Bean
//    public MongoTemplate mongoTemplate() {
//        return new MongoTemplate(
//            		env.getProperty("db.mongo.dbName"),
//            		env.getProperty("db.mongo.user"), 
//            		env.getProperty("db.mongo.pass"),
//            		env.getProperty("db.mongo.host"), 
//            		Integer.parseInt(env.getProperty("db.mongo.port")), 
//            		Boolean.parseBoolean(env.getProperty("db.mongo.autoConnectRetry")), 
//            		Integer.parseInt(env.getProperty("db.mongo.connectionsPerHost")), 
//    				Integer.parseInt(env.getProperty("db.mongo.connectTimeout")), 
//					Integer.parseInt(env.getProperty("db.mongo.maxWaitTime")), 
//					Integer.parseInt(env.getProperty("db.mongo.threadsAllowedToBlockForConnectionMultiplier")), 
//					Integer.parseInt(env.getProperty("db.mongo.socketTimeout"))
//        		);
//    }
}
