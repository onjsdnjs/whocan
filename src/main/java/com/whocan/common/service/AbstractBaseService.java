package com.whocan.common.service;


import java.lang.reflect.ParameterizedType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.whocan.common.dao.CommonSqlDao;

/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
public abstract class AbstractBaseService<T> {

	@SuppressWarnings("unchecked")
	final protected Logger log = LoggerFactory.getLogger(((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]));

	@Autowired
	protected CommonSqlDao commonSql;
	
	protected <Mapper> Mapper getMapper(Class<Mapper> clz) {
		Mapper mapper = (Mapper)commonSql.getSqlSession().getMapper(clz);
		return mapper;
	}
}
