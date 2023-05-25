
//car inherits vehicle properties and methods
public class Car extends Vehicle {

	/*declare the variable tire type for car class
	  every car has a tire type
	 */
	String tireType;
	
	/*declare the drive method for car class
	  every car can drive
	 */
	void drive() {
		System.out.println("Car is accelerating...");
	}
}
