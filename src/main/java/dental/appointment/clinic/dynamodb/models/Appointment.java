package dental.appointment.clinic.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

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
    private List<Appointment> appointmentList;

    public Appointment() {
    }

    public Appointment(String appointmentId, LocalDateTime startTime, LocalDateTime endTime, String patientName,
                       String patientId, String contactInfo, String address, String dentistName, String description, String service,
                       List<Appointment> appointmentList) {
        this.appointmentId = appointmentId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.patientName = patientName;
        this.patientId = patientId;
        this.contactInfo = contactInfo;
        this.address = address;
        this.dentistName = dentistName;
        this.description = description;
        this.service = service;
        this.appointmentList = appointmentList;
    }

    @DynamoDBHashKey(attributeName = "appointmentId")
    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
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

    @DynamoDBAttribute(attributeName = "patientId")
    public String getPatientId() {
        return patientId;
    }

    public Appointment setPatientId(String patientId) {
        this.patientId = patientId;
        return this;
    }

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

    @DynamoDBAttribute(attributeName = "appointmentList")
    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public Appointment setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
        return this;
    }
}
