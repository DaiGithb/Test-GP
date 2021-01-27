
@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serialNumber;
    private String machineCode;
    private String deviceName;

    public Device() {
    }

    public Device(String serialNumber, String machineCode, String deviceName) {
        this.serialNumber = serialNumber;
        this.machineCode = machineCode;
        this.deviceName = deviceName;
    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
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
