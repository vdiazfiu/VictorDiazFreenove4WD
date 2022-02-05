package VictorDiazFreenove4WD;

public class Component {
/**
 * Component is a super class for every component connected to the main computer
 * includes Model of the component and hardware ID
 * for unique identifier for component connected to the main computer.
 * Onoffstate store the on or off status of a component.
 * ConponentStatus store the connection status of the component ( is available or missing ).  
 */
	private String Model;
	private String HardwareID;
	private boolean OnOffState;
	private boolean ConponentStatus;
	
/**
 * Super Class constructor.
 * @param Model
 * @param HardwareID
 */
	protected Component(String Model, String HardwareID) {
		this.Model = Model;
		this.HardwareID = HardwareID;
	}
	
	/**
	 * Check component status.
	 */
	public void CheckCOmponentStatus() {
		System.out.println ("Component " + Model + "Hardware ID " + HardwareID + " status = ready!" );
	}
	
	/**
	 * Turn on or off the component.
	 */
	public void SetOnState() {
		System.out.println("Component " + Model + " Hardware ID " + HardwareID + " Is on");
  	
	}	
	
	public void SetOffState() {
		System.out.println ("Component " + Model + " Hardware ID " + HardwareID + " Is off");
	}
     
}
	
    
	

