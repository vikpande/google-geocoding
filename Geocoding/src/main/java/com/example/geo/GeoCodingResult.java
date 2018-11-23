package com.example.geo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoCodingResult {
	@JsonProperty(value = "formatted_address")
	String formattedAddress;

	@JsonProperty(value = "geometry")
	Geometry geometry;
	
	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	public Geometry getgeometry() {
		return geometry;
	}

	public void setgeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	@Override
	public String toString() {
		return "GeoCodingResult [formattedAddress=" + formattedAddress + ", geometry=" + geometry + "]";
	}

}