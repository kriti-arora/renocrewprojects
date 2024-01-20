import java.util.*;

class Task6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String website = sc.next();

    if(website.endsWith(".com"))
      System.out.println("Commercial Website");
    else if(website.endsWith(".org"))
      System.out.println("Organisational Website");
    else if(website.endsWith(".in"))
      System.out.println("Indian Website");
  }
}
}