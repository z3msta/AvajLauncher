package Simulator;

public class Helicopter extends Aircraft {

    public Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
        super("Helicopter", p_id, p_name, p_coordinates);
    }

    public void updateConditions() {

//        String currentWeather = this.currentWeather;
        this.currentWeather = weatherTower.getWeather(coordinates);

        switch (currentWeather) {
            case "SUN":
                System.out.println("Helicopter" + "#" + this.name + "(" + this.id + ")" + ": I kinda hate the sun");
                this.coordinates.setLongitude(this.coordinates.getLongitude() + 10);
                this.coordinates.setHeight(this.coordinates.getHeight() + 2);
                break;
            case "RAIN":
                System.out.println("Helicopter" + "#" + this.name + "(" + this.id + ")" + ": Fruit ninja but with water");
                this.coordinates.setLongitude(this.coordinates.getLongitude() + 5);
                break;
            case "FOG":
                System.out.println("Helicopter" + "#" + this.name + "(" + this.id + ")" + ": Can't see anything im gonna crash");
                this.coordinates.setLongitude(this.coordinates.getLongitude() + 1);
                break;
            case "SNOW":
                System.out.println("Helicopter" + "#" + this.name + "(" + this.id + ")" + ": What is this? never seen it.");
                this.coordinates.setHeight(this.coordinates.getHeight() - 12);
        }
        if (this.coordinates.getHeight() <= 0) {
            this.printHeightInfo();
            weatherTower.unregister(this);
        }
    }
}
