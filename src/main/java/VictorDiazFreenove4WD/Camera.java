package VictorDiazFreenove4WD;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

public class Camera extends Component implements SelfCheckCapable{

	/**
	 * Camera class attributes, pixel resolution.
	 */
	private int resolutionX;
	private int resolutionY;
	
	/**
	 * InfraRed sensor attribute from IR class.
	 */
	private IR CameraIR = new IR("IR01","C2");
	
	/**
	 * Class constructor.
	 * @param Model
	 * @param HardwareID
	 * @param resolutionX
	 * @param resolutionY
	 */
	public Camera (String Model, String HardwareID, int resolutionX , int resolutionY) {
		super(Model, HardwareID);
		this.resolutionX = resolutionX;
		this.resolutionY = resolutionY;
		
	}
	
	/**
	 * Object Detection Method
	 */
	
	public void ObjectDetection() {
		CameraIR.DetectObject();
	}
	
	/**
	 * Methods for video recording and photo of the camera object.
	 */
	public void StartRecording() {
		System.out.println ("Recording...");
	}
	
	public void StopRecording() {
		System.out.println ("Recording stoped.");
	}
	
	public void TakePicture() {
		System.out.println ("Click!"+ " Resolution of the picture = " + resolutionX + " " + resolutionY);
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Camera";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.23);
	}
}
