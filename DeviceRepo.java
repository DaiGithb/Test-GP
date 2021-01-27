

//public interface DeviceRepo extends CrudRepository<Device, Long> {
public interface DeviceRepo extends JpaRepository<Device, Long> {

    Device findBySerialNumber(String number);

    Device findByMachineCode(String code);
}
