package dental.appointment.clinic.models.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import dental.appointment.clinic.util.PatientsUtil;

import java.time.LocalDateTime;
import java.util.Objects;

public class UpdateAppointmentRequest {
    private String id;
    private String patientId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime startTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime endTime;

    private String patientName;
    private String dentistName;
    private String description;
    private String service;
    private String contactInfo;

    private UpdateAppointmentRequest(Builder builder) {
        this.id = builder.id;
        this.patientId = builder.patientId;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.patientName = builder.patientName;
        this.dentistName = builder.dentistName;
        this.description = builder.description;
        this.service = builder.service;
        this.contactInfo = builder.contactInfo;
    }

    public String getId() {
        return id;
    }

    public String getPatientId() {
        return patientId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDentistName() {
        return dentistName;
    }

    public String getDescription() {
        return description;
    }

    public String getService() {
        return service;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public static class Builder {
        private String id;
        private String patientId;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private String patientName;
        private String dentistName;
        private String description;
        private String service;
        private String contactInfo;

        public Builder(String id, String patientId, LocalDateTime startTime, LocalDateTime endTime, String patientName,
                       String dentistName, String description, String service) {
            this.id = id;
            this.patientId = patientId;
            this.startTime = startTime;
            this.endTime = endTime;
            this.patientName = patientName;
            this.dentistName = dentistName;
            this.description = description;
            this.service = service;
        }

        public Builder contactInfo(String contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public UpdateAppointmentRequest build() {
            return new UpdateAppointmentRequest(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateAppointmentRequest that = (UpdateAppointmentRequest) o;
        return Objects.equals(id, that.id) && Objects.equals(patientId, that.patientId) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(patientName, that.patientName) && Objects.equals(dentistName, that.dentistName) && Objects.equals(description, that.description) && Objects.equals(service, that.service) && Objects.equals(contactInfo, that.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, startTime, endTime, patientName, dentistName, description, service, contactInfo);
    }

    @Override
    public String toString() {
        return "UpdateAppointmentRequest{" +
                "id='" + id + '\'' +
                ", patientId='" + patientId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", patientName='" + patientName + '\'' +
                ", dentistName='" + dentistName + '\'' +
                ", description='" + description + '\'' +
                ", service='" + service + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}

