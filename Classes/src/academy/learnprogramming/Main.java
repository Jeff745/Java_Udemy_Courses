package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {
		Car porsche = new Car();//After create object based on template car, need to initialise it.
		Car holden = new Car();
		System.out.println("Model is " + porsche.getModel()); //null is internal default state
		porsche.setModel("carrera");
		porsche.setModel("911");//Car class inherited from base java class.
		System.out.println("Model is " + porsche.getModel());
		
		//emcapsulation: Do not allow field to be accessed directly.
	}
}
