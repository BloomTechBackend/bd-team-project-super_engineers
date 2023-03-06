package dental.appointment.clinic.models;

import dental.appointment.clinic.dynamodb.models.Appointment;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class AppointmentModel {
    private String appointmentId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String patientName;
    private String patientId;
    private String dentistName;
    private String description;
    private String service;


    public AppointmentModel() {
    }

    private AppointmentModel(Builder builder) {
        this.appointmentId = builder.appointmentId;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
        this.patientName = builder.patientName;
        this.patientId = builder.patientId;
        this.dentistName = builder.dentistName;
        this.description = builder.description;
        this.service = builder.service;

    }

    public String getAppointmentId() {
        return appointmentId;
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

    public String getPatientId() {
        return patientId;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Builder)) return false;
        Builder builder = (Builder) o;
        return Objects.equals(appointmentId, builder.appointmentId)
                && Objects.equals(startTime, builder.startTime) &&
                Objects.equals(endTime, builder.endTime) &&
                Objects.equals(patientName, builder.patientName) &&
                Objects.equals(patientId, builder.patientId) &&
                Objects.equals(dentistName, builder.dentistName) &&
                Objects.equals(description, builder.description) &&
                Objects.equals(service, builder.service);

    }

    @Override
    public int hashCode() {
        return Objects.hash(appointmentId, startTime, endTime, patientName, patientId, dentistName, description, service);
    }


    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String appointmentId;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private String patientName;
        private String patientId;
        private String dentistName;
        private String description;
        private String service;

        private Builder() {
        }

        public Builder withAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
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

        public Builder withPatientName(String patientName) {
            this.patientName = patientName;
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

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withService(String service) {
            this.service = service;
            return this;
        }

        public AppointmentModel build() {
            return new AppointmentModel(this);
        }
    }
    }


