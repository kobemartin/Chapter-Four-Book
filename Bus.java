public class Bus
{
    private int seats, routeNumber, busNum;
    private String departureTime, arrivalTime, destination;
    public Bus(){
        seats = 0;
        routeNumber = 0;
        departureTime = "cool";
        arrivalTime = "very late";
        destination = "MOON";
        busNum = 38572;
    }
    public Bus(int numSeats, int numRoute, String depTime, String arrTime, String dest, int numBus) {
        seats = numSeats;
        routeNumber = numRoute;
        departureTime = depTime;
        arrivalTime = arrTime;
        destination = dest;
        busNum = numBus;
    }
    public int getSeats(){
        return seats;
    }
    public void setSeats(int num) {
        seats = num;
    }
    public int getRouteNum() {
        return routeNumber;
    }
    public void setRouteNum(int num) {
        routeNumber = num;
    }
    public int getBusNum() {
        return busNum;
    }
    public void setBusNum(int num) {
        busNum = num;
    }
    public String getDeptTime() {
        return departureTime;
    }
    public void setDeptTime(String string) {
        departureTime = string;
    }
    public String getArrTime() {
        return arrivalTime;
    }
    public void setArrTime(String string) {
        arrivalTime = string;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String string) {
        destination = string;
    }
    public String toString() {
        return "Bus Number: ";
    }
}
