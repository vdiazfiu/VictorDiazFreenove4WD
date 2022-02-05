package VictorDiazFreenove4WD;

public class RemoteSmartDevice {

	/**
	 * Remote device attributes.
	 */
	private String Model;
	private String Class;
	private String MACaddress;
	private String NetworkConnectionType;
	private String Encryption;
	private boolean ConnectionStatus;
	
	/**
	 * Class constructor
	 */
    public RemoteSmartDevice(String Model) {
	this.Model = Model;
    }
	
    /**
     * Computer Attribute
     */
    
    private Freenove4WDComputer Freenove4WD = new Freenove4WDComputer("4WD", "PI 3B+");
    
	/**
	 * Method to discover Bluetooth devices
	 */
	public void BTDiscovery() {
		System.out.println("BlueTooth set to discovery mode ....");
		
	}
	
	/**
	 * Method to connect to a Bluetooth device
	 */
	public void BTConnect() {
		Freenove4WD.ConnectToBT(this.Model);
	}

    /**
     * Method to connect the paired Computer to Wifi Network.
     */

     public void ConnectFreenove4WDComputerToWiFI(String SSID) {
    	 Freenove4WD.ConnectToWiFi(SSID);
     }
      
     /**
      * Method to run device check report
      */

     public void RunDeviceCheckReport() {
    	 Freenove4WD.GetComponentStatus();
    	 Freenove4WD.SendComponentStatusReport();
     }
     /**
      * Record video using remote device
      */
     public void RecordVideo () {
    	 Freenove4WD.SendVideo();
     }     
     /**
      * TakeSnapshot using remote device
      */
     public void TakeSnapShot () {
    	 Freenove4WD.SendScreenShot();
     }
     /**
      * Move Freenove forward using remote device
      * @param speed
      */
     public void MoveFreenoveForward (int speed) {
    	 Freenove4WD.MoveFoward(speed);
     }
     /**
      * Move Freenove Backward using remote device
      * @param speed
      */
     public void MoveFreenoveBackward (int speed) {
    	 Freenove4WD.MoveBackward(speed);
     }
     /**
      * Move Freenove Left using remote device
      * @param speed
      */
     public void MoveFreenoveLeft (int speed) {
    	 Freenove4WD.TrunLeft(speed);
     }
     /**
      * Move Freenove Right using remote device
      * @param speed
      */
     public void MoveFreenoveRight (int speed) {
    	 Freenove4WD.TurnRight(speed);
     }
     /**
      * MAke Freenove Sping using remote device
      * @param speed
      */
     public void MakeFreenoveSping (int speed) {
    	 Freenove4WD.Spin(speed);
     }
     

}
