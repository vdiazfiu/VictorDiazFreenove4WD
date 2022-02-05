package VictorDiazFreenove4WD;

public class NetworkInterface extends Component {

/**
 * Class constructor	
 * @param Model
 * @param HardwareID
 */
	protected NetworkInterface(String Model, String HardwareID) {
		super(Model, HardwareID);
	
	}
/**
 * Network interfaces Class attributes 
 */
	private String MACaddress;
	private String ConnectionStatus = "Disconnected";
	
/**
 * Scan Devices 	
 */
	public void ScanDevices () {
		System.out.println("Scaning for Networks....");	
	}
    	
    }

