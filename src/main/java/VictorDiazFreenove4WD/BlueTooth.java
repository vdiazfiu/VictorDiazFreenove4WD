package VictorDiazFreenove4WD;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class BlueTooth extends NetworkInterface implements SelfCheckCapable {


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

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "BlueTooth";
}

@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.2);
}

}
