package VictorDiazFreenove4WD;

public class Odometer extends Component {

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
}
