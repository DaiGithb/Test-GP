

public interface DeviceService {
    List<Device> getAllDevices();

    Device getDeviceByNumber(String number);

    Device getDeviceByCode(String code);

    Device createDevice(DeviceDTO deviceDTO);

    Device updateDevice(Long id, DeviceDTO deviceDTO);
}
