import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class LoanTest   
{	
	@Test
	public void returnsNumberForNumberNotDivisibleByThreeAndFive(){
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Checking Number returned","1",fb.fizzBuzzityChecker(1), 0);
	}
	@Test
	public void returnFizzForNumberDivisibleByThree(int number){
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Checking Fizz returned","Fizz",fb.fizzBuzzityChecker(3), 0);
	}
	@Test
	public void returnBuzzForNumberDivisibleByFive(int number){
				FizzBuzz fb = new FizzBuzz();
		assertEquals("Checking Buzz returned","Buzz",fb.fizzBuzzityChecker(5), 0);
	}
	@Test
	public void returnsFizzBuzzForNumberDivisibleByThreeAndFive(int number){
				FizzBuzz fb = new FizzBuzz();
		assertEquals("Checking FizzBuzz returned","FizzBuzz",fb.fizzBuzzityChecker(15), 0);
	}

}