package good;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Banking_educationLoanTest {

	@Test
	void educationLoanEmiCalculatorTest() {
		Banking_educationLoan el = new Banking_educationLoan();
		
		double actual1 = el.educationLoanEmiCalculator(750000, 2);
		double expected1 = 34263.6;
		assertEquals(expected1, actual1,  "EL EMI not working for less than 10 Lacs!");
		
		double actual2 = el.educationLoanEmiCalculator(1500000, 3);
		double expected2 = 47867.3;
		assertEquals(expected2, actual2, "EL EMI not working for more than 10 Lacs!");
		
		double actual3 = el.educationLoanEmiCalculator(-900, 10);
		double expected3 = 0.0;
		assertEquals(expected3, actual3, "EL EMI not working for - Negative Principle amount!");
		
		double actual4 = el.educationLoanEmiCalculator(900, -10);
		double expected4 = 0.0;
		assertEquals(expected4, actual4, "EL EMI not working for - Negative Year!");
		
		double actual5 = el.educationLoanEmiCalculator(-900, -10);
		double expected5 = 0.0;
		assertEquals(expected5, actual5, "EL EMI not working for - All Negative Values!");
		
	}

}
