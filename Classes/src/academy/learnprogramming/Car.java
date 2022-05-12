package academy.learnprogramming;

public class Car {
	
	private int doors; //Private: Classes outside car class not allowed to access variables.
	private int wheels;
	private String model;
	private String engine;
	private String colour;

	public void setModel(String model) 
	{
		
		//can do all function validation checks in car class so it's inherited.
		String validModel= model.toLowerCase();
		if (validModel.equals("carrera") || validModel.equals("commodore")) {
			
			this.model = model; //validation check to ensure that model passed is posche or holden.
		}
		
		else {
			
			this.model = "unknown";
		}
//		this.model = model; 
		//updating field content model with parameter 'String model' that's passed into function. 2 different data types, field and parameter which can only be resolved using 'this' keyword.
		//Update field content model using methods instead of accessing it directly.
	}
	
	public String getModel()
	{
		return this.model;
	}
}
