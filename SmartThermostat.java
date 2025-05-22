// SmartThermostat class
public class SmartThermostat implements SmartDevice {
    private boolean isOn = false;
    private int temperature = 22;

    public String turnOn() {
        isOn = true;
        return "Now Smart Thermostat is ON and set to " + temperature + "°C";
    }

    public String turnOff() {
        isOn = false;
        return "Now Smart Thermostat is OFF";
    }

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

    public String deviceInfo() {
        return "Device isSmart Thermostat";
    }
}

