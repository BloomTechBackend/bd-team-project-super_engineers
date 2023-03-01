package dental.appointment.clinic.dynamodb.models;

import dental.appointment.clinic.dependency.Weekday;

import java.util.List;

public class Dentist {
    private String id;
    private String name;
    private String position;
    private List<Weekday> availability;
    private int contactNumber;

    public Dentist() {
    }

    public Dentist(String id, String name, String position, List<Weekday> availability, int contactNumber) {
        this.id = id;
        this.position = position;
        this.name = name;
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
