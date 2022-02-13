package VictorDiazFreenove4WD;

import edu.fiu.jit.SelfCheckCapable;

public class Freenove4WDControlBoard implements SelfCheckCapable{

private Freenove4WDComputer myComputer ; 
	
public Freenove4WDControlBoard () {
	myComputer = new Freenove4WDComputer ("4WD", "Rasberry PI 4B");
}	
	
	
	
	
public void ComputerHardwareError () {
	
	System.out.println ("Error Connecting to Computer");
}

public void turnOnComputer () {
	
	myComputer.TurnOnPC();
	
}

public void turnOffComputer() {
	
	myComputer.TurnOffPC();
	
}




@Override
public String getComponentName() {
	// TODO Auto-generated method stub
	return "Freenove Control Board";
}




@Override
public boolean selfCheck() {
	// TODO Auto-generated method stub
	return true;
}


}
