package VictorDiazFreenove4WD;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class WLAN extends NetworkInterface implements SelfCheckCapable {


	/**
	 * Class Attributes
	 */
	private String SSIDconnection;
	
    
	/**
	 * Class constructor
	 * @param Model
	 * @param HardwareID
	 */
	protected WLAN(String Model, String HardwareID) {
		super(Model, HardwareID);
	}
	
	
/**
 * Connect to WiFi Method
 */
	
	public void ConnectToWiFI (String SSID) {
		SSID = SSIDconnection;
		System.out.println("Password sent to Access Point....");
		System.out.println("Connected to WiFi " + SSIDconnection);
	}


@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "WLAN";
}


@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.4);
}
	
}
