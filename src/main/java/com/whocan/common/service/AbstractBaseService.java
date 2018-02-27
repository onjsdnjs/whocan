package com.whocan.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.whocan.common.dao.CommonSqlDao;

/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
public abstract class AbstractBaseService<T> extends LoggingService<T> {

	@Autowired
	protected CommonSqlDao commonSql;
	
	protected <Mapper> Mapper getMapper(Class<Mapper> clz) {
		Mapper mapper = (Mapper)commonSql.getSqlSession().getMapper(clz);
		return mapper;
	}
}
