package Stall;

public abstract class Stall {

    private String name;
    private String owner;
    private String parking;

    private int rating;

    public Stall(String name, String owner, String parking, int rating){
        this.name = name;
        this.owner = owner;
        this.parking = parking;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getParking() {
        return parking;
    }

    public int getRating() {
        return rating;
    }


}
