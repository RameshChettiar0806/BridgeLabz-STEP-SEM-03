/*
 * Create a campus management system with different smart devices:
● Smart classrooms control lighting, AC, and projectors
● Smart labs manage equipment and safety systems
● Smart libraries track occupancy and book availability
Process mixed device collections safely, applying the right controls to each device type
without crashing.
Hint: Check first, cast second - safety matters in the real world!
 */

interface SmartDevice {
    void status();
}

class SmartClassroom implements SmartDevice {
    private boolean lightsOn = false;
    private boolean acOn = false;
    private boolean projectorOn = false;

    public void controlLights(boolean on) {
        lightsOn = on;
        System.out.println("Classroom lights " + (on ? "ON" : "OFF"));
    }

    public void controlAC(boolean on) {
        acOn = on;
        System.out.println("Classroom AC " + (on ? "ON" : "OFF"));
    }

    public void controlProjector(boolean on) {
        projectorOn = on;
        System.out.println("Classroom projector " + (on ? "ON" : "OFF"));
    }

    public void status() {
        System.out.println("Classroom Status: Lights=" + lightsOn + ", AC=" + acOn + ", Projector=" + projectorOn);
    }
}

class SmartLab implements SmartDevice {
    private boolean equipmentOn = false;
    private boolean safetySystemOn = false;

    public void manageEquipment(boolean on) {
        equipmentOn = on;
        System.out.println("Lab equipment " + (on ? "ON" : "OFF"));
    }

    public void manageSafetySystem(boolean on) {
        safetySystemOn = on;
        System.out.println("Lab safety system " + (on ? "ON" : "OFF"));
    }

    public void status() {
        System.out.println("Lab Status: Equipment=" + equipmentOn + ", SafetySystem=" + safetySystemOn);
    }
}

class SmartLibrary implements SmartDevice {
    private int occupancy = 0;
    private int booksAvailable = 100;

    public void trackOccupancy(int people) {
        occupancy = people;
        System.out.println("Library occupancy set to " + occupancy);
    }

    public void updateBookAvailability(int books) {
        booksAvailable = books;
        System.out.println("Library books available: " + booksAvailable);
    }

    public void status() {
        System.out.println("Library Status: Occupancy=" + occupancy + ", BooksAvailable=" + booksAvailable);
    }
}

public class SmartCampusIOTSystem {
    public static void main(String[] args) {
        SmartDevice[] devices = new SmartDevice[] {
            new SmartClassroom(),
            new SmartLab(),
            new SmartLibrary(),
            new SmartClassroom(),
            new SmartLab()
        };

        for (SmartDevice device : devices) {
            if (device instanceof SmartClassroom) {
                SmartClassroom classroom = (SmartClassroom) device;
                classroom.controlLights(true);
                classroom.controlAC(true);
                classroom.controlProjector(false);
                classroom.status();
            } else if (device instanceof SmartLab) {
                SmartLab lab = (SmartLab) device;
                lab.manageEquipment(true);
                lab.manageSafetySystem(true);
                lab.status();
            } else if (device instanceof SmartLibrary) {
                SmartLibrary library = (SmartLibrary) device;
                library.trackOccupancy(25);
                library.updateBookAvailability(80);
                library.status();
            } else {
                System.out.println("Unknown device type.");
            }
            System.out.println("---");
        }
    }
}