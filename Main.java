
public class Main {

	public static void main(String[] args) {
		
		//Create an instance of the ToyotaVIOS class and print out its properties and method
		ToyotaVIOS vios = new ToyotaVIOS();
		vios.drive();
		vios.stop();
		System.out.println("Color: "+vios.color);
		System.out.println("Speed: "+vios.speed+" kmph");
		System.out.println("Price: "+vios.price+" PHP");
		System.out.println("Tire type: "+vios.tireType);
		
		System.out.print("\n \n");
		
		//Create an instance of the U2Spy class and print out its properties and method
		U2Spy u2Spy = new U2Spy();
		u2Spy.fly();
		u2Spy.stop();
		System.out.println("Color: "+u2Spy.color);
		System.out.println("Speed: "+u2Spy.speed+" kmph");
		System.out.println("Price: "+u2Spy.price+" USD");
		System.out.println("Wingspan: "+u2Spy.wingSpan);
		
		System.out.print("\n \n");
		
		//Create an instance of the FandangoYacht class and print out its properties and method
		FandangoYacht fandangoYacht = new FandangoYacht();
		fandangoYacht.floats();
		fandangoYacht.stop();
		System.out.println("Color: "+fandangoYacht.color);
		System.out.println("Speed: "+fandangoYacht.speed+" kn");
		System.out.println("Price: "+fandangoYacht.price+" USD");
		System.out.println("Main sail color: "+fandangoYacht.mainSailColor);

		


	}

}
