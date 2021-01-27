

@RestController
@RequestMapping("/device")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Device> getAllDevices(){
        return deviceService.getAllDevices();
    }

    @GetMapping({"/{number}"})
    @ResponseStatus(HttpStatus.OK)
    public Device getDeviceByNumber(@PathVariable String number){
        Device device = deviceService.getDeviceByNumber(number);

        return device;
    }

    @GetMapping({"/{code}"})
    @ResponseStatus(HttpStatus.OK)
    public Device getDeviceByCode(@PathVariable String code) {
        Device device = deviceService.getDeviceByCode(code);
        return device;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Device createDevice(@RequestBody DeviceDTO deviceDTO) throws DeviceException{
        //validate deviceDTO,
        //can be validated at DeviceDTO class using javax.validation.constraints
        String serialNumber = deviceDTO.getSerialNumber();
        String machineCode = deviceDTO.getMachineCode();
        Set<DeviceError> errSet = new HashSet<>();
        DeviceError deviceError = null;

        /**/
        if serialNumber not match pattern [0-9]+[-][0-9]
            deviceError = new DeviceError("Invalid Serial Number", "ER003", "serial.number.invalid");
            errSet.add(deviceError);
        if  ( machineCode.equals("")) {
            deviceError = new DeviceError("Machine Code is blank!!", "ER001", "machine.code.invalid");
            errSet.add(deviceError);
        }
        if ( serialNumber not in database) {
            deviceError = new DeviceError("Serial Number Not found", "ER002", "machine.code.not.found");
            errSet.add(deviceError);
        }
        if ( machineCode not in database) {
            deviceError = new DeviceError("Machine Code Not found", "ER004", "serial.number.not.found");
            errSet.add(deviceError);
        }
        
        if ( errSet.size()>0){
            throw new DeviceException(errSet);
        }else {
            return deviceService.createDevice(deviceDTO);
        }
    }

    @PutMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Device createDevice(@PathVariable Long id, @RequestBody DeviceDTO deviceDTO){
        return deviceService.updateDevice(id, deviceDTO);
    }

}
