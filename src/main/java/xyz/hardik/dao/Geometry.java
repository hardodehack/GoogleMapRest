package xyz.hardik.dao;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by hpatel on 07-02-2017.
 */

public class Geometry {

	private String location_type;
	Location location;
	
	@XmlElement
	public String getLocation_type() {
		return location_type;
	}
	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}
	
	@XmlElement
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
