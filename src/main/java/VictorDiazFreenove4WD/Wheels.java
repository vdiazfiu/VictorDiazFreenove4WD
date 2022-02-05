package VictorDiazFreenove4WD;

public class Wheels extends Component {
   
	/**
	 *  Main Class Attributes
	 */
	
	private String RotationDirection = "Center";
	
	 /**
	  * Class constructor
	  * @param Model
	  * @param HardwareID
	  */
		protected Wheels(String Model, String HardwareID) {
			super(Model, HardwareID);
			
		}
	
	
	
	/**
	 * Set rotation direction for the wheels
	 */
	public void SetRotationLeft() {
		RotationDirection = "Left";
		System.out.println("Wheels Rotated to " + RotationDirection );
	}
	
	public void SetRotationRight() {
		RotationDirection = "Right";
		System.out.println("Wheels Rotated to " + RotationDirection );
	}

	public void SetRotationCenter() {
		RotationDirection = "Center";
		System.out.println("Wheels Rotated to " + RotationDirection );
	}
}

