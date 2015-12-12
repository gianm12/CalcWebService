import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Calculator {
	private static double firstNumber;
	private static double secondNumber;
	private static double result;
	public static void main(String[] args) {
		System.out.println("in the main-calculator");
		//	String value;
		//	for (int i = 0; i < args.length; i++) {
		//		value= 	args[i];
		//		System.out.println("passing to main:" + value);
		//	}
		if(args[1].equals("+"))
		{
			add(args);
		}

	}


	public static void add(String[] eq)
	{

		firstNumber = Integer.parseInt(eq[0]);
		//firstNumber =  eq[0];
		secondNumber= Integer.parseInt(eq[2]);
		result = firstNumber +secondNumber;
		System.out.println("this is addition result: "+ result);
	}
}
