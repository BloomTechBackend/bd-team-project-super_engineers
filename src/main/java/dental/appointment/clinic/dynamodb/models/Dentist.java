package dental.appointment.clinic.dynamodb.models;

import java.time.LocalDateTime;
import java.util.List;

public class Dentist {
    private String name;
    private String contactInformation;
    private LocalDateTime availability;
    private List<Appointment> appointmentList;

    public String getName() {
        return name;
    }

    public Dentist setName(String name) {
        this.name = name;
        return this;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public Dentist setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    public LocalDateTime getAvailability() {
        return availability;
    }

    public Dentist setAvailability(LocalDateTime availability) {
        this.availability = availability;
        return this;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public Dentist setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
        return this;
    }
}
