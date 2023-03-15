impot java.util.Scanner;
	
	pubic class Integer{
	//main method to run my code
	public Static void main(String[] args){
	
	//to receive input
	Scanner input = new Scanner(System.in);
	
	//output integer/prompt
	System.out.print("Enter a number between 0 and 1000: ");
	
	int userInput = input.nextInt;
	
	int a = userInput % 10;
	
	int b = userInput % 100;
	int b2 = b / 10;
	
	int c = userIntput % 1;
	int c2 = c / 100;
	
	int d = a + b2 + c2;
	
	//print out the result
	Sysrem.out.print("The sum Of varable is +" d);
	
	
	
	}
	
}
