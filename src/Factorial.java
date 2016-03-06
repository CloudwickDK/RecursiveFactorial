/**
 * Factorial implementation Factorials are products, indicated by an exclamation
 * mark. For instance, "four factorial" is written as "4!" and means 1󫎿�4 =
 * 24. In general, n! ("enn factorial") means the product of all the whole
 * numbers from 1 to n; that is, n! = 1󫎿�...譶.
 * 
 * @author desp
 *
 */
public class Factorial {

	public static void main(String[] args) {
		int input = 20;
		/**
		 * Calculate the factorial from 1 to 20.
		 */
		for (int num = 1; num <= input; num++) {
			long result = factorial(num);
			System.out.println("Factorial of " + num + " is: " + result + ".");
		}
	}

	/**
	 * The factorial function
	 * 
	 * @param num
	 *            The number for which we want to compute the factorial
	 * @return the factorial of the input
	 */
	static long factorial(int num) {
		long result = 1;
		if (num == 0) {
			return result;
		}
		result = factorial(num - 1) * num;// factorial(n)=factorial(n-1)*n
		return result;
	}
}
