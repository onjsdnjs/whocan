package com.whocan.mybatis.mapper.dept;

import java.util.List;

import com.whocan.web.rest.member.vo.Member;

public interface DeptMapper {

	List<Member> selectDeptList(Member vo) throws Exception;
	
	Member selectDept(String memberUid) throws Exception;
	
	void insertDept(Member vo) throws Exception;
	
	void updateDept(Member vo) throws Exception;
	
}
