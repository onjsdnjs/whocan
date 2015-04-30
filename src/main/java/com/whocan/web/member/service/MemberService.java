package com.whocan.web.member.service;

import java.util.List;

import com.whocan.web.member.domain.Member;


/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
public interface MemberService {
	
	List<Member> selectMemberList(Member vo) throws Exception;
	
	Member selectMember(String memberUid) throws Exception;
	
	void insertMember(Member vo) throws Exception;
	
	void updateTeset(Member vo) throws Exception;
}
