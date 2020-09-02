package com.omgm.user.roomreservation.beans;

import java.util.Date;

public class RoomReservationVO {

	// RESERVATION 테이블 칼럼
	private int ROOMRESERVATION_NO; // 쿼리에서 시퀀스로 줄것
	private int ROOMRESERVATION_ROOMNO; // ROOM TABLE 외부키
	private String ROOMRESERVATION_ROOMNAME;
	private int ROOMRESERVATION_MEMBERNO; // MEMBER TABLE 외부키
	private Date ROOMRESERVATION_STAYDAY;
	private String ROOMRESERVATION_STRSTAYDAY; // 필요없는값
	private Date ROOMRESERVATION_PAYDAY; // 쿼리에서 SYSDATE로 넣어줄것
	private int ROOMRESERVATION_FOODNO;
	private String ROOMRESERVATION_FOODNAME;
	private int ROOMRESERVATION_TOYNO;
	private String ROOMRESERVATION_TOYNAME;
	private String ROOMRESERVATION_PICKUPYN;
	private String ROOMRESERVATION_PICKUPTIME;
	private String ROOMRESERVATION_PICKUPADDRESS;
	private String ROOMRESERVATION_PICKUPPHONENUM;
	private String ROOMRESERVATION_USEPOINTYN;
	private int ROOMRESERVATION_USEPOINT;
	private int ROOMRESERVATION_PLUSPOINT;
	private int ROOMRESERVATION_FIANLFEE;

	// MEMBER 테이블 칼럼
	private int MEMBER_SEQ;
	private String MEMBER_ID;
	private String MEMBER_NAME;
	private String MEMBER_PHONE;
	private String MEMBER_ADDRESS;
	private int MEMBER_POINT;
	private String MEMBER_RANK;

	// ROOM 테이블 칼럼
	private int ROOM_NO;
	private String ROOM_NAME;
	private String ROOM_CONTENT;
	private String ROOM_IMG;
	private int ROOM_PRICE;
	private int ROOM_SALERATE;
	private String ROOM_KIND;
	private int ROOM_RANK;
	private String ROOM_FOR;

	public int getROOMRESERVATION_NO() {
		return ROOMRESERVATION_NO;
	}

	public void setROOMRESERVATION_NO(int rOOMRESERVATION_NO) {
		ROOMRESERVATION_NO = rOOMRESERVATION_NO;
	}

	public int getROOMRESERVATION_ROOMNO() {
		return ROOMRESERVATION_ROOMNO;
	}

	public void setROOMRESERVATION_ROOMNO(int rOOMRESERVATION_ROOMNO) {
		ROOMRESERVATION_ROOMNO = rOOMRESERVATION_ROOMNO;
	}

	public String getROOMRESERVATION_ROOMNAME() {
		return ROOMRESERVATION_ROOMNAME;
	}

	public void setROOMRESERVATION_ROOMNAME(String rOOMRESERVATION_ROOMNAME) {
		ROOMRESERVATION_ROOMNAME = rOOMRESERVATION_ROOMNAME;
	}

	public int getROOMRESERVATION_MEMBERNO() {
		return ROOMRESERVATION_MEMBERNO;
	}

	public void setROOMRESERVATION_MEMBERNO(int rOOMRESERVATION_MEMBERNO) {
		ROOMRESERVATION_MEMBERNO = rOOMRESERVATION_MEMBERNO;
	}

	public Date getROOMRESERVATION_STAYDAY() {
		return ROOMRESERVATION_STAYDAY;
	}

	public void setROOMRESERVATION_STAYDAY(Date rOOMRESERVATION_STAYDAY) {
		ROOMRESERVATION_STAYDAY = rOOMRESERVATION_STAYDAY;
	}

	public String getROOMRESERVATION_STRSTAYDAY() {
		return ROOMRESERVATION_STRSTAYDAY;
	}

