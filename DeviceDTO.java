

public class DeviceDTO {

    //@Pattern(regexp = "[0-9]+[-][0-9]+", message = "Invalid Serial Number")
    private String serialNumber;
    //@Size(min=1, message = "Machine Code can't be empty")
    private String machineCode;
    private String deviceName;



    public DeviceDTO(String serialNumber, String machineCode, String deviceName) {
        this.serialNumber = serialNumber;
        this.machineCode = machineCode;
        this.deviceName = deviceName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
