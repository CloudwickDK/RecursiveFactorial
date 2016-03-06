
public class Factorial {
	
	public static void main(String[] args){
		int input = 4;
		int result = factorial(input);
		System.out.println(result);
		
	
	}
	static int factorial(int num){ 
		int result = 1;	
		if (num == 0){
			return result;
		}
		result = factorial(num-1)* num;
		return result;
	}
}
