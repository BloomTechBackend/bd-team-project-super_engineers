package dental.appointment.clinic.dependency;

import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerServiceComponent implements ServiceComponent {
  private DaggerServiceComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static ServiceComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {}

    public ServiceComponent build() {
      return new DaggerServiceComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder daoModule(DaoModule daoModule) {
      Preconditions.checkNotNull(daoModule);
      return this;
    }
  }
}
