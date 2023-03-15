import java.util.Scanner;

  public class Year{
     public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
    
     System.out.println("Enter the number of minutes: ");
     int numberOfMinutes = input.nextInt();

     
     int year = numberOfMinutes/525600;
     
     System.out.println("The year is " + year);
   
     }
  
  }
  
