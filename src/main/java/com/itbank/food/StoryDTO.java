package com.itbank.food;

import java.util.Date;


public class StoryDTO {
	private int strNo;
	private String strWriter;
	private String strTitle;
	private String strContent;
	private Date strDate;
	private int strHit;
	private String strImg;
	private String strMaterial;
	
	public int getStrNo() {
		return strNo;
	}
	public void setStrNo(int strNo) {
		this.strNo = strNo;
	}
	public String getStrWriter() {
		return strWriter;
	}
	public void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getStrContent() {
		return strContent;
	}
	public void setStrContent(String strContent) {
		this.strContent = strContent;
	}
	
	public Date getStrDate() {
		return strDate;
	}
	public void setStrDate(Date strDate) {
		this.strDate = strDate;
	}
	public int getStrHit() {
		return strHit;
	}
	public void setStrHit(int strHit) {
		this.strHit = strHit;
	}
	public String getStrImg() {
		return strImg;
	}
	public void setStrImg(String strImg) {
		this.strImg = strImg;
	}
	public String getStrMaterial() {
		return strMaterial;
	}
	public void setStrMaterial(String strMaterial) {
		this.strMaterial = strMaterial;
	}
}
