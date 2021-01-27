

public class DeviceException extends RuntimeException {
    private Set<DeviceError> errors;

    public DeviceException(Set<DeviceError> errors) {
        this.errors = errors;
    }

    public DeviceException(String message, Set<DeviceError> errors) {
        super(message);
        this.errors = errors;
    }

    public Set<DeviceError> getErrors() {
        return errors;
    }
}
