import java.util.Scanner;

public class Exercise
{
	public static void main(String[] args) {
	        System.out.println("Enter marks obtained in five subjects");
        Scanner sc= new Scanner(System.in);
        
    float marks1= sc.nextFloat();// marks in subject 1
    float marks2= sc.nextFloat();// marks in subject 2
    float marks3= sc.nextFloat();// marks in subject 3
    float marks4= sc.nextFloat();// marks in subject 4
    float marks5= sc.nextFloat();// marks in subject 5
    
    //percentage will be (sum of marks/total marks)*100
    
    float percentage=(marks1+marks2+marks3+marks4+marks5)/5;
    System.out.println("Percentage of numbers is: "+ percentage+"%");
	}
}
