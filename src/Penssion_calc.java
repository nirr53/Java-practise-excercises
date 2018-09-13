
public class Penssion_calc {

	public static void main(String[] args) {
		
		int   initalSum    = 0;			// Initial saving
		int   monthDeposit = 3000;		// Monthly deposit
		int   numOfYears   = 30;		// Years of saving
//		float rateOfCalc   = 201.98f; 	// Living months after quit for pension
//		float sumTax   	   = 1.15f;		// Yearly tax on total sum
//		float deposTax 	   = 1.5f;		// Monthly tax on deposit
//		float invRate	   = 4;			// Average yearly interest (by percentage)
		
		
		float rateOfCalc   = 214f; 	   // Living months after quit for pension
		float sumTax   	   = 0.18f;		// Yearly tax on total sum
		float deposTax 	   = 1.0f;		// Monthly tax on deposit
		float invRate	   = 4;			// Average yearly interest (by percentage)
		
		
		calcPension(initalSum, monthDeposit, numOfYears, rateOfCalc, sumTax, deposTax, invRate);
		

	}

	private static void calcPension(int initalSum, int monthDeposit, int numOfYears, float rateOfCalc, float sumTax, float deposTax, float invrate) {

		
		float cleanAfterDeposTax =  (1 - (deposTax / 100));
		float cleanAfterSumTax 	 =  (1 - (sumTax   / 100));
		float cleanInvrate		 =  (1 + (invrate  / 100));
		System.out.println("cleanAfterDeposTax - " + cleanAfterDeposTax);
		System.out.println("cleanAfterSumTax - "   + cleanAfterSumTax);
		System.out.println("cleanInvrate - "       + cleanInvrate);

		// Loop for saving years
		for (int i = 0; i < numOfYears; ++i) {
			
			initalSum += ((12 * (monthDeposit * cleanAfterDeposTax)));
			initalSum *= cleanAfterSumTax;
			initalSum *= cleanInvrate;
		}

		System.out.println("Pension is - "   + initalSum);
		System.out.println("Pension is - "   + (initalSum / rateOfCalc));

		
	}

}
