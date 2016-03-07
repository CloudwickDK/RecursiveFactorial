
public class Factorial {
	
	public static void main(String[] args){
		int input = 50000;
		int result = factorial(input);
		System.out.println(result);
		
	
	}
	static int factorial(int num){ 
		int result = 1;	
		if (num == 0){
			return result;
		}
		try{
		result = factorial(num-1) + num;
		}catch(StackOverflowError e){
			System.out.println("ouch!");
		}
		return result;
	}
	// 
}
