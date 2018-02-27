package com.whocan.web.rest.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.whocan.common.service.AbstractBaseService;
import com.whocan.mybatis.mapper.member.MemberMapper;
import com.whocan.web.rest.member.vo.Member;


/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
@Service("memberService")
public class MemberServiceImpl extends AbstractBaseService<MemberServiceImpl> implements MemberService {
	
	@Override
	public List<Member> selectMemberList(Member vo) throws Exception {
		MemberMapper mapper = getMapper(MemberMapper.class);
		return mapper.selectMemberList(vo);
	}

	@Override
	public Member selectMember(String memberUid) throws Exception {
		MemberMapper mapper = getMapper(MemberMapper.class);
		return mapper.selectMember(memberUid);
	}

	@Override
	public void insertMember(Member vo) throws Exception {
		MemberMapper mapper = getMapper(MemberMapper.class);
		mapper.insertMember(vo);
	}

	@Override
	public void updateMember(Member vo) throws Exception {
		commonSql.update("Member.updateMember", vo);
	}

}
