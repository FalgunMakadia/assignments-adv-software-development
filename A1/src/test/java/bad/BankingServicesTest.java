package bad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankingServicesTest {

	@Test
	void compoundInterestCalculatorTest() {
		BankingServices i = new BankingServices();
		
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
		BankingServices i = new BankingServices();
		
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
	
	
	
	@Test
	void educationLoanEmiCalculatorTest() {
		BankingServices el = new BankingServices();
		
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
	
	@Test
	void homeLoanEmiCalculatorTest() {
		BankingServices hl = new BankingServices();
		
		double actual1 = hl.homeLoanEmiCalculator(1200000, 8);
		double expected1 = 16988.4;
		assertEquals(expected1, actual1,  "HL EMI not working for less than 14 Lacs!");
		
		double actual2 = hl.homeLoanEmiCalculator(1600000, 10);
		double expected2 = 19547.9;
		assertEquals(expected2, actual2, "HL EMI not working for more than 14 Lacs!");
		
		double actual3 = hl.homeLoanEmiCalculator(-1900, 10);
		double expected3 = 0.0;
		assertEquals(expected3, actual3, "HL EMI not working for - Negative Principle amount!");
		
		double actual4 = hl.homeLoanEmiCalculator(500000, -7);
		double expected4 = 0.0;
		assertEquals(expected4, actual4, "HL EMI not working for - Negative Year!");
		
		double actual5 = hl.homeLoanEmiCalculator(-700, -1);
		double expected5 = 0.0;
		assertEquals(expected5, actual5, "HL EMI not working for - All Negative Values!");
		
	}
	
	@Test
	void carLoanEmiCalculatorTest() {
		BankingServices cl = new BankingServices();
		
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
