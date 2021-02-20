package good;

import java.text.DecimalFormat;

public class Banking_educationLoan {

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
	
}
