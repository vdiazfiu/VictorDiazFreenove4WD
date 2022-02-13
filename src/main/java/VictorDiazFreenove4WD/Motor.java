package VictorDiazFreenove4WD;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Motor extends Component implements SelfCheckCapable{
/**
 * Motor Class Attributes
 */
	
	private String Direction;
	private int SpeedLevel = 0;
	
	/**
	 * Wheels Objects for the motor class
	 */
	private Wheels Wheels;

	/**
	 *  Odometer Class object
	 */
	private Odometer Motordometer = new Odometer("MK2", "Odo1");
	
/**
 * Class constructor
 * @param Model
 * @param HardwareID
 */
	public Motor(String Model, String HardwareID) {
		super(Model, HardwareID);
	}

/**
 * Move Motor's Rotation forward whit direction of the wheels.	
 */
	public void SetDirectionForward() {
		System.out.println("Freenove 4WD...Moving Foward at " + SpeedLevel + " Speed Level");
		Motordometer.ReadSpeed(SpeedLevel);
	}
/**
 * Move Motor's Rotation Backwards	
 */
    public void SetDirectionReverse() {
    	System.out.println("Freenove 4WD...Moving Reverseat at " + SpeedLevel + " Speed Level");
    	Motordometer.ReadSpeed(SpeedLevel);
	}
/**
 * Set Motor's Rotation speed level	
 * @param speed
 */
    public void SetSpeedLevel(int speed) {
    	this.SpeedLevel = speed;
    	System.out.println("speed level set to : " + speed);
	}

@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Motor";
}

@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return SelfCheckUtils.randomCheck(0.3);
}

    
    
}
