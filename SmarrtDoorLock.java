
public class SmarrtDoorLock implements SmartDevice {
    private boolean isLocked = true;

    public String turnOn() {
        isLocked = true;
        return "Now Smart Door is LOCKED";
    }

    public String turnOff() {
        isLocked = false;
        return "Now Smart Door is UNLOCKED";
    }

    public String getStatus() {
        return isLocked ? "LOCKED" : "UNLOCKED";
    }

    public String deviceInfo() {
        return "Device: Smart Door Lock";
    }
}


