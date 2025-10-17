/*
 * Concept: Safe Downcasting with instanceof
Design a home automation system controlling various smart devices:
● Smart TVs manage channels, volume, and streaming apps
● Smart thermostats control temperature, humidity, and energy saving modes
● Smart security systems handle cameras, alarms, and access controls
● Smart kitchen appliances manage cooking times, temperatures, and recipes
Process mixed device collections safely, applying appropriate controls without system
crashes.
Hint: Identify before you control - each device has its own smart features!
 */

class SmartTV {
    void changeChannel(int channel) {
        System.out.println("SmartTV: Changing to channel " + channel);
    }
    void adjustVolume(int volume) {
        System.out.println("SmartTV: Setting volume to " + volume);
    }
    void openStreamingApp(String app) {
        System.out.println("SmartTV: Opening streaming app " + app);
    }
}

class SmartThermostat {
    void setTemperature(double temp) {
        System.out.println("Thermostat: Setting temperature to " + temp + "°C");
    }
    void setHumidity(int humidity) {
        System.out.println("Thermostat: Setting humidity to " + humidity + "%");
    }
    void enableEnergySavingMode() {
        System.out.println("Thermostat: Energy saving mode enabled");
    }
}

class SmartSecuritySystem {
    void activateCamera() {
        System.out.println("Security: Camera activated");
    }
    void soundAlarm() {
        System.out.println("Security: Alarm sounding!");
    }
    void controlAccess(String user) {
        System.out.println("Security: Access control for " + user);
    }
}

class SmartKitchenAppliance {
    void setCookingTime(int minutes) {
        System.out.println("Kitchen: Cooking time set to " + minutes + " minutes");
    }
    void setCookingTemperature(int temp) {
        System.out.println("Kitchen: Cooking temperature set to " + temp + "°C");
    }
    void selectRecipe(String recipe) {
        System.out.println("Kitchen: Recipe selected - " + recipe);
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        // Mixed collection of smart devices
        Object[] devices = {
            new SmartTV(),
            new SmartThermostat(),
            new SmartSecuritySystem(),
            new SmartKitchenAppliance(),
            new SmartTV(),
            new SmartKitchenAppliance()
        };

        for (Object device : devices) {
            // Safe downcasting using instanceof
            if (device instanceof SmartTV) {
                SmartTV tv = (SmartTV) device;
                tv.changeChannel(5);
                tv.adjustVolume(15);
                tv.openStreamingApp("Netflix");
            } else if (device instanceof SmartThermostat) {
                SmartThermostat thermostat = (SmartThermostat) device;
                thermostat.setTemperature(22.5);
                thermostat.setHumidity(45);
                thermostat.enableEnergySavingMode();
            } else if (device instanceof SmartSecuritySystem) {
                SmartSecuritySystem security = (SmartSecuritySystem) device;
                security.activateCamera();
                security.soundAlarm();
                security.controlAccess("Alice");
            } else if (device instanceof SmartKitchenAppliance) {
                SmartKitchenAppliance kitchen = (SmartKitchenAppliance) device;
                kitchen.setCookingTime(30);
                kitchen.setCookingTemperature(180);
                kitchen.selectRecipe("Pasta");
            } else {
                System.out.println("Unknown device detected.");
            }
            System.out.println("---");
        }
    }
}