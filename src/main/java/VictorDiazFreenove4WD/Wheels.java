package VictorDiazFreenove4WD;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Wheels extends Component implements SelfCheckCapable {
   
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



	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Wheels";
	}



	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.2);
	}
}

