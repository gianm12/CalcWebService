//import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Calculator {
	private static double firstNumber;
	private static double secondNumber;
	private static double result;
	public static double main(String[] args) {
		System.out.println("in the main-calculator");
		//	String value;
		//	for (int i = 0; i < args.length; i++) {
		//		value= 	args[i];
		//		System.out.println("passing to main:" + value);
		//	}
		
		firstNumber = Double.parseDouble(args[0]);
		secondNumber = Double.parseDouble(args[2]);
		if(args[1].equals("+"))
		{
			add(args);
		}
		if(args[1].equals("-"))
		{
			subtract(args);
		}
		if(args[1].equals("*"))
		{
			multiply(args);
		}
		if(args[1].equals("/") || args[1].equals("\"")) 
		{
			divide(args);
		}
	
		return result;
	}
	public static void add(String[] eq)
	{
		//firstNumber = Integer.parseInt(eq[0]);
		//firstNumber =  eq[0];
		//secondNumber= Integer.parseInt(eq[2]);
//		firstNumber = Double.parseDouble(eq[0]);
//		secondNumber = Double.parseDouble(eq[2]);
	
		result = firstNumber +secondNumber;
		System.out.println("this is addition result: "+ result);
	}
	public static void subtract(String[] eq)
	{
		result = firstNumber - secondNumber;
		System.out.println("this is the sub result: " + result);
	}
	public static void multiply(String[] eq)
	{
		result = firstNumber*secondNumber;
		System.out.println("This is mult result: " + result);
	}
	public static void divide(String[] eq)
	{
		result = firstNumber/secondNumber;
		System.out.println("This is divide result: "+ result);
	}
}