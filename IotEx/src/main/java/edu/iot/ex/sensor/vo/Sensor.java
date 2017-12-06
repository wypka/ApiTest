package edu.iot.ex.sensor.vo;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Sensor implements Serializable{
	private String memberId;
	private String flameValue;
	private String temperature;
	private Date sendDate;
	private boolean flameChk;
	private MultipartFile picture;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFlameValue() {
		return flameValue;
	}
	public void setFlameValue(String flameValue) {
		this.flameValue = flameValue;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public boolean isFlameChk() {
		return flameChk;
	}
	public void setFlameChk(boolean flameChk) {
		this.flameChk = flameChk;
	}
	public MultipartFile getPicture() {
		return picture;
	}
	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}
	public Sensor(String memberId, String flameValue, String temperature, Date sendDate, boolean flameChk,
			MultipartFile picture) {
		super();
		this.memberId = memberId;
		this.flameValue = flameValue;
		this.temperature = temperature;
		this.sendDate = sendDate;
		this.flameChk = flameChk;
		this.picture = picture;
	}
	public Sensor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Sensor [memberId=" + memberId + ", flameValue=" + flameValue + ", temperature=" + temperature
				+ ", sendDate=" + sendDate + ", flameChk=" + flameChk + ", picture=" + picture + "]";
	}
	
	
}
