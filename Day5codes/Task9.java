
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Which number's table's sum do you want?");
    int num= sc.nextInt();
        int box=0;
        for(int a=1;a<=10;a++){
            box=box+(num*a);
        }
        System.out.println(num+"'s table's sum is "+box);
  } }
}