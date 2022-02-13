package VictorDiazFreenove4WD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;


public class Freenove4WDComputer implements GenericComponent {
	
	/**
	 * Freenove4WD Main Computer attributes. 
	 * Model contains the Main model of the Freenove.
	 * SingleBoardPCModel contains PC model (PI 3 , PI 3B, PI 4).
	 * Color store case color.
	 * ComponentStatusReport store the status report from the rest components.
	 * Store if the PC is on or off state. 
	 */
	
	private String Model;
	private String SingleBoardPCModel;
	private String Color;
	private boolean ComponentStatusReport;
	private boolean OnOffState;
	
	/**
	 * Attributes from the components classes.
	 */
	private Camera FV4WDCamera;
	private Wheels FV4WDWheels;
	private Motor FV4WDMotor;
	private WLAN FV4WDWiFi;
	private BlueTooth FV4WDBT;
	//private RemoteSmartDevice FV4WDRemoteDevice;

	/**
	 * Class constructor. 
	 */
	public Freenove4WDComputer(String Model,String SBPC) {
	this.Model = Model;
	this.SingleBoardPCModel = SBPC;
	Camera FV4WDCamera = new Camera ("Camera1", "C1",1920,1080);
	Wheels FV4WDWheels = new Wheels ("Wheels1", "Whe1");
	Motor FV4WDMotor = new Motor("Motor1", "M1");
	WLAN FV4WDWiFi = new WLAN("Wlan1", "W1");
	BlueTooth FV4WDBT = new BlueTooth("BlueTooth", "B1");
	//RemoteSmartDevice FV4WDRemoteDevice = new RemoteSmartDevice("Iphone");	
	}

	/**
	 * Method to turn PC on or off
	 */
	public void TurnOnPC() {
		System.out.println ("Computer is on");	
	};
    
	public void TurnOffPC() {
		System.out.println ("Computer is off");	
	};
	
	
	/**
	 * Method to Get status ( ready or missing from computer's components) 
	 */
	public void GetComponentStatus() {
		System.out.println ("------------------------");
		System.out.println ("Components Status Report");
		System.out.println ("------------------------");
		FV4WDCamera.CheckCOmponentStatus();
		System.out.println ("------------------------");
		FV4WDWheels.CheckCOmponentStatus();
		System.out.println ("------------------------");
		FV4WDMotor.CheckCOmponentStatus();
		System.out.println ("------------------------");
		FV4WDWiFi.CheckCOmponentStatus();
		System.out.println ("------------------------");
		FV4WDBT.CheckCOmponentStatus();
		System.out.println ("------------------------");
		System.out.println (" Freenove4WD Model " + Model + " Using Computer " + SingleBoardPCModel + " is Ready!" );
		System.out.println ("------------------------");
	}

	/**
	 * Send component status report to manufacturer
	 */
	public void SendComponentStatusReport() {
		System.out.println ("Components Status Report sent to manufacturer");
	}

	/**
	 * Send Video to remote Device
	 */
	public void SendVideo () {
		FV4WDCamera.StartRecording();
		System.out.println ("Video sent to Remote Device");
	}

	/**
	 * Method to Connect to WiFi Network
	 */
	public void ConnectToWiFi(String SSID) {
		FV4WDWiFi.ConnectToWiFI(SSID);
		
	} 

	/**
	 * Method to Connect to Remote Device using Bluetooth
	 */
	public void ConnectToBT(String Device) {
		FV4WDBT.PairToDevice(Device);
	}

	/**
	 * Move Freenove 4WD Forward
	 */
	public void MoveFoward(int speed) {
		FV4WDCamera.ObjectDetection();
		FV4WDWheels.SetRotationCenter();
		FV4WDMotor.SetSpeedLevel(speed);
		FV4WDMotor.SetDirectionForward();
		
	}

	/**
	 * Move Freenove 4WD Backward
	 * @param speed
	 */
	public void MoveBackward(int speed) {
		FV4WDCamera.ObjectDetection();
		FV4WDWheels.SetRotationCenter();
		FV4WDMotor.SetSpeedLevel(speed);
		FV4WDMotor.SetDirectionReverse();;
	}

	/**
	 * Make Freenove 4WD Spin
	 * @param speed
	 */
	public void Spin(int speed) {
		FV4WDCamera.ObjectDetection();
		FV4WDWheels.SetRotationRight();
		FV4WDMotor.SetSpeedLevel(speed);
		FV4WDMotor.SetDirectionForward();
	}

	/**
	 * Move Freenove 4WD Turn Left
	 * @param speed
	 */
	public void TrunLeft(int speed) {
		FV4WDCamera.ObjectDetection();
		FV4WDWheels.SetRotationLeft();;
		FV4WDMotor.SetSpeedLevel(speed);
		FV4WDMotor.SetDirectionForward();	
	}

	/**
	 * Move Freenove 4WD Turn Right 
	 * @param speed
	 */
	public void TurnRight(int speed) {
		FV4WDCamera.ObjectDetection();
		FV4WDWheels.SetRotationLeft();
		FV4WDMotor.SetSpeedLevel(speed);
		FV4WDMotor.SetDirectionForward();
	}

	/**
	 * Stop if obstacle is detected
	 */
	public void IfObstaclesStop () {
		System.out.println ("Object detected, Freenove 4WD stoped");
	}
    /**
     * Send screenshot to remote device
     */
	public void SendScreenShot() {
		FV4WDCamera.TakePicture();
		System.out.println ("Picture sent to Remote Device");
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "FreenoveComputer";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, FV4WDCamera, FV4WDWheels); // add all your sub components
		return internalComponents;
	}


}
