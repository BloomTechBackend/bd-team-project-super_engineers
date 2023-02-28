package dental.appointment.clinic.dependency;

import dagger.Component;

import javax.inject.Singleton;

@Component(modules = {DaoModule.class})
@Singleton
public interface ServiceComponent {


}