	public void setROOMRESERVATION_STRSTAYDAY(String rOOMRESERVATION_STRSTAYDAY) {
		ROOMRESERVATION_STRSTAYDAY = rOOMRESERVATION_STRSTAYDAY;
	}

	public Date getROOMRESERVATION_PAYDAY() {
		return ROOMRESERVATION_PAYDAY;
	}

	public void setROOMRESERVATION_PAYDAY(Date rOOMRESERVATION_PAYDAY) {
		ROOMRESERVATION_PAYDAY = rOOMRESERVATION_PAYDAY;
	}

	public int getROOMRESERVATION_FOODNO() {
		return ROOMRESERVATION_FOODNO;
	}

	public void setROOMRESERVATION_FOODNO(int rOOMRESERVATION_FOODNO) {
		ROOMRESERVATION_FOODNO = rOOMRESERVATION_FOODNO;
	}

	public String getROOMRESERVATION_FOODNAME() {
		return ROOMRESERVATION_FOODNAME;
	}

	public void setROOMRESERVATION_FOODNAME(String rOOMRESERVATION_FOODNAME) {
		ROOMRESERVATION_FOODNAME = rOOMRESERVATION_FOODNAME;
	}

	public int getROOMRESERVATION_TOYNO() {
		return ROOMRESERVATION_TOYNO;
	}

	public void setROOMRESERVATION_TOYNO(int rOOMRESERVATION_TOYNO) {
		ROOMRESERVATION_TOYNO = rOOMRESERVATION_TOYNO;
	}

	public String getROOMRESERVATION_TOYNAME() {
		return ROOMRESERVATION_TOYNAME;
	}

	public void setROOMRESERVATION_TOYNAME(String rOOMRESERVATION_TOYNAME) {
		ROOMRESERVATION_TOYNAME = rOOMRESERVATION_TOYNAME;
	}

	public String getROOMRESERVATION_PICKUPYN() {
		return ROOMRESERVATION_PICKUPYN;
	}

	public void setROOMRESERVATION_PICKUPYN(String rOOMRESERVATION_PICKUPYN) {
		ROOMRESERVATION_PICKUPYN = rOOMRESERVATION_PICKUPYN;
	}

	public String getROOMRESERVATION_PICKUPTIME() {
		return ROOMRESERVATION_PICKUPTIME;
	}

	public void setROOMRESERVATION_PICKUPTIME(String rOOMRESERVATION_PICKUPTIME) {
		ROOMRESERVATION_PICKUPTIME = rOOMRESERVATION_PICKUPTIME;
	}

	public String getROOMRESERVATION_PICKUPADDRESS() {
		return ROOMRESERVATION_PICKUPADDRESS;
	}

	public void setROOMRESERVATION_PICKUPADDRESS(String rOOMRESERVATION_PICKUPADDRESS) {
		ROOMRESERVATION_PICKUPADDRESS = rOOMRESERVATION_PICKUPADDRESS;
	}

	public String getROOMRESERVATION_PICKUPPHONENUM() {
		return ROOMRESERVATION_PICKUPPHONENUM;
	}

	public void setROOMRESERVATION_PICKUPPHONENUM(String rOOMRESERVATION_PICKUPPHONENUM) {
		ROOMRESERVATION_PICKUPPHONENUM = rOOMRESERVATION_PICKUPPHONENUM;
	}

	public String getROOMRESERVATION_USEPOINTYN() {
		return ROOMRESERVATION_USEPOINTYN;
	}

	public void setROOMRESERVATION_USEPOINTYN(String rOOMRESERVATION_USEPOINTYN) {
		ROOMRESERVATION_USEPOINTYN = rOOMRESERVATION_USEPOINTYN;
	}

	public int getROOMRESERVATION_USEPOINT() {
		return ROOMRESERVATION_USEPOINT;
	}

	public void setROOMRESERVATION_USEPOINT(int rOOMRESERVATION_USEPOINT) {
		ROOMRESERVATION_USEPOINT = rOOMRESERVATION_USEPOINT;
	}

