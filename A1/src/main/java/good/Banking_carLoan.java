package good;

import java.text.DecimalFormat;

public class Banking_carLoan {

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
