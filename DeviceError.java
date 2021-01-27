
public class DeviceError {

    private String errorCode;
    private String errorMsg;
    private String resourceKey;

    public DeviceError(String errorCode, String errorMsg, String resourceKey) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.resourceKey = resourceKey;
    }
}
