package xyz.hardik.dao;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Created by hpatel on 07-02-2017.
 * 
 * GeocodeReosonse is "Root"-Element in XML given by GMaps API URL.
 * 
 * Here ByDefault we are declaring JAXB Annotations with Getters Method.
 *  
 */

@XmlRootElement(name = "GeocodeResponse")
//@XmlAccessorOrder(status, res)
public class GeocodeResponse {

	private String status;
	Result res;					// Creating Class type Variable for Sub-Element of Result Element.
	
	@XmlElement
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@XmlElement(name="result")
	public Result getRes() {
		return res;
	}
	public void setRes(Result res) {
		this.res = res;
	}
	
}