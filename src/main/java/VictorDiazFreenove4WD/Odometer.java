package VictorDiazFreenove4WD;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Odometer extends Component implements SelfCheckCapable {

/**
 * Class Constructor	
 * @param Model
 * @param HardwareID
 */
protected Odometer(String Model, String HardwareID) {
		super(Model, HardwareID);

	}
/**
 * Current Speed of the Motor read by the sensor
 */
public void ReadSpeed(int speed) {
	System.out.println("Odometer =  " + (speed * 10) + "M/s");
}
@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Odomenter";
}
@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.41);
}
}
