public class BusStation
{
    private String address;
    private Bus bus1, bus2, bus3;
    public BusStation() {
        address = "jsdlkfjals";
        bus1 = new Bus();
        bus2 = new Bus();
        bus3 = new Bus();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String string) {
        address = string;
    }
    public void setBus(int busNumber, int busRouteNumber, String busDestination, String busDepartureTime, String busArrivalTime) {
        if (busNumber == 1) {
            bus1.setRouteNum(busRouteNumber);
            bus1.setDestination(busDestination);
            bus1.setDeptTime(busDepartureTime);
            bus1.setArrTime(busArrivalTime);
        } else if (busNumber == 2) {
            bus2.setRouteNum(busRouteNumber);
            bus2.setDestination(busDestination);
            bus2.setDeptTime(busDepartureTime);
            bus2.setArrTime(busArrivalTime);
        } else if (busNumber == 1) {
            bus3.setRouteNum(busRouteNumber);
            bus3.setDestination(busDestination);
            bus3.setDeptTime(busDepartureTime);
            bus3.setArrTime(busArrivalTime);
        }
    }
    // public String getBus(int busNumber) {
        // String busInfo = "";
        // if (busNumber == 1) {
            // busInfo = "Bus number: " + busNumber + " Route Number: " + bus1.getRouteNum+ " Is going to depart ";
        // }
        // return busInfo;
    // }
    public int delay() {
        return (int)(3*Math.random());
    }
}
