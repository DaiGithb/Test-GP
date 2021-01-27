

@Service
public class DeviceServiceImpl implements DeviceService {

    DeviceRepo deviceRepo;

    public DeviceServiceImpl(DeviceRepo deviceRepo) {
        this.deviceRepo = deviceRepo;
    }

    @Override
    public List<Device> getAllDevices() {

        return deviceRepo.findAll();
    }

    @Override
    public Device getDeviceByNumber(String number) {   //may return a List
        return deviceRepo.findBySerialNumber(number);
    }

    @Override
    public Device getDeviceByCode(String code) {   //may return a List
        return deviceRepo.findByMachineCode(code);
    }

    @Override
    public Device createDevice(DeviceDTO deviceDTO){

        ModelMapper modelMapper = new ModelMapper();
        Device device = modelMapper.map(deviceDTO, Device.class);
        return deviceRepo.save(device);
    }

    @Override
    public Device updateDevice(Long id, DeviceDTO deviceDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Device device = modelMapper.map(deviceDTO, Device.class);
        device.setId(id);
        return deviceRepo.save(device);
    }
}
