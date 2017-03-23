package xyz.hardik.rest;

import java.io.InputStream;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javax.xml.bind.*;


import xyz.hardik.dao.*;

@Path("/getLL")
public class GetLatLang {
	
	URL url;
    InputStream is = null;
    
	@Path("/xml/{location}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getXml(@PathParam("location")  String location) throws Exception{
		
		url = new URL("https://maps.googleapis.com/maps/api/geocode/xml?address="+location);
		is = url.openStream();       
		
		JAXBContext context = JAXBContext.newInstance(xyz.hardik.dao.GeocodeResponse.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		GeocodeResponse gObj = (GeocodeResponse) unmarshaller.unmarshal(url);
		
		String forAdd = gObj.getRes().getFormatted_address();
		double lat = gObj.getRes().geoClass.getLocation().getLat();
		double lng = gObj.getRes().geoClass.getLocation().getLng();
			
		Result res = new Result();
		
		res.setFormatted_address(forAdd);
		Geometry geo = new Geometry();
		Location loc = new Location();
		
		loc.setLng(lng);
		loc.setLat(lat);
		res.setGeo(geo);
		geo.setLocation(loc);
		return Response.status(200).entity(res).build();
	}
	
	
	@Path("/json/{location}")
	@GET
	@Produces("application/json")
	public Response getJson(@PathParam("location") String location)throws Exception{
		
	
		return Response.ok().build();
	}
}