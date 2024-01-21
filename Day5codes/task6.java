import java .util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);    System.out.println("Enter the number whose factorial is to be found");
    int num = sc.nextInt();
    int i=num;
    int fact=1;
    while(num>=1){
      fact=fact*num;
      num--;
    }
    System.out.println("Factorial of "+ i+"is "+fact);
  }

}
