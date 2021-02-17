package good;

import java.text.DecimalFormat;

public class Banking_homeLoan {

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
	
}
