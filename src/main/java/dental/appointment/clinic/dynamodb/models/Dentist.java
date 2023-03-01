package dental.appointment.clinic.dynamodb.models;

import dental.appointment.clinic.dependency.Weekday;

import java.util.List;

public class Dentist {
    private String name;
    private String position;
    private String id;
    private List<Weekday> availability;
    private int contactNumber;

    public Dentist() {
    }

    public Dentist(String name, String position, String id, List<Weekday> availability, int contactNumber) {
        this.name = name;
        this.position = position;
        this.id = id;
        this.availability = availability;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Weekday> getAvailability() {
        return availability;
    }

    public void setAvailability(List<Weekday> availability) {
        this.availability = availability;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
}
