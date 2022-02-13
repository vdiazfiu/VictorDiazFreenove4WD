package VictorDiazFreenove4WD;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class IR extends Component implements SelfCheckCapable {
	
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



	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "IR";
	}



	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.13);
	}
	

	
}
