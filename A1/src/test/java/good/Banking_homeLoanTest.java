package good;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Banking_homeLoanTest {

	@Test
	void homeLoanEmiCalculatorTest() {
		Banking_homeLoan hl = new Banking_homeLoan();
		
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

}
