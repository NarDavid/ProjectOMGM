package com.omgm.admin.catcarelog.beans;

import java.util.Date;

public class CatCareLogVO_M {

	private int CATCARELOG_NO;
	private int CATCARELOG_USERNUM; // USER 테이블 외부키
	private int CATCARELOG_SERVICENUM; // SERVICE 테이블 외부키
	private int CATCARELOG_WRITER; // USER 테이블 외부키
	private String CATCARELOG_TITLE;
	private String CATCARELOG_CONTENT;
	private String CATCARELOG_CARESTART;
	private String CATCARELOG_CAREEND;
	private Date CATCARELOG_REGDATE;
	private int CATCARELOG_LASTUPDATER;
	private Date CATCARELOG_LASTUPDATEDATE;
	private String CATCARELOG_IMG;

	// MEMBER 테이블 칼럼(얘약한사람 정보)
	private int MEMBER_SEQ;
	private String MEMBER_ID;
	private String MEMBER_NAME;
	private String MEMBER_PHONE;
	private String MEMBER_ADDRESS;
	private int MEMBER_POINT;
	private String MEMBER_RANK;

	// MEMBER 테이블 칼럼(작성자 정보)
	private int WRITER_SEQ;
	private String WRITER_ID;
	private String WRITER_NAME;
	private String WRITER_PHONE;
	private String WRITER_ADDRESS;
	private int WRITER_POINT;
	private String WRITER_RANK;
	
	
	public int getCATCARELOG_NO() {
		return CATCARELOG_NO;
	}
	public void setCATCARELOG_NO(int cATCARELOG_NO) {
		CATCARELOG_NO = cATCARELOG_NO;
	}
	public int getCATCARELOG_USERNUM() {
		return CATCARELOG_USERNUM;
	}
	public void setCATCARELOG_USERNUM(int cATCARELOG_USERNUM) {
		CATCARELOG_USERNUM = cATCARELOG_USERNUM;
	}
	public int getCATCARELOG_SERVICENUM() {
		return CATCARELOG_SERVICENUM;
	}
	public void setCATCARELOG_SERVICENUM(int cATCARELOG_SERVICENUM) {
		CATCARELOG_SERVICENUM = cATCARELOG_SERVICENUM;
	}
	public int getCATCARELOG_WRITER() {
		return CATCARELOG_WRITER;
	}
	public void setCATCARELOG_WRITER(int cATCARELOG_WRITER) {
		CATCARELOG_WRITER = cATCARELOG_WRITER;
	}
	public String getCATCARELOG_TITLE() {
		return CATCARELOG_TITLE;
	}
	public void setCATCARELOG_TITLE(String cATCARELOG_TITLE) {
		CATCARELOG_TITLE = cATCARELOG_TITLE;
	}
	public String getCATCARELOG_CONTENT() {
		return CATCARELOG_CONTENT;
	}
	public void setCATCARELOG_CONTENT(String cATCARELOG_CONTENT) {
		CATCARELOG_CONTENT = cATCARELOG_CONTENT;
	}
	public String getCATCARELOG_CARESTART() {
		return CATCARELOG_CARESTART;
	}
	public void setCATCARELOG_CARESTART(String cATCARELOG_CARESTART) {
		CATCARELOG_CARESTART = cATCARELOG_CARESTART;
	}
	public String getCATCARELOG_CAREEND() {
		return CATCARELOG_CAREEND;
	}
	public void setCATCARELOG_CAREEND(String cATCARELOG_CAREEND) {
		CATCARELOG_CAREEND = cATCARELOG_CAREEND;
	}
	public Date getCATCARELOG_REGDATE() {
		return CATCARELOG_REGDATE;
	}
	public void setCATCARELOG_REGDATE(Date cATCARELOG_REGDATE) {
		CATCARELOG_REGDATE = cATCARELOG_REGDATE;
	}
	public int getCATCARELOG_LASTUPDATER() {
		return CATCARELOG_LASTUPDATER;
	}
	public void setCATCARELOG_LASTUPDATER(int cATCARELOG_LASTUPDATER) {
		CATCARELOG_LASTUPDATER = cATCARELOG_LASTUPDATER;
	}
	public Date getCATCARELOG_LASTUPDATEDATE() {
		return CATCARELOG_LASTUPDATEDATE;
	}
	public void setCATCARELOG_LASTUPDATEDATE(Date cATCARELOG_LASTUPDATEDATE) {
		CATCARELOG_LASTUPDATEDATE = cATCARELOG_LASTUPDATEDATE;
	}
	public String getCATCARELOG_IMG() {
		return CATCARELOG_IMG;
	}
	public void setCATCARELOG_IMG(String cATCARELOG_IMG) {
		CATCARELOG_IMG = cATCARELOG_IMG;
	}
	public int getMEMBER_SEQ() {
		return MEMBER_SEQ;
	}
	public void setMEMBER_SEQ(int mEMBER_SEQ) {
		MEMBER_SEQ = mEMBER_SEQ;
	}
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public String getMEMBER_PHONE() {
		return MEMBER_PHONE;
	}
	public void setMEMBER_PHONE(String mEMBER_PHONE) {
		MEMBER_PHONE = mEMBER_PHONE;
	}
	public String getMEMBER_ADDRESS() {
		return MEMBER_ADDRESS;
	}
	public void setMEMBER_ADDRESS(String mEMBER_ADDRESS) {
		MEMBER_ADDRESS = mEMBER_ADDRESS;
	}
	public int getMEMBER_POINT() {
		return MEMBER_POINT;
	}
	public void setMEMBER_POINT(int mEMBER_POINT) {
		MEMBER_POINT = mEMBER_POINT;
	}
	public String getMEMBER_RANK() {
		return MEMBER_RANK;
	}
	public void setMEMBER_RANK(String mEMBER_RANK) {
		MEMBER_RANK = mEMBER_RANK;
	}
	public int getWRITER_SEQ() {
		return WRITER_SEQ;
	}
	public void setWRITER_SEQ(int wRITER_SEQ) {
		WRITER_SEQ = wRITER_SEQ;
	}
	public String getWRITER_ID() {
		return WRITER_ID;
	}
	public void setWRITER_ID(String wRITER_ID) {
		WRITER_ID = wRITER_ID;
	}
	public String getWRITER_NAME() {
		return WRITER_NAME;
	}
	public void setWRITER_NAME(String wRITER_NAME) {
		WRITER_NAME = wRITER_NAME;
	}
	public String getWRITER_PHONE() {
		return WRITER_PHONE;
	}
	public void setWRITER_PHONE(String wRITER_PHONE) {
		WRITER_PHONE = wRITER_PHONE;
	}
	public String getWRITER_ADDRESS() {
		return WRITER_ADDRESS;
	}
	public void setWRITER_ADDRESS(String wRITER_ADDRESS) {
		WRITER_ADDRESS = wRITER_ADDRESS;
	}
	public int getWRITER_POINT() {
		return WRITER_POINT;
	}
	public void setWRITER_POINT(int wRITER_POINT) {
		WRITER_POINT = wRITER_POINT;
	}
	public String getWRITER_RANK() {
		return WRITER_RANK;
	}
	public void setWRITER_RANK(String wRITER_RANK) {
		WRITER_RANK = wRITER_RANK;
	}
	@Override
	public String toString() {
		return "CatCareLogVO_M [CATCARELOG_NO=" + CATCARELOG_NO + ", CATCARELOG_USERNUM=" + CATCARELOG_USERNUM
				+ ", CATCARELOG_SERVICENUM=" + CATCARELOG_SERVICENUM + ", CATCARELOG_WRITER=" + CATCARELOG_WRITER
				+ ", CATCARELOG_TITLE=" + CATCARELOG_TITLE + ", CATCARELOG_CONTENT=" + CATCARELOG_CONTENT
				+ ", CATCARELOG_CARESTART=" + CATCARELOG_CARESTART + ", CATCARELOG_CAREEND=" + CATCARELOG_CAREEND
				+ ", CATCARELOG_REGDATE=" + CATCARELOG_REGDATE + ", CATCARELOG_LASTUPDATER=" + CATCARELOG_LASTUPDATER
				+ ", CATCARELOG_LASTUPDATEDATE=" + CATCARELOG_LASTUPDATEDATE + ", CATCARELOG_IMG=" + CATCARELOG_IMG
				+ "]";
	}
	
	
}