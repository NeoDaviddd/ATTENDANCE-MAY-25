
//U2Spy inherits Plane properties and methods
public class U2Spy extends Plane {
		
	//create a constructor for U2Spy where its properties are also set
	U2Spy(){
		wingSpan = "40 m";
		color = "black";
		speed = 9;
		price = 20580000;
	}
	
	/*create a fly method for U2Spy which overrides the fly method
	  of the Plane class
	 */
	@Override
	void fly() {
		System.out.println("U2Spy is taking off...");

	}
}