	public int getROOMRESERVATION_PLUSPOINT() {
		return ROOMRESERVATION_PLUSPOINT;
	}

	public void setROOMRESERVATION_PLUSPOINT(int rOOMRESERVATION_PLUSPOINT) {
		ROOMRESERVATION_PLUSPOINT = rOOMRESERVATION_PLUSPOINT;
	}

	public int getROOMRESERVATION_FIANLFEE() {
		return ROOMRESERVATION_FIANLFEE;
	}

	public void setROOMRESERVATION_FIANLFEE(int rOOMRESERVATION_FIANLFEE) {
		ROOMRESERVATION_FIANLFEE = rOOMRESERVATION_FIANLFEE;
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

	public int getROOM_NO() {
		return ROOM_NO;
	}

	public void setROOM_NO(int rOOM_NO) {
		ROOM_NO = rOOM_NO;
	}

	public String getROOM_NAME() {
		return ROOM_NAME;
	}

	public void setROOM_NAME(String rOOM_NAME) {
		ROOM_NAME = rOOM_NAME;
	}

	public String getROOM_CONTENT() {
		return ROOM_CONTENT;
	}

	public void setROOM_CONTENT(String rOOM_CONTENT) {
		ROOM_CONTENT = rOOM_CONTENT;
	}

	public String getROOM_IMG() {
		return ROOM_IMG;
	}

	public void setROOM_IMG(String rOOM_IMG) {
		ROOM_IMG = rOOM_IMG;
	}

	public int getROOM_PRICE() {
		return ROOM_PRICE;
	}

	public void setROOM_PRICE(int rOOM_PRICE) {
		ROOM_PRICE = rOOM_PRICE;
	}

	public int getROOM_SALERATE() {
		return ROOM_SALERATE;
	}

	public void setROOM_SALERATE(int rOOM_SALERATE) {
		ROOM_SALERATE = rOOM_SALERATE;
	}

	public String getROOM_KIND() {
		return ROOM_KIND;
	}

	public void setROOM_KIND(String rOOM_KIND) {
		ROOM_KIND = rOOM_KIND;
	}

	public int getROOM_RANK() {
		return ROOM_RANK;
	}

	public void setROOM_RANK(int rOOM_RANK) {
		ROOM_RANK = rOOM_RANK;
	}

	public String getROOM_FOR() {
		return ROOM_FOR;
	}

	public void setROOM_FOR(String rOOM_FOR) {
		ROOM_FOR = rOOM_FOR;
	}

	@Override
	public String toString() {
		return "RoomReservationVO [MEMBER_ADDRESS=" + MEMBER_ADDRESS + ", MEMBER_ID=" + MEMBER_ID + ", MEMBER_NAME="
				+ MEMBER_NAME + ", MEMBER_PHONE=" + MEMBER_PHONE + ", MEMBER_POINT=" + MEMBER_POINT + ", MEMBER_RANK="
				+ MEMBER_RANK + ", MEMBER_SEQ=" + MEMBER_SEQ + ", ROOM_CONTENT=" + ROOM_CONTENT + ", ROOM_FOR="
				+ ROOM_FOR + ", ROOM_IMG=" + ROOM_IMG + ", ROOM_KIND=" + ROOM_KIND + ", ROOM_NAME=" + ROOM_NAME
				+ ", ROOM_NO=" + ROOM_NO + ", ROOM_PRICE=" + ROOM_PRICE + ", ROOM_RANK=" + ROOM_RANK
				+ ", ROOM_SALERATE=" + ROOM_SALERATE + ", ROOMRESERVATION_FIANLFEE=" + ROOMRESERVATION_FIANLFEE
				+ ", ROOMRESERVATION_FOODNAME=" + ROOMRESERVATION_FOODNAME + ", ROOMRESERVATION_FOODNO="
				+ ROOMRESERVATION_FOODNO + ", ROOMRESERVATION_MEMBERNO=" + ROOMRESERVATION_MEMBERNO
				+ ", ROOMRESERVATION_NO=" + ROOMRESERVATION_NO + ", ROOMRESERVATION_PAYDAY=" + ROOMRESERVATION_PAYDAY
				+ ", ROOMRESERVATION_PICKUPADDRESS=" + ROOMRESERVATION_PICKUPADDRESS
				+ ", ROOMRESERVATION_PICKUPPHONENUM=" + ROOMRESERVATION_PICKUPPHONENUM + ", ROOMRESERVATION_PICKUPTIME="
				+ ROOMRESERVATION_PICKUPTIME + ", ROOMRESERVATION_PICKUPYN=" + ROOMRESERVATION_PICKUPYN
				+ ", ROOMRESERVATION_PLUSPOINT=" + ROOMRESERVATION_PLUSPOINT + ", ROOMRESERVATION_ROOMNAME="
				+ ROOMRESERVATION_ROOMNAME + ", ROOMRESERVATION_ROOMNO=" + ROOMRESERVATION_ROOMNO
				+ ", ROOMRESERVATION_STAYDAY=" + ROOMRESERVATION_STAYDAY + ", ROOMRESERVATION_STRSTAYDAY="
				+ ROOMRESERVATION_STRSTAYDAY + ", ROOMRESERVATION_TOYNAME=" + ROOMRESERVATION_TOYNAME
				+ ", ROOMRESERVATION_TOYNO=" + ROOMRESERVATION_TOYNO + ", ROOMRESERVATION_USEPOINT="
				+ ROOMRESERVATION_USEPOINT + ", ROOMRESERVATION_USEPOINTYN=" + ROOMRESERVATION_USEPOINTYN + "]";
	}
	
	public String toString2() {
		return "RoomReservationVO [ROOMRESERVATION_NO=" + ROOMRESERVATION_NO + ", ROOMRESERVATION_ROOMNO="
				+ ROOMRESERVATION_ROOMNO + ", ROOMRESERVATION_ROOMNAME=" + ROOMRESERVATION_ROOMNAME
				+ ", ROOMRESERVATION_MEMBERNO=" + ROOMRESERVATION_MEMBERNO + ", ROOMRESERVATION_STAYDAY="
				+ ROOMRESERVATION_STAYDAY + ", ROOMRESERVATION_STRSTAYDAY=" + ROOMRESERVATION_STRSTAYDAY
				+ ", ROOMRESERVATION_PAYDAY=" + ROOMRESERVATION_PAYDAY + ", ROOMRESERVATION_FOODNO="
				+ ROOMRESERVATION_FOODNO + ", ROOMRESERVATION_FOODNAME=" + ROOMRESERVATION_FOODNAME
				+ ", ROOMRESERVATION_TOYNO=" + ROOMRESERVATION_TOYNO + ", ROOMRESERVATION_TOYNAME="
				+ ROOMRESERVATION_TOYNAME + ", ROOMRESERVATION_PICKUPYN=" + ROOMRESERVATION_PICKUPYN
				+ ", ROOMRESERVATION_PICKUPTIME=" + ROOMRESERVATION_PICKUPTIME + ", ROOMRESERVATION_PICKUPADDRESS="
				+ ROOMRESERVATION_PICKUPADDRESS + ", ROOMRESERVATION_PICKUPPHONENUM=" + ROOMRESERVATION_PICKUPPHONENUM
				+ ", ROOMRESERVATION_USEPOINTYN=" + ROOMRESERVATION_USEPOINTYN + ", ROOMRESERVATION_USEPOINT="
				+ ROOMRESERVATION_USEPOINT + ", ROOMRESERVATION_PLUSPOINT=" + ROOMRESERVATION_PLUSPOINT
				+ ", ROOMRESERVATION_FIANLFEE=" + ROOMRESERVATION_FIANLFEE + "]";
	}
	
	
	
}


