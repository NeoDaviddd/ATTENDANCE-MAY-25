
//FandangoYacht inherits Boat properties and methods
public class FandangoYacht extends Boat{
	
	//create a constructor for FandangoYacht where its properties are also set
	FandangoYacht(){
		mainSailColor = "black";
		color = "white";
		speed = 18;
		price = 275000000;
	}
	
	/*create a float method for FandangoYacht which overrides the float method
	  of the Boat class
	 */
	@Override
	void floats() {
		System.out.println("FandangoYacht is floating...");
	}
	
}
