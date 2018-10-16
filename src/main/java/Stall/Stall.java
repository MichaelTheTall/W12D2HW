package Stall;

public abstract class Stall {

    private String name;
    private String owner;
    private String parking;

    public Stall(String name, String owner, String parking){
        this.name = name;
        this.owner = owner;
        this.parking = parking;
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


}
