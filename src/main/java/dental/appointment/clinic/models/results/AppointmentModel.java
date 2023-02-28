package dental.appointment.clinic.models.results;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class AppointmentModel {
    private UUID appointmentUUID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String patientName;
    private UUID patientUUID;
    private String dentistName;
    private String description;
    private String service;

    public AppointmentModel() {

    }

    public AppointmentModel(Builder builder) {
        this.appointmentUUID = builder.appointmentUUID;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.patientName = builder.patientName;
        this.patientUUID = builder.patientUUID;
        this.dentistName = builder.dentistName;
        this.description = builder.description;
        this.service = builder.service;
    }

    public UUID getAppointmentUUID() {
        return appointmentUUID;
    }

    public void setAppointmentUUID(UUID appointmentUUID) {
        this.appointmentUUID = appointmentUUID;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public UUID getPatientUUID() {
        return patientUUID;
    }

    public void setPatientUUID(UUID patientUUID) {
        this.patientUUID = patientUUID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppointmentModel that = (AppointmentModel) o;
        return Objects.equals(appointmentUUID, that.appointmentUUID) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(patientName, that.patientName) &&
                Objects.equals(patientUUID, that.patientUUID) &&
                Objects.equals(dentistName, that.dentistName) &&
                Objects.equals(description, that.description) &&
                Objects.equals(service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentUUID, startTime, endTime, patientName, patientUUID, dentistName, description, service);
    }

    @Override
    public String toString() {
        return "AppointmentModel{" +
                "appointmentUUID=" + appointmentUUID +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", patientName='" + patientName + '\'' +
                ", patientUUID=" + patientUUID +
                ", dentistName='" + dentistName + '\'' +
                ", description='" + description + '\'' +
                ", service='" + service + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private UUID appointmentUUID;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private String patientName;
        private UUID patientUUID;

        private String dentistName;

        private String description;

        private String service;

        public Builder withAppointmentUUID(UUID appointmentUUIDToUse) {
            this.appointmentUUID = appointmentUUIDToUse;
            return this;
        }

        public Builder withStartTime(LocalDateTime startTimeToUse) {
            this.startTime = startTimeToUse;
            return this;
        }

        public Builder withEndTime(LocalDateTime endTimeToUse) {
            this.endTime = endTimeToUse;
            return this;
        }

        public Builder withPatientName(String patientNameToUse) {
            this.patientName = patientNameToUse;
            return this;
        }

        public Builder withPatientUUID(UUID patientUUIDToUse) {
            this.patientUUID = patientUUIDToUse;
            return this;
        }

        public Builder withDentistName(String dentistNameToUse) {
            this.dentistName = dentistNameToUse;
            return this;
        }

        public Builder withDescription(String descriptionToUse) {
            this.description = descriptionToUse;
            return this;
        }

        public Builder withService(String serviceToUse) {
            this.service = serviceToUse;
            return this;
        }
        public AppointmentModel build () {
            return new AppointmentModel(this);
        }

    }
}
