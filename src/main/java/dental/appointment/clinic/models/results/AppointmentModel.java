package dental.appointment.clinic.models.results;

import java.util.Date;
import java.util.Objects;

public class AppointmentModel {
    private String id;
    private String customerId;
    private String serviceId;
    private Date appointmentDate;

    public AppointmentModel() {

    }

    public AppointmentModel(Builder builder) {
        this.id = builder.id;
        this.customerId = builder.customerId;
        this.serviceId = builder.serviceId;
        this.appointmentDate = builder.appointmentDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppointmentModel that = (AppointmentModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(serviceId, that.serviceId) &&
                Objects.equals(appointmentDate, that.appointmentDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, serviceId, appointmentDate);
    }

    @Override
    public String toString() {
        return "AppointmentModel{" +
                "id='" + id + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", appointmentDate=" + appointmentDate +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String id;
        private String customerId;
        private String serviceId;
        private Date appointmentDate;

        public Builder withId(String idToUse) {
            this.id = idToUse;
            return this;
        }

        public Builder withCustomerId(String customerIdToUse) {
            this.customerId = customerIdToUse;
            return this;
        }

        public Builder withServiceId(String serviceIdToUse) {
            this.serviceId = serviceIdToUse;
            return this;
        }

        public Builder withAppointmentDate(Date appointmentDateToUse) {
            this.appointmentDate = appointmentDateToUse;
            return this;
        }

        public AppointmentModel build() {return new AppointmentModel(this);}
    }
}
