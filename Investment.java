import java.util.Scanner;
	
	public class Investment{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter investment amount");
	double investmentAmount = input.nextDouble();
	
	System.out.print("Enter annual rate in percentage");
	double annualRate = input.nextDouble();
	
	System.out.print("Enter monthly interest rate");
	double monthlyInterestRate = input.nextDouble();
	
	System.out.print("Enter number of years");
	double numberOfYears = input.nextDouble();
	
	
	double futureInvestmentValue = 
	Math.pow (investmentAmount * (1 + monthlyInterestRate),numberOfYears*12);
	
	System.out.print("Accumulated value is" + futureInvestmentValue);
	
	}

}

