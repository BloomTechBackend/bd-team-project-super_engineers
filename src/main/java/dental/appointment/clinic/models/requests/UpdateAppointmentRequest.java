package dental.appointment.clinic.models.requests;

import java.time.LocalDateTime;
import java.util.Objects;

public class UpdateAppointmentRequest {
    private String id;
    private String name;
    private String dentistName;
    private String patientId;
    private String service;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public UpdateAppointmentRequest() {
    }

    public UpdateAppointmentRequest(String id, String name, String dentistName, String patientId, String service, String description, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.name = name;
        this.dentistName = dentistName;
        this.patientId = patientId;
        this.service = service;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public UpdateAppointmentRequest(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.dentistName = builder.dentistName;
        this.patientId = builder.patientId;
        this.service = builder.service;
        this.description = builder.description;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateAppointmentRequest that = (UpdateAppointmentRequest) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(dentistName, that.dentistName) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(service, that.service) &&
                Objects.equals(description, that.description) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dentistName, patientId, service, description, startTime, endTime);
    }

    @Override
    public String toString() {
        return "UpdateAppointmentRequest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dentistName='" + dentistName + '\'' +
                ", patientId='" + patientId + '\'' +
                ", service='" + service + '\'' +
                ", description='" + description + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String id;
        private String name;
        private String patientId;
        private String dentistName;
        private String service;
        private String description;
        private LocalDateTime startTime;
        private LocalDateTime endTime;

        private Builder() {

        }

        public Builder withId(String idToUse) {
            this.id = idToUse;
            return this;
        }

        public Builder withName(String nameToUse) {
            this.name = nameToUse;
            return this;
        }

        public Builder withPatientId(String patientId) {
            this.patientId = patientId;
            return this;
        }
        public Builder withDentistName(String dentistName) {
            this.dentistName = dentistName;
            return this;
        }
        public Builder withService(String service) {
            this.service = service;
            return this;
        }
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }
        public Builder withStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder withEndTime(LocalDateTime endTime) {
            this.startTime = endTime;
            return this;
        }
        public UpdateAppointmentRequest build() { return new UpdateAppointmentRequest(this); }
    }

}


