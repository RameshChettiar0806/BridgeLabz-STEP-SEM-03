import java.util.*;

class Appointment {
    String patientName;
    String doctorName;
    String date;

    Appointment(String patientName, String doctorName, String date) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    void display() {
        System.out.println("Appointment: " + patientName + " with Dr. " + doctorName + " on " + date);
    }
}

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    void bookAppointment(List<Appointment> appointments, String doctorName, String date) {
        Appointment a = new Appointment(this.name, doctorName, date);
        appointments.add(a);
        System.out.println(name + " booked an appointment with Dr. " + doctorName + " on " + date);
    }

    void viewBill(String billDetails) {
        System.out.println(name + " views bill: " + billDetails);
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void updateRecords(String patientName, String record) {
        System.out.println("Dr. " + name + " updated " + patientName + "'s record: " + record);
    }
}

class Admin {
    String name;

    Admin(String name) {
        this.name = name;
    }

    void generateBill(Patient patient, double amount) {
        String bill = "Bill for " + patient.name + ": INR. " + amount;
        System.out.println(name + " generated " + bill);
        patient.viewBill(bill);
    }

    void cancelAppointment(List<Appointment> appointments, Appointment a) {
        if (appointments.remove(a)) {
            System.out.println(name + " canceled appointment of " + a.patientName);
        }
    }
}

public class HospitalManagementUseCase {
    public static void main(String[] args) {
        List<Appointment> appointments = new ArrayList<>();

        // Create actors
        Admin admin = new Admin("Admin John");
        Doctor doctor = new Doctor("Smith");
        Patient patient = new Patient("Alice");

        // Patient books an appointment (included in Manage Appointments)
        patient.bookAppointment(appointments, doctor.name, "2025-10-25");

        // Doctor updates patient's record
        doctor.updateRecords(patient.name, "Blood test results updated.");

        // Admin generates bill (extended by View Bill)
        admin.generateBill(patient, 2500.00);

        // Admin cancels appointment (extend example)
        if (!appointments.isEmpty()) {
            admin.cancelAppointment(appointments, appointments.get(0));
        }
    }
}
