package good;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Banking_carLoanTest {

	@Test
	void carLoanEmiCalculatorTest() {
		Banking_carLoan cl = new Banking_carLoan();
		
		double actual1 = cl.carLoanEmiCalculator(500000, 3);
		double expected1 = 16011.8;
		assertEquals(expected1, actual1,  "Car Loan EMI not working for less than 8 Lacs!");
		
		double actual2 = cl.carLoanEmiCalculator(1150000, 5);
		double expected2 = 24276.0;
		assertEquals(expected2, actual2, "Car Loan EMI not working for more than 8 Lacs!");
		
		double actual3 = cl.carLoanEmiCalculator(-50000, 5);
		double expected3 = 0.0;
		assertEquals(expected3, actual3, "Car Loan EMI not working for - Negative Principle Amount!");
		
		double actual4 = cl.carLoanEmiCalculator(11500, -15);
		double expected4 = 0.0;
		assertEquals(expected4, actual4, "Car Loan EMI not working for - Negative Year!");
		
		double actual5 = cl.carLoanEmiCalculator(-1150, -7);
		double expected5 = 0.0;
		assertEquals(expected5, actual5, "Car Loan EMI not working for - All Negative Values!");
		
	}

}
