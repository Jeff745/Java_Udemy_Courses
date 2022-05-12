package academy.learningprogramming;

public class simpleCalculator 
{
	
	private double firstNumber;
	private double secondNumber;
	
	public double getFirstnumber()
	{
		return firstNumber;
		
	}
	
	public double getSecondnumber()
	{
		return secondNumber;
	}
	
	public void setFirstNumber(double firstNumber)
	{
		this.firstNumber=firstNumber;
	}
	
	public void setSecondNumber(double secondNumber)
	{
		this.secondNumber=secondNumber;
	}


	public double getAdditionResult() 
	{
		return secondNumber + firstNumber ;
	}
	

	public double getSubtractionResult() 
	{
		return firstNumber - secondNumber ;
	}
	

	public double getMultiplicationResult() 
	{
		return firstNumber * secondNumber ;
	}
	
	public double getDivisionResult() 
	{
		if (secondNumber == 0)
		{
			return 0;
		}
		
		else 
		{
			return firstNumber / secondNumber ;
		}
	}
	
	
}
