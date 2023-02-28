package dental.appointment.clinic.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.time.LocalDateTime;
import java.util.UUID;

@DynamoDBTable(tableName = "appointments")
public class Appointment {

    UUID appointmentUUID = UUID.randomUUID();
    LocalDateTime startTime;
    LocalDateTime endTime;
    String patientName;
    UUID patientUUID = UUID.randomUUID();
    String dentistName;
    String description;
    String service;

    public UUID getAppointmentUUID() {
        return appointmentUUID;
    }

    public Appointment setAppointmentUUID(UUID appointmentUUID) {
        this.appointmentUUID = appointmentUUID;
        return this;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Appointment setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Appointment setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getPatientName() {
        return patientName;
    }

    public Appointment setPatientName(String patientName) {
        this.patientName = patientName;
        return this;
    }

    public UUID getPatientUUID() {
        return patientUUID;
    }

    public Appointment setPatientUUID(UUID patientUUID) {
        this.patientUUID = patientUUID;
        return this;
    }

    public String getDentistName() {
        return dentistName;
    }

    public Appointment setDentistName(String dentistName) {
        this.dentistName = dentistName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Appointment setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getService() {
        return service;
    }

    public Appointment setService(String service) {
        this.service = service;
        return this;
    }

    // put variables that an appointment may have/needs.
    // Generate UUID = Hashkey String
    // Start time = LocalDateTime
    // End time = LocalDateTime
    // Name of patient = String
    // Dentist = String
    // Description = String
    // Service = String
    // generate getters and setters put attributes on getters
    // PatientUUID = String

}
