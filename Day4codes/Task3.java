import java.util.*;

class Task3 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the salary amount ");
    
    float salary=sc.nextFloat();
    float tax = 0;

    if(salary<=2.5f){
      tax=tax+0;
    }
    
    else if(salary>2.5f && salary<=5f){
      tax= tax + 0.05f *(salary-2.5f);
    }

    else if(salary>5f && salary<=10.0f){
      tax= tax + 0.05f *(salary-2.5f);
      tax= tax + 0.20f *(salary-5f);
    }

    else if(salary>10.0f){
      tax= tax + 0.05f *(salary-2.5f);
      tax= tax + 0.20f *(salary-5f);
      tax= tax + 0.30f *(salary-10f);
    }

    System.out.println("Total tax payable is: "+ tax);
  }
 }
}