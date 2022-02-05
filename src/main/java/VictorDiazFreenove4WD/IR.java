package VictorDiazFreenove4WD;

public class IR extends Component {
	
	/**
	 * Class constructor
	 * @param Model
	 * @param HardwareID
	 */
	public IR (String Model, String HardwareID) {
	super(Model, HardwareID);
	}
	

	
	/**
	 * Method to detect nearby objects
	 */
	public void DetectObject() {
		System.out.println("No Object Detected");
	}
	

	
}
