package Plane_and_car_environement;

public interface Movable {
    void move();
    String getType();

    int getId();

    Location getSource();
    Location getDestination();
    String getCurrentLocation();
}
