package dental.appointment.clinic.dynamodb.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@DynamoDBTable(tableName = "patients")
public class Patient {

    @DynamoDBHashKey(attributeName = "id")
    private UUID id = UUID.randomUUID();

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "contactInformation")
    private String contactInformation;

    @DynamoDBAttribute(attributeName = "address")
    private String address;

    @DynamoDBAttribute(attributeName = "appointments")
    private List<Appointment> appointments;

    public Patient() {}

    public Patient(String name, String contactInformation, String address) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.address = address;
    }

    @DynamoDBHashKey(attributeName = "id")
    public UUID getId() {
        return id;
    }

    public Patient setId(UUID id) {
        this.id = id;
        return this;
    }

    @DynamoDBAttribute(attributeName = "name")
    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    @DynamoDBAttribute(attributeName = "contactInformation")
    public String getContactInformation() {
        return contactInformation;
    }

    public Patient setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
        return this;
    }

    @DynamoDBAttribute(attributeName = "address")
    public String getAddress() {
        return address;
    }

    public Patient setAddress(String address) {
        this.address = address;
        return this;
    }

    @DynamoDBAttribute(attributeName = "appointments")
    public List<Appointment> getAppointments() {
        return appointments;
    }

    public Patient setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
        return this;
    }
}
