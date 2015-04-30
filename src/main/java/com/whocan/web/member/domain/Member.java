package com.whocan.web.member.domain;


/**
 * <PRE>
 * 1. author	:	정수원
 * 2. date		:	2015.04.26
 * </PRE>
 *
 */
public class Member {
	
	private String memberUid;       
	private String nickName;       
	private String socialCode;     
	private String socialTokenKkey;
	private String email;
	private String passwd;          
	private String memberPoint;    
	private String memberCcash;     
	private String memberLevel;    
	private String extraField1;   
	private String extraField2;  
	private String extraField3;    
	private String extraField4;    
	private String extraField5;   
	private String regDate;   
	private String updatedate;
	private String state;
	
	public String getMemberUid() {
		return memberUid;
	}
	public void setMemberUid(String memberUid) {
		this.memberUid = memberUid;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSocialCode() {
		return socialCode;
	}
	public void setSocialCode(String socialCode) {
		this.socialCode = socialCode;
	}
	public String getSocialTokenKkey() {
		return socialTokenKkey;
	}
	public void setSocialTokenKkey(String socialTokenKkey) {
		this.socialTokenKkey = socialTokenKkey;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(String memberPoint) {
		this.memberPoint = memberPoint;
	}
	public String getMemberCcash() {
		return memberCcash;
	}
	public void setMemberCcash(String memberCcash) {
		this.memberCcash = memberCcash;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public String getExtraField1() {
		return extraField1;
	}
	public void setExtraField1(String extraField1) {
		this.extraField1 = extraField1;
	}
	public String getExtraField2() {
		return extraField2;
	}
	public void setExtraField2(String extraField2) {
		this.extraField2 = extraField2;
	}
	public String getExtraField3() {
		return extraField3;
	}
	public void setExtraField3(String extraField3) {
		this.extraField3 = extraField3;
	}
	public String getExtraField4() {
		return extraField4;
	}
	public void setExtraField4(String extraField4) {
		this.extraField4 = extraField4;
	}
	public String getExtraField5() {
		return extraField5;
	}
	public void setExtraField5(String extraField5) {
		this.extraField5 = extraField5;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
