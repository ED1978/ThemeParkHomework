import java.util.ArrayList;

public abstract class Stall implements IReviewed{

    private String name;
    private String ownerName;
    private int rating;
    private ArrayList<Vehicle> parkingSpace;

    public Stall(String name, String ownerName){
        this.name = name;
        this. ownerName = ownerName;
        this.rating = rating;
        this. parkingSpace = new ArrayList<Vehicle>();
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getRating(){
        return this.rating;
    }

    public int getParkingSpaceCount(){
        return this.parkingSpace.size();
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public void parkVehicle(Vehicle vehicle){
        this.parkingSpace.add(vehicle);
    }

    public void leaveParkingSpace(){
        this.parkingSpace.remove(0);
    }
}
