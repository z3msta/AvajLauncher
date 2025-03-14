package Simulator;

public class Baloon extends Aircraft {

    public Baloon(long p_id, String p_name, Coordinates p_coordinates) {

        super(p_id, p_name, p_coordinates);
    }

    public void updateConditions() {
        this.currentWeather = weatherTower.getWeather(coordinates);
        
        switch (currentWeather) {

            case "SUN":
                System.out.println("Baloon" + "#" + this.name + "(" + this.id + ")" + ": Sun is up :D");
                this.coordinates.setLongitude(this.coordinates.getLongitude() + 2);
                this.coordinates.setHeight(this.coordinates.getHeight() + 4);
            case "RAIN":
                System.out.println("Baloon" + "#" + this.name + "(" + this.id + ")" + ": Ain't no sunshine, time to go down");
                this.coordinates.setHeight(this.coordinates.getHeight() - 5);
            case "FOG":
                System.out.println("Baloon" + "#" + this.name + "(" + this.id + ")" + ": CAN'T SEE SH*T");
                this.coordinates.setHeight(this.coordinates.getHeight() - 3);
            case "SNOW":
                System.out.println("Baloon" + "#" + this.name + "(" + this.id + ")" + ": I hate the snow");
                this.coordinates.setHeight(this.coordinates.getHeight() - 15);
        }
    }
}
