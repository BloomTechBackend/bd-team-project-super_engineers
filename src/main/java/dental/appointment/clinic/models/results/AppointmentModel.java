package dental.appointment.clinic.models.results;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class AppointmentModel {
    private UUID id;
    private UUID patientUUID;
    private String patientName;
    private String dentistName;
    private String description;
    private String service;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public AppointmentModel() {

    }

    public AppointmentModel(Builder builder) {
        this.id = builder.id;
        this.patientUUID = builder.patientUUID;
        this.patientName = builder.patientName;
        this.dentistName = builder.dentistName;
        this.description = builder.description;
        this.service = builder.service;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getPatientUUID() {
        return patientUUID;
    }

    public void setPatientUUID(UUID patientUUID) {
        this.patientUUID = patientUUID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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
        AppointmentModel that = (AppointmentModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(patientUUID, that.patientUUID) &&
                Objects.equals(patientName, that.patientName) &&
                Objects.equals(dentistName, that.dentistName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(service, that.service) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientUUID, patientName, dentistName, description, service, startTime, endTime);
    }

    @Override
    public String toString() {
        return "AppointmentModel{" +
                "id=" + id +
                ", patientUUID=" + patientUUID +
                ", patientName='" + patientName + '\'' +
                ", dentistName='" + dentistName + '\'' +
                ", description='" + description + '\'' +
                ", service='" + service + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private UUID id;
        private UUID patientUUID;
        private String patientName;
        private String dentistName;
        private String description;
        private String service;
        private LocalDateTime startTime;
        private LocalDateTime endTime;

        public Builder withId(UUID idToUse) {
            this.id = idToUse;
            return this;
        }
        public Builder withPatientUUID(UUID idPatientToUse) {
            this.patientUUID = idPatientToUse;
            return this;
        }

        public Builder withPatientName(String patientName) {
            this.patientName = patientName;
            return this;
        }

        public Builder WithDentistName(String dentistName) {
            this.dentistName = dentistName;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }
        public Builder withService(String service) {
            this.service = service;
            return this;
        }
        public Builder withStartTime(LocalDateTime startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder withEndTime(LocalDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

    }
    }
