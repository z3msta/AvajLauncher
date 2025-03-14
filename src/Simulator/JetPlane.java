package Simulator;

public class JetPlane extends Aircraft {

    public JetPlane(long p_id, String p_name, Coordinates p_coordinates) {
        super(p_id, p_name, p_coordinates);
    }

    public void updateConditions() {

//        String currentWeather = this.currentWeather;
        this.currentWeather = weatherTower.getWeather(coordinates);


        switch (currentWeather) {

            case "SUN":
                System.out.println("Helicopter" + "#" + this.name + "(" + this.id + ")" + ": Finally summer is here");
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 10);
                this.coordinates.setHeight(this.coordinates.getHeight() + 2);
            case "RAIN":
                System.out.println("Helicopter" + "#" + this.name + "(" + this.id + ")" + ": Rain is painful at this speed!");
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 5);
            case "FOG":
                System.out.println("Helicopter" + "#" + this.name + "(" + this.id + ")" + ": Use the radar. Please dont crash me :(");
                this.coordinates.setLatitude(this.coordinates.getLatitude() + 1);
            case "SNOW":
                System.out.println("Helicopter" + "#" + this.name + "(" + this.id + ")" + ": LET IT SNOW!");
                this.coordinates.setHeight(this.coordinates.getHeight() - 7);
        }
    }
}
