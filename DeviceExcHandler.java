

@ControllerAdvice
public class DeviceExcHandler {

    @ExceptionHandler({DeviceException.class})
    public Set<DeviceError> handleDeviceException(DeviceException exception){
        return exception.getErrors();
    }
}
