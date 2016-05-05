package entities;

public class GeoPosition {

	double latitude;
	double longitude;

	
	public GeoPosition() {
		super();
	}

	public GeoPosition(double latitude, double longitude) {

		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

}
