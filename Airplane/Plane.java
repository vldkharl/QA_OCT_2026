
public class Plane {
    int flightId;
    int maximumPassengerSeats;
    int takenPassengerSeats;

    public Plane(int flightId, int maximumPassengerSeats, int takenPassengerSeats) {
        this.flightId = flightId;
        this.maximumPassengerSeats = maximumPassengerSeats;
        this.takenPassengerSeats = takenPassengerSeats;
    }

    public void showInfo() {
        System.out.println("Flight number " + flightId + " has " + takenPassengerSeats + " seats taken");
    }
}
