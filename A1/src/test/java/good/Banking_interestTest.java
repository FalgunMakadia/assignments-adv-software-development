package good;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Banking_interestTest {

	@Test
	void compoundInterestCalculatorTest() {
		Banking_interest i = new Banking_interest();
		
		double expected1 = 340785.2;
		double actual1 = i.compoundInterestCalculator(700000, 12, 3.5);
		assertEquals(expected1, actual1, "Compound Interest not working for legit values!");
		
		double expected2 = 0.0;
		double actual2 = i.compoundInterestCalculator(-500, 12, 3.5);
		assertEquals(expected2, actual2, "Compound Interest not working for - Negative Principle amount!");
		
		double expected3 = 0.0;
		double actual3 = i.compoundInterestCalculator(500, -12, 3.5);
		assertEquals(expected3, actual3, "Compound Interest not working for - Negative Interest Rate!");
		
		double expected4 = 0.0;
		double actual4 = i.compoundInterestCalculator(500, 12, -3.5);
		assertEquals(expected4, actual4, "Compound Interest not working for - Negative Year!");
		
		double expected5 = 0.0;
		double actual5 = i.compoundInterestCalculator(-500, -12, 3.5);
		assertEquals(expected5, actual5, "Compound Interest not working for - Negative Principle amount and Interest Rate!");
		
		double expected6 = 0.0;
		double actual6 = i.compoundInterestCalculator(-500, 12, -3.5);
		assertEquals(expected6, actual6, "Compound Interest not working for - Negative Principle amount and Year!");
		
		double expected7 = 0.0;
		double actual7 = i.compoundInterestCalculator(500, -12, -3.5);
		assertEquals(expected7, actual7, "Compound Interest not working for - Negative Interest Rate and Year!");
		
		double expected8 = 0.0;
		double actual8 = i.compoundInterestCalculator(-500, -12, -3.5);
		assertEquals(expected8, actual8, "Compound Interest not working for - All Negative Values!");
	}
	
	@Test
	void fixedDepositInterestCalculatorTest() {
		Banking_interest i = new Banking_interest();
		
		double actual1 = i.fixedDepositInterestCalculator(200000, 1);
		double expected1 = 11000.0;
		assertEquals(expected1, actual1, "FD Interest not working for less than 1.5 years!");
		
		double actual2 = i.fixedDepositInterestCalculator(500000, 2.5);
		double expected2 = 75000.0;
		assertEquals(expected2, actual2, "FD Interest not working for 1.5 to 3 years!");
		
		double actual3 = i.fixedDepositInterestCalculator(450000, 6);
		double expected3 = 175500.0;
		assertEquals(expected3, actual3, "FD Interest not working for more than 3 years!");
		
		double actual4 = i.fixedDepositInterestCalculator(-10, 6);
		double expected4 = 0.0;
		assertEquals(expected4, actual4, "FD not working for - Negative Principle amount!");
		
		double actual5 = i.fixedDepositInterestCalculator(10, -6);
		double expected5 = 0.0;
		assertEquals(expected5, actual5, "FD not working for - Negative Years!");
		
		double actual6 = i.fixedDepositInterestCalculator(-10, -6);
		double expected6 = 0.0;
		assertEquals(expected6, actual6, "FD not working for - All Negative Values!");
	}

}
