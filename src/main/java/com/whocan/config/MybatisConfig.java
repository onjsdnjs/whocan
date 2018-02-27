package com.whocan.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
@Configuration
@MapperScan("com.whocan.mybatis.mapper")
public class MybatisConfig {
		
	@Bean
	@Autowired
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sb = new SqlSessionFactoryBean();
		sb.setDataSource(dataSource);
		sb.setConfigLocation(new DefaultResourceLoader().getResource("classpath:mybatis/config_mybatis.xml"));
		sb.setMapperLocations(new Resource[] { new ClassPathResource("mybatis/mapper/*Mapper.xml") });
		return sb.getObject();
	}

	@Bean
	@Autowired
	public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory){
		SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory);
		return template;
	}
	
}
