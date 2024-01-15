import java.util.Scanner;

public class Taskfourth
{
	public static void main(String[] args) {
	System.out.println("Enter distance in kilometre");
        Scanner sc= new Scanner(System.in);
        
        float distkm= sc.nextFloat();// input distance in kilometres
        
        float distmiles= distkm*0.62f;
        
         System.out.println("Distance in miles is: "+ distmiles+" miles");
	}
}