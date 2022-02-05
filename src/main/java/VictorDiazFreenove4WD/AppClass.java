package VictorDiazFreenove4WD;

import edu.fiu.jit.EmptyComponent;

public class AppClass {

	public static void main(String[] args) {
		
		/**
		 * Freenove4WD object for methods testing.
		 */
		
		Freenove4WDComputer FreenoveTest = new Freenove4WDComputer("4WD","PI 4B+");
		
		
		System.out.println("-----------------------Freenove Automatic movement------------------------"); 
		
		FreenoveTest.TurnOnPC();
		
		System.out.println("--------------------------------------------------------------------------");
		
		FreenoveTest.MoveFoward(3);
		
		FreenoveTest.TrunLeft(2);
		
		FreenoveTest.MoveBackward(3);
		
		FreenoveTest.TurnRight(3);
		
		FreenoveTest.Spin(4);
		
		System.out.println("--------------------------------------------------------------------------");
		
		/**
		 * Remote smart phone object for testing methods. 
		 */
		RemoteSmartDevice iphone = new RemoteSmartDevice("iphone 12");
		
		System.out.println("-------------------------Using Remote Smart Device------------------------");
		
		
		iphone.BTDiscovery();
		
		iphone.BTConnect();
		
		iphone.TakeSnapShot();
		
		iphone.RecordVideo();
		
		iphone.RunDeviceCheckReport();
		
		System.out.println("--------------------------------------------------------------------------");	
		
	}
	
	
}
