package com.example.geo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Location {
	@JsonProperty(value = "lat")
	String latitide;
	@JsonProperty(value = "lng")
	String longitude;
	
	public String getLatitide() {
		return latitide;
	}
	public void setLatitide(String latitide) {
		this.latitide = latitide;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
}