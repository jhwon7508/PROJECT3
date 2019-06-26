package com.itbank.food;

public class SellerDTO {

	String selId;
	String selPw;
	String selName;

	String selAddr1;
	String selAddr2;
	String selAddr3;
	String selAddr = selAddr1 + selAddr2 + selAddr3;

	String selTel1;
	String selTel2;
	String selTel3;
	String selTel = selTel1 + selTel2 + selTel3;

	public String getSelAddr() {
		return selAddr;
	}

	public void setSelAddr(String selAddr) {
		this.selAddr = selAddr;
	}

	public String getSelTel() {
		return selTel;
	}

	public void setSelTel(String selTel) {
		this.selTel = selTel;
	}

	String selGrade;

	public String getSelId() {
		return selId;
	}

	public void setSelId(String selId) {
		this.selId = selId;
	}

	public String getSelPw() {
		return selPw;
	}

	public void setSelPw(String selPw) {
		this.selPw = selPw;
	}

	public String getSelName() {
		return selName;
	}

	public void setSelName(String selName) {
		this.selName = selName;
	}

	public String getSelAddr1() {
		return selAddr1;
	}

	public void setSelAddr1(String selAddr1) {
		this.selAddr1 = selAddr1;
	}

	public String getSelAddr2() {
		return selAddr2;
	}

	public void setSelAddr2(String selAddr2) {
		this.selAddr2 = selAddr2;
	}

	public String getSelAddr3() {
		return selAddr3;
	}

	public void setSelAddr3(String selAddr3) {
		this.selAddr3 = selAddr3;
	}

	public String getSelTel1() {
		return selTel1;
	}

	public void setSelTel1(String selTel1) {
		this.selTel1 = selTel1;
	}

	public String getSelTel2() {
		return selTel2;
	}

	public void setSelTel2(String selTel2) {
		this.selTel2 = selTel2;
	}

	public String getSelTel3() {
		return selTel3;
	}

	public void setSelTel3(String selTel3) {
		this.selTel3 = selTel3;
	}

	public String getSelGrade() {
		return selGrade;
	}

	public void setSelGrade(String selGrade) {
		this.selGrade = selGrade;
	}

}
