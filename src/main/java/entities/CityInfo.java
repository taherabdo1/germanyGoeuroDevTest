package entities;

import java.util.Map;

public class CityInfo {

	long _id;
	String key;
	String name;
	String fullName;
	String iata_airport_code;
	String type;
	String country;
	GeoPosition geo_position;
	long locationId;
	boolean inEurope;
	long countryId;
	String countryCode;
	boolean coreCountry;
	String distance;
	Map<String,String> names;
	Map<String, String> alternativeNames;
	public long get_id() {
		return _id;
	}
	public void set_id(long _id) {
		this._id = _id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public GeoPosition getGeo_position() {
		return geo_position;
	}
	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long location_id) {
		this.locationId = location_id;
	}
	public boolean isInEurope() {
		return inEurope;
	}
	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public boolean isCoreCountry() {
		return coreCountry;
	}
	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getIata_airport_code() {
		return iata_airport_code;
	}
	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public Map<String, String> getNames() {
		return names;
	}
	public void setNames(Map<String, String> names) {
		this.names = names;
	}
	public Map<String, String> getAlternativeNames() {
		return alternativeNames;
	}
	public void setAlternativeNames(Map<String, String> alternativeNames) {
		this.alternativeNames = alternativeNames;
	}
	
	
	
	
	
}
