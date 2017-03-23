package xyz.hardik.dao;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by hpatel on 07-02-2017.
 */

public class Location {

	private double lat;
	private double lng;
	
	@XmlElement
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	@XmlElement
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	
	
	@Override
	public String toString() {
		return "Location [lat=" + lat + ", lng=" + lng + "]";
	}
	
}
