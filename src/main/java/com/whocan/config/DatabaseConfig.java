package com.whocan.config;


//import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

	
	@Profile({"dev"})
    static class Dev {
		
		@Autowired
		Environment env;
		
        @Bean
        public DataSource dataSource() {        	
        	BasicDataSource ds = new BasicDataSource();
        	try{
        		ds.setDriverClassName(env.getProperty("db.mysql.driverClassName"));
        		ds.setUrl(env.getProperty("db.mysql.url"));
        		ds.setUsername(env.getProperty("db.mysql.username"));
        		ds.setPassword(env.getProperty("db.mysql.password"));
        		ds.setMaxActive(Integer.parseInt(env.getProperty("db.mysql.maxActive")));
        		ds.setMaxIdle(Integer.parseInt(env.getProperty("db.mysql.maxIdle")));
        		ds.setMaxWait(Integer.parseInt(env.getProperty("db.mysql.maxWait")));
        		ds.setDefaultAutoCommit(Boolean.parseBoolean(env.getProperty("db.mysql.defaultAutoCommit")));
        	
        	}catch(Exception e){
        		e.printStackTrace();
        	}
            return ds;
        }
    }

    @Profile({"prd"})
    //@Resource(name="jdbc/MyDB")
    static class Prd {
    	
    	@Autowired
		Environment env;
    	
    	@Bean
        public DataSource dataSource() {
    	
	    	BasicDataSource ds = new BasicDataSource();
	    	try{
	    		ds.setDriverClassName(env.getProperty("db.mysql.driverClassName"));
	    		ds.setUrl(env.getProperty("db.mysql.url"));
	    		ds.setUsername(env.getProperty("db.mysql.username"));
	    		ds.setPassword(env.getProperty("db.mysql.password"));
	    		ds.setMaxActive(Integer.parseInt(env.getProperty("db.mysql.maxActive")));
	    		ds.setMaxIdle(Integer.parseInt(env.getProperty("db.mysql.maxIdle")));
	    		ds.setMaxWait(Integer.parseInt(env.getProperty("db.mysql.maxWait")));
	    		ds.setDefaultAutoCommit(Boolean.parseBoolean(env.getProperty("db.mysql.defaultAutoCommit")));
	    	
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	        return ds;
    	}
    	
    	 /* @Bean
        public DataSource dataSource() {
        	final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
    		dsLookup.setResourceRef(true);
    		DataSource dataSource = dsLookup.getDataSource("java:comp/dnv/jdbc/MyDB");
    		return dataSource;
        } */
    }

	@Bean 
	@Autowired
	public DataSourceTransactionManager txManager(DataSource dataSource){
		DataSourceTransactionManager txManager = new DataSourceTransactionManager();
		txManager.setDataSource(dataSource);
		return txManager;
	}

}
