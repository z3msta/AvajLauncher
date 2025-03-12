package Simulator;

public class Coordinates {

	//this class cannot exist on its own
	//can't have coordinates without an aircraft
	private int longitude;
	private int latitude;
	private int height;

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLongitude() {
		return longitude;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getHeight() {
		return height;
	}

	//this instance of a class
}
