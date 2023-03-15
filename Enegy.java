import java.util.Scanner;

    public class Energy{
        public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter water amount in kg: ");
            double amountOfWater = input.nextDouble();
            
            System.out.print("Enter initial temperature: ");
            double initialTemperature = input.nextDouble();
            
            Sytem.out.print("Enter final temperature: ");
            double finalTemperature = input.nextdouble();
            
            double energy =
             amountOfWater * (finalTemperature - initialTemperature) * 4184;
            
            system.out.println("The energy is: " + energy);
        
        }
  } 
