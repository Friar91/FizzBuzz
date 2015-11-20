public class FizzBuzz{
	
	public FizzBuzz(){};
	public String fizzBuzzityChecker(int number){
		boolean fizz = isFizz(number);
		boolean buzz = isBuzz(number);
		if(fizz && buzz){
		 return "FizzBuzz";
		}else if(fizz){
			return "Fizz";
		}else if(buzz){
			return buzz;
		}else{
			return number.toString();
		}
			
	}
	private boolean isFizz(int number){
		if(number % 3 == 0){
			return true;
		}return false;
		
	}
	private boolean isBuzz(int number){
		if(number % 5 == 0){
			return true;
		}
		return false;
	}
	
	
	
}