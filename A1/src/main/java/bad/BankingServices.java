package bad;

import java.text.DecimalFormat;

public class BankingServices {

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
		
		
public double homeLoanEmiCalculator(double principle_amount, double years) {
	
	if(principle_amount <=0 || years <= 0) {
		return 0;
	}
	
	double interest_pm;
	double months = years*12;
	double hl_emi;
		
	if(principle_amount <= 1400000) {		
		interest_pm = 0.0067;
		hl_emi = (principle_amount * interest_pm * Math.pow(interest_pm+1, months))/(Math.pow(interest_pm+1, months) - 1);
	} else {
		interest_pm = 0.0068;
		hl_emi = (principle_amount * interest_pm * Math.pow(interest_pm+1, months))/(Math.pow(interest_pm+1, months) - 1);
	}
		
	DecimalFormat df = new DecimalFormat("#.#");
	hl_emi = Double.valueOf(df.format(hl_emi));
	return hl_emi;
}
	
	
public double educationLoanEmiCalculator(double principle_amount, double years) {
	
	if(principle_amount <=0 || years <= 0) {
		return 0;
	}

	double interest_pm;
	double months = years*12;
	double el_emi;
		
	if(principle_amount <= 1000000) {		
		interest_pm = 0.0075;
		el_emi = (principle_amount * interest_pm * Math.pow(interest_pm+1, months))/(Math.pow(interest_pm+1, months) - 1);
	} else {
		interest_pm = 0.0077;
		el_emi = (principle_amount * interest_pm * Math.pow(interest_pm+1, months))/(Math.pow(interest_pm+1, months) - 1);
	}
		
	DecimalFormat df = new DecimalFormat("#.#");
	el_emi = Double.valueOf(df.format(el_emi));
	return el_emi;
}
	
	
public double carLoanEmiCalculator(double principle_amount, double years) {
	
	if(principle_amount <=0 || years <= 0) {
		return 0;
	}
	
	double interest_pm;
	double months = years*12;
	double cl_emi;
		
	if(principle_amount <= 800000) {		
		interest_pm = 0.0079;
		cl_emi = (principle_amount * interest_pm * Math.pow(interest_pm+1, months))/(Math.pow(interest_pm+1, months) - 1);
	} else {
		interest_pm = 0.0081;
		cl_emi = (principle_amount * interest_pm * Math.pow(interest_pm+1, months))/(Math.pow(interest_pm+1, months) - 1);
	}
		
	DecimalFormat df = new DecimalFormat("#.#");
	cl_emi = Double.valueOf(df.format(cl_emi));
	return cl_emi;
}
	
}
