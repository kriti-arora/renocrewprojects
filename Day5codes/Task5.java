import java.util.*;

class Task5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Which number's factorial do you want?");
    int num= sc.nextInt();
    long factorial=1;
      for(int i=1;i<=num;i++){
          factorial*=i;
      }
    System.out.println("factorial of "+num+" is "+factorial);
  }}