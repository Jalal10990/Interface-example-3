// SmartLight class
public class SmartLight implements SmartDevice {
    private boolean isOn = false;

    public String turnOn() {
        isOn = true;
        return "now light is ON";
    }

    public String turnOff() {
        isOn = false;
        return "Now Smart Light is OFF";
    }

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

    public String deviceInfo() {
        return "Device is Smart Light";
    }
}

