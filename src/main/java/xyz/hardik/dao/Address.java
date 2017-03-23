package xyz.hardik.dao;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by hpatel on 07-02-2017.
 */

public class Address {

	private String long_name;
	private String short_name;
	private String type;
	
	
	@XmlElement
	public String getLong_name() {
		return long_name;
	}
	public void setLong_name(String long_name) {
		this.long_name = long_name;
	}
	
	@XmlElement
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	
	@XmlElement
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
