public class BusDriver{
    public static void main(String args [])
    {
        BusStation oakBusStation = new BusStation();
        
        oakBusStation.setAddress("39 San Pablo Ave., Oakland");
        
        oakBusStation.setBus(1, 123, "LosAngeles", "6:30 A.M.", "4:07 P.M.");
        oakBusStation.setBus(2, 2342, "Vacaville", "3:00 P.M.","5:30 P.M.");
        oakBusStation.setBus(3, 150, "Chicago", "8:15 P.M.", "6:05 A.M. + 48 hours");
        System.out.println (oakBusStation.getBus(1));
        System.out.println (oakBusStation.getBus(2));
        System.out.println (oakBusStation.getBus(3));
    }
}