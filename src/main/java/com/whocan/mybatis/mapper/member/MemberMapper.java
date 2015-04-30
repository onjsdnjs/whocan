package com.whocan.mybatis.mapper.member;

import java.util.List;

import com.whocan.web.member.domain.Member;

public interface MemberMapper {

	List<Member> selectMemberList(Member vo) throws Exception;
	
	Member selectMember(String memberUid) throws Exception;
	
	void insertMember(Member vo) throws Exception;
	
	void updateTeset(Member vo) throws Exception;
	
}
