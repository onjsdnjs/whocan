package com.whocan.web.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.whocan.common.service.AbstractBaseService;
import com.whocan.mybatis.mapper.member.MemberMapper;
import com.whocan.web.member.domain.Member;

@Service("memberService")
public class MemberServiceImpl extends AbstractBaseService<MemberServiceImpl> implements MemberService {
	
	@Override
	public List<Member> selectMemberList(Member vo) throws Exception {
		MemberMapper mapper = getMapper(MemberMapper.class);
		List<Member> selectMemberList = mapper.selectMemberList(vo);
		return selectMemberList;
	}

	@Override
	public Member selectMember(String memberUid) throws Exception {
		MemberMapper mapper = getMapper(MemberMapper.class);
		Member member = mapper.selectMember(memberUid);
		return member;
	}

	@Override
	public void insertMember(Member vo) throws Exception {
		MemberMapper mapper = getMapper(MemberMapper.class);
		mapper.insertMember(vo);
	}

	@Override
	public void updateTeset(Member vo) throws Exception {
		commonSql.update("Member.updateMember", vo);
	}

}
