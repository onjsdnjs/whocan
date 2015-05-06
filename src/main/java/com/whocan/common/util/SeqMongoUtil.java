package com.whocan.common.util;

import com.mongodb.BasicDBObject;
import com.whocan.common.mongo.MongoTemplate;

public class SeqMongoUtil {

	/**
	 * <PRE>
	 * 1. author	:	정수원
	 * 2. date		:	2015.04.26
	 * </PRE>
	 *
	 *	@param key
	 *	@return
	 */
	public static long getSeq(String key){
			try{
				return (Long) MongoTemplate.getDBCollection("Seq").findAndModify(new BasicDBObject("key",key),new BasicDBObject("seq",1),null,false,new BasicDBObject("$inc",new BasicDBObject("seq",new Long(1))),true,true).get("seq");
			}catch(Exception e){
				return 0L;
			}
	}

	/**
	 * <PRE>
	 * 1. author	:	정수원
	 * 2. date		:	2015.04.26
	 * </PRE>
	 *
	 *	@param key
	 *	@return
	 */
	public static int getSeqInt(String key){
			try{
				return (Integer) MongoTemplate.getDBCollection("Seq").findAndModify(new BasicDBObject("key",key),new BasicDBObject("seq",1),null,false,new BasicDBObject("$inc",new BasicDBObject("seq",new Integer(1))),true,true).get("seq");
			}catch(Exception e){
				return 0;
			}
	}
}
