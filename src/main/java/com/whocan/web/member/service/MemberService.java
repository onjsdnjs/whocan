package com.whocan.web.member.service;

import java.util.List;

import com.whocan.web.member.domain.Member;

public interface MemberService {
	
	List<Member> selectMemberList(Member vo) throws Exception;
	
	Member selectMember(String memberUid) throws Exception;
	
	void insertMember(Member vo) throws Exception;
	
	void updateTeset(Member vo) throws Exception;
}
