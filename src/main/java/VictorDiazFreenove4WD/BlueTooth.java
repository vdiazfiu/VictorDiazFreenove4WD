package VictorDiazFreenove4WD;

public class BlueTooth extends NetworkInterface {


/**
 * PairedDevices is an array to store devices that were connected before.
 */
private String PairedDevices;

/**
 * Class constructor.
 * @param Model
 * @param HardwareID
 */
public BlueTooth(String Model, String HardwareID) {
	super(Model, HardwareID);
}

/**
 * Method to pair to device
 */
public void PairToDevice (String Device) {
	System.out.println("Token sent to remote device " + Device);
	System.out.println("Connected to Device " + Device);
}

}
