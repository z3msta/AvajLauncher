package Simulator;

public class JetPlane extends Aircraft {

	public JetPlane(long p_id, String p_name, Coordinates p_coordinates) {

		super("JetPlane", p_id, p_name, p_coordinates);
	}

	public void updateConditions() {

		String currentWeather = this.currentWeather;
		this.currentWeather = weatherTower.getWeather(coordinates);
		
		switch (currentWeather) {

			case "SUN":
				System.out.println("JetPlane" + "#" + this.name + "(" + this.id + ")" + ": Finally summer is here");
				this.coordinates.setLatitude(this.coordinates.getLatitude() + 10);
				this.coordinates.setHeight(this.coordinates.getHeight() + 2);
				break;
			case "RAIN":
				System.out.println("JetPlane" + "#" + this.name + "(" + this.id + ")" + ": Rain is painful at this speed!");
				this.coordinates.setLatitude(this.coordinates.getLatitude() + 5);
				break;
			case "FOG":
				System.out.println("JetPlane" + "#" + this.name + "(" + this.id + ")" + ": Use the radar. Please dont crash me :(");
				this.coordinates.setLatitude(this.coordinates.getLatitude() + 1);
				break;
			case "SNOW":
				System.out.println("JetPlane" + "#" + this.name + "(" + this.id + ")" + ": LET IT SNOW!");
				this.coordinates.setHeight(this.coordinates.getHeight() - 7);
		}
		if (this.coordinates.getHeight() <= 0) {
			this.printHeightInfo();
			weatherTower.unregister(this);
		}
	}
}
