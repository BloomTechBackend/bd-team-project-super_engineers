package dental.appointment.clinic.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import dental.appointment.clinic.converters.LocalDateTimeConverter;

import java.time.LocalDateTime;
import java.util.List;

@DynamoDBTable(tableName = "appointments")
public class Appointment {
    private String appointmentId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String patientName;
    private String patientId;
    private String contactInfo;
    private String address;
    private String dentistName;
    private String description;
    private String service;

    @DynamoDBHashKey(attributeName = "appointmentId")
    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }
    @DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
    @DynamoDBAttribute(attributeName = "startTime")
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Appointment setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    @DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
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

    @DynamoDBAttribute(attributeName = "patientId")
    public String getPatientId() {
        return patientId;
    }

    public Appointment setPatientId(String patientId) {
        this.patientId = patientId;
        return this;
    }
    @DynamoDBAttribute(attributeName = "contactInfo")
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
