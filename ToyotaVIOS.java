
//ToyotaVIOS inherits Car properties and methods
public class ToyotaVIOS extends Car{
	
	//create a constructor for Toyota Vios where its properties are also set
	ToyotaVIOS(){
		tireType = "185/60R15";
		color = "black";
		speed = 170;
		price = 1000050;	
	}
	
	/*create a drive method for Toyota Vios which overrides the drive method
	  of the Car class
	 */
	@Override
	void drive(){
		System.out.println("Toyota Vios is accelerating...");	}
}
