package exceptionHandling;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("program execution start");
		int fNum=9;
		int sNum=0;
		int result=0;
		
		/*result=fNum/sNum;*/
		
		//blocks try catch finally
		try {
			/*A try block is the block of code (contains a set of statements)
			 *  in which exceptions can occur;*/
			result=fNum/sNum;
		}
		
		catch(ArithmeticException ae){
			/*Each catch block is an exception handler 
			 * that handles the type of exception indicated by its argument.
			 */
			System.out.println(ae.toString());// ths s for throw  write a logic to enter this message into log file
			//to pnt exception detals
			throw ae; //to stop program executon
			//after throw f we wrte anythn t wll not execute.
		}
		
		finally{
			/*The finally block in java is used to put important
			 *  codes such as clean up code e.g. closing the file
			 *   or closing the connection. The finally block executes
			 *    whether exception rise or not and whether exception handled or not.*/
			System.out.println("finally block");
		}
		
		System.out.println("Output is:" +result);
		System.out.println("Program execution end");
		

	}

}
