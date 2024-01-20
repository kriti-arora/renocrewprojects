import java.util.*;

class Task2 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter marks");
    
    // taking marks as input
    int marks1= sc.nextInt();
    int marks2= sc.nextInt();
    int marks3= sc.nextInt();

    float percentage= (marks1+marks2+marks3)/3.0f;
    
    if(percentage>=40 && marks1>=33 && marks2>=33 && marks3>=33){
      System.out.println("Student is pass");}
       else
      System.out.println("Student is fail");
        
    }
  }