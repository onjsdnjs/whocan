package com.whocan.common.mongo;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientOptions.Builder;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;

/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
public class MongoTemplate {
	
	private static DB db;	
	private static MongoClient mongoClient;
			 
	public MongoTemplate(String dbName,
						  String username, 
						  String password,
						  String host, 
						  int port, 
						  boolean autoConnectRetry, 
						  int connectionsPerHost, 
						  int connectTimeout, 
						  int maxWaitTime, 
						  int threadsAllowedToBlockForConnectionMultiplier, 
						  int socketTimeout) {
		
		if(mongoClient == null){
			Builder b = MongoClientOptions.builder();
			b.autoConnectRetry(autoConnectRetry);
			b.connectionsPerHost(connectionsPerHost);
			b.connectTimeout(connectTimeout);
			b.maxWaitTime(maxWaitTime);
			b.threadsAllowedToBlockForConnectionMultiplier(threadsAllowedToBlockForConnectionMultiplier);
			b.socketTimeout(socketTimeout);
			MongoClientOptions options = b.build();
			try {
				List<ServerAddress> list = new ArrayList<ServerAddress>();
				for(String h : host.split(";")){
					list.add(new ServerAddress(h.split(":")[0], Integer.parseInt(h.split(":")[1])));
				}
				mongoClient = new MongoClient(list,options);
				mongoClient.setWriteConcern(WriteConcern.SAFE);
				db = mongoClient.getDB(dbName);
				db.authenticate(username, password.toCharArray());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * <PRE>
	 * 1. author	:	정수원
	 * 2. date		:	2015.04.26
	 * </PRE>
	 *
	 *	@param collectionName
	 *	@return
	 */
	public static DBCollection getDBCollection(String collectionName){
		return db.getCollection(collectionName);
	}
	
	/**
	 * <PRE>
	 * 1. author	:	정수원
	 * 2. date		:	2015.04.26
	 * </PRE>
	 *
	 *	@param collectionName
	 *	@return
	 */
	public static DB getDB(){
		return db;
	}
}
