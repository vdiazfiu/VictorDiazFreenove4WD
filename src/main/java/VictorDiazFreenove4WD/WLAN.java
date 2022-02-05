package VictorDiazFreenove4WD;

public class WLAN extends NetworkInterface {


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
	
}
