import java.util.ArrayList;

public class SmartHomeTest {
   public static void main(String[] args) {
    
    ArrayList<SmartDevice> devices = new ArrayList<>();

    devices.add(new SmartLight());
    devices.add(new SmartThermostat());
    devices.add(new SmarrtDoorLock());

    for(SmartDevice device : devices){
         System.out.println(device.deviceInfo());
            System.out.println(device.turnOn());
            System.out.println("Status: " + device.getStatus());
            System.out.println(device.turnOff());
            System.out.println("Status: " + device.getStatus());
            System.out.println("---");
    }
   } 
}
