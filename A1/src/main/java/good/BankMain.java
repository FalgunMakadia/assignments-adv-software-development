package good;

public class BankMain {

	public static void main(String[] args) {
		
		Banking_interest i = new Banking_interest();
		Banking_homeLoan hl = new Banking_homeLoan();
		Banking_educationLoan el = new Banking_educationLoan();
		Banking_carLoan cl = new Banking_carLoan();
		
		double ciAmount = i.compoundInterestCalculator(500000, 7.8, 5);
		System.out.println("Earned Compound Interest Amount:"+ciAmount);
		
		double fd = i.fixedDepositInterestCalculator(800000, 4);
		System.out.println("Earned Fixed Deposit Interest:"+fd);
		
		double hl_emi = hl.homeLoanEmiCalculator(1400000, 15);
		System.out.println("Home Loan EMI Amount:"+hl_emi);
		
		double el_emi = el.educationLoanEmiCalculator(750000, 2);
		System.out.println("Education Loan EMI Amount:"+el_emi);
		
		double cl_emi = cl.carLoanEmiCalculator(500000, 3);
		System.out.println("Car Loan EMI Amount:"+cl_emi);

	}

}
