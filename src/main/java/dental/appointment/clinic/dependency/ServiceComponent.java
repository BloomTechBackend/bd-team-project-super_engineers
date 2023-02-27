package dental.appointment.clinic.dependency;

import dagger.Component;
import dental.appointment.clinic.Activity.CreateAppointmentActivity;
import dental.appointment.clinic.Activity.GetAppointmentActivity;
import dental.appointment.clinic.Activity.UpdateAppointmentActivity;

import javax.inject.Singleton;

@Component(modules = {DaoModule.class})
@Singleton
public interface ServiceComponent {

    CreateAppointmentActivity provideCreateAppointmentActivity();
    GetAppointmentActivity provideGetAppointmentActivity();
    UpdateAppointmentActivity provideUpdateAppointmentActivity();
}
