package dental.appointment.clinic.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@DynamoDBTable(tableName = "appointments")
public class Appointment {

    @DynamoDBHashKey(attributeName = "appointmentUUID")
    private UUID appointmentUUID = UUID.randomUUID();

    @DynamoDBAttribute(attributeName = "startTime")
    private LocalDateTime startTime;

    @DynamoDBAttribute(attributeName = "endTime")
    private LocalDateTime endTime;

    @DynamoDBAttribute(attributeName = "patientName")
    private String patientName;

    @DynamoDBAttribute(attributeName = "patientUUID")
    private UUID patientUUID = UUID.randomUUID();

    @DynamoDBAttribute(attributeName = "dentistName")
    private String dentistName;

    @DynamoDBAttribute(attributeName = "description")
    private String description;

    @DynamoDBAttribute(attributeName = "service")
    private String service;

    @DynamoDBAttribute(attributeName = "appointmentList")
    private List<Appointment> appointmentList;

    @DynamoDBHashKey(attributeName = "appointmentUUID")
    public UUID getAppointmentUUID() {
        return appointmentUUID;
    }

    public Appointment setAppointmentUUID(UUID appointmentUUID) {
        this.appointmentUUID = appointmentUUID;
        return this;
    }

    @DynamoDBAttribute(attributeName = "startTime")
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Appointment setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    @DynamoDBAttribute(attributeName = "endTime")
    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Appointment setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    @DynamoDBAttribute(attributeName = "patientName")
    public String getPatientName() {
        return patientName;
    }

    public Appointment setPatientName(String patientName) {
        this.patientName = patientName;
        return this;
    }

    @DynamoDBAttribute(attributeName = "patientUUID")
    public UUID getPatientUUID() {
        return patientUUID;
    }

    public Appointment setPatientUUID(UUID patientUUID) {
        this.patientUUID = patientUUID;
        return this;
    }

    @DynamoDBAttribute(attributeName = "dentistName")
    public String getDentistName() {
        return dentistName;
    }

    public Appointment setDentistName(String dentistName) {
        this.dentistName = dentistName;
        return this;
    }

    @DynamoDBAttribute(attributeName = "description")
    public String getDescription() {
        return description;
    }

    public Appointment setDescription(String description) {
        this.description = description;
        return this;
    }

    @DynamoDBAttribute(attributeName = "service")
    public String getService() {
        return service;
    }

    public Appointment setService(String service) {
        this.service = service;
        return this;
    }

    @DynamoDBAttribute(attributeName = "appointmentList")
    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public Appointment setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
        return this;
    }
}
