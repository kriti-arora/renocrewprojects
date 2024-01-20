import java.util.*;

class Task4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Which number's table do you want?");
    var table=sc.nextInt();
    for (var a=10;a>0;a--){
        System.out.printf("%d x %d = %d\n",table,a,table*a);
    }
  }

   }
}