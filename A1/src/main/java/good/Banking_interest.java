package good;

import java.text.DecimalFormat;

public class Banking_interest {

	DecimalFormat df = new DecimalFormat("#.#");
	
	public double compoundInterestCalculator(double principle_amount, double interest, double years) {

		if(principle_amount <= 0 || interest <= 0 || years <= 0) {
			return 0;
		}
		
		double amount = principle_amount * Math.pow(1+(interest/100), years);

		double ci = amount - principle_amount;
 
		ci = Double.valueOf(df.format(ci));

		return ci;
	}
	
	
	public double fixedDepositInterestCalculator(double principle_amount, double years) {
		
		if(principle_amount <= 0 || years <= 0) {
			return 0;
		}
		
		double si;
		double ir;
		
		if(years <= 1.5) {
			ir = 5.5;
			si = principle_amount * years * ir / 100;
		} else if(years > 1.5 && years <= 3){
			ir = 6.0;
			si = principle_amount * years * ir / 100;
		} else {
			ir = 6.5;
			si = principle_amount * years * ir / 100;
		}
		
		si = Double.valueOf(df.format(si));
		
		return si;
		
	}
	
}
