package Simulator;

public class Baloon extends Aircraft {

    public Baloon(long p_id, String p_name, Coordinates p_coordinates) {

        super("Baloon", p_id, p_name, p_coordinates);
    }

    public void updateConditions() {
        this.currentWeather = weatherTower.getWeather(coordinates);

        switch (currentWeather) {
            case "SUN":
                System.out.println("Baloon" + "#" + this.name + "(" + this.id + ")" + ": Sun is up :D");
                this.coordinates.setLongitude(this.coordinates.getLongitude() + 2);
                this.coordinates.setHeight(this.coordinates.getHeight() + 4);
                break;
            case "RAIN":
                System.out.println("Baloon" + "#" + this.name + "(" + this.id + ")" + ": Ain't no sunshine, time to go down");
                this.coordinates.setHeight(this.coordinates.getHeight() - 5);
                break;
            case "FOG":
                System.out.println("Baloon" + "#" + this.name + "(" + this.id + ")" + ": CAN'T SEE SH*T");
                this.coordinates.setHeight(this.coordinates.getHeight() - 3);
                break;
            case "SNOW":
                System.out.println("Baloon" + "#" + this.name + "(" + this.id + ")" + ": I hate the snow");
                this.coordinates.setHeight(this.coordinates.getHeight() - 15);
        }
        if (this.coordinates.getHeight() <= 0) {
            this.printHeightInfo();
            weatherTower.unregister(this);
        }
    }
}
