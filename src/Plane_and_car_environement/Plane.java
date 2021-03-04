package Plane_and_car_environement;


public class Plane implements Movable , Comparable
{
    /*Properties Area */

    public static final int HEIGHT_LIMIT = 1500;
    int licenceNumber;
    Location source, destination;
    int maximalHeight;

    /*end Properties Area */

    public Plane(int id, Location src, Location dst, int maxHeight) {
        licenceNumber = id;
        source = src;
        destination = dst;
        maximalHeight = maxHeight;
    }

    @Override
    public String toString() {
        return String.format("licence = %d, source = %s, destination = %s, maxHeight = %d",
                licenceNumber, source, destination, maximalHeight);
    }

    @Override
    public String getType() {
        return "Plane";
    }

    @Override
    public int getId() {
        return licenceNumber;
    }

    @Override
    public Location getSource() {
        return source;
    }

    @Override
    public Location getDestination() {
        return destination;
    }

    @Override
    public String getCurrentLocation() {
        // TODO: Implement.
        return null;
    }

    @Override
    public void move() {
        Location temp = this.source;
        this.source = this.destination;
        this.destination = temp;
    }
    @Override
    public int compareTo(Object o) {
        Plane plane = (Plane) o ;
        return this.maximalHeight - plane.maximalHeight;
    }
}
