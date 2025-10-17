/*
 * Concept: Upcasting
Build a hospital system managing different types of medical staff:
● Doctors can diagnose patients, prescribe medicine, and perform surgeries
● Nurses can administer medicine, monitor patients, and assist procedures
● Technicians can operate equipment, run tests, and maintain instruments
● Administrators can schedule appointments and manage records
Design a general "MedicalStaff" system for common operations like shift scheduling, ID
card access, and payroll processing.
Hint: Different specialties, common professional needs - think institutional level!
 */

abstract class MedicalStaff {
    protected String name;
    protected int staffId;

    MedicalStaff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    void shiftScheduling() {
        System.out.println(name + " (ID: " + staffId + ") shift scheduled.");
    }

    void idCardAccess() {
        System.out.println(name + " (ID: " + staffId + ") has ID card access.");
    }

    void payrollProcessing() {
        System.out.println(name + " (ID: " + staffId + ") payroll processed.");
    }

    abstract void performDuties();
}

class Doctor extends MedicalStaff {
    Doctor(String name, int staffId) {
        super(name, staffId);
    }

    void diagnosePatient() {
        System.out.println(name + " is diagnosing a patient.");
    }

    void prescribeMedicine() {
        System.out.println(name + " is prescribing medicine.");
    }

    void performSurgery() {
        System.out.println(name + " is performing surgery.");
    }

    @Override
    void performDuties() {
        diagnosePatient();
        prescribeMedicine();
        performSurgery();
    }
}

class Nurse extends MedicalStaff {
    Nurse(String name, int staffId) {
        super(name, staffId);
    }

    void administerMedicine() {
        System.out.println(name + " is administering medicine.");
    }

    void monitorPatient() {
        System.out.println(name + " is monitoring a patient.");
    }

    void assistProcedure() {
        System.out.println(name + " is assisting in a procedure.");
    }

    @Override
    void performDuties() {
        administerMedicine();
        monitorPatient();
        assistProcedure();
    }
}

class Technician extends MedicalStaff {
    Technician(String name, int staffId) {
        super(name, staffId);
    }

    void operateEquipment() {
        System.out.println(name + " is operating equipment.");
    }

    void runTests() {
        System.out.println(name + " is running tests.");
    }

    void maintainInstruments() {
        System.out.println(name + " is maintaining instruments.");
    }

    @Override
    void performDuties() {
        operateEquipment();
        runTests();
        maintainInstruments();
    }
}

class Administrator extends MedicalStaff {
    Administrator(String name, int staffId) {
        super(name, staffId);
    }

    void scheduleAppointments() {
        System.out.println(name + " is scheduling appointments.");
    }

    void manageRecords() {
        System.out.println(name + " is managing records.");
    }

    @Override
    void performDuties() {
        scheduleAppointments();
        manageRecords();
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        MedicalStaff[] staffList = new MedicalStaff[4];
        staffList[0] = new Doctor("Dr. Smith", 101);
        staffList[1] = new Nurse("Nurse Alice", 201);
        staffList[2] = new Technician("Tech Bob", 301);
        staffList[3] = new Administrator("Admin Carol", 401);

        for (MedicalStaff staff : staffList) {
            System.out.println("\n--- " + staff.getClass().getSimpleName() + " ---");
            staff.shiftScheduling();
            staff.idCardAccess();
            staff.payrollProcessing();
            staff.performDuties();
        }
    }
}
