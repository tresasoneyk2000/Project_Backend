package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Parcel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String sendername;
	private String receivername;
	private String senderaddress;
	private String recieveraddress;
	private Long recieverPhno;
	private String username;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSendername() {
		return sendername;
	}

	public void setSendername(String sendername) {
		this.sendername = sendername;
	}

	public String getReceivername() {
		return receivername;
	}

	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}

	public String getSenderaddress() {
		return senderaddress;
	}

	public void setSenderaddress(String senderaddress) {
		this.senderaddress = senderaddress;
	}

	public String getRecieveraddress() {
		return recieveraddress;
	}

	public void setRecieveraddress(String recieveraddress) {
		this.recieveraddress = recieveraddress;
	}

	public Long getRecieverPhno() {
		return recieverPhno;
	}

	public void setRecieverPhno(Long recieverPhno) {
		this.recieverPhno = recieverPhno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Parcel(Long id, String sendername, String receivername, String senderaddress, String recieveraddress, Long recieverPhno, String username) {
		this.id = id;
		this.sendername = sendername;
		this.receivername = receivername;
		this.senderaddress = senderaddress;
		this.recieveraddress = recieveraddress;
		this.recieverPhno = recieverPhno;
		this.username = username;
	}

	public Parcel() {
	}
}