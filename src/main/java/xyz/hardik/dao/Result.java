package xyz.hardik.dao;

import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * Created by hpatel on 07-02-2017.
 * 
 * Same as GeocodeResponse Class, All this are sub-element of Result Class.
 * 
 */

public class Result {
	
	private String type;
	private String formatted_address;
	private String place_id;
	Address address;
	public Geometry geoClass;
	
	@XmlElement
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@XmlElement
	public String getFormatted_address() {
		return formatted_address;
	}
	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}
	
	@XmlElement
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	
	@XmlElement(name="address_component")
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@XmlElement(name="geometry")
	public Geometry getGeo() {
		return geoClass;
	}
	public void setGeo(Geometry geo) {
		this.geoClass = geo;
	}
}