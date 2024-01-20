import java.util.*;

class Task3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Which number's table do you want?");
    int table=sc.nextInt();
    for(int a=1;a<=10;a++){
        System.out.println(table+"x"+a+"="+table * a);
  }
  }
   }
}