import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter 0 for rock");
            System.out.println("Enter 1 for paper");
            System.out.println("Enter 2 for scissor");
    
            Scanner sc = new Scanner(System .in);
            System.out.print("Enter your choice: ");
            int user = sc.nextInt();
      
            // TO GENERATE RANDOM NUMBER
            Random random = new Random();
            int computer = random.nextInt(3);
    
            System.out.println("Computer's choice was: " + computer);

            if(user == computer){
                System.out.println("DRAW");
            }
            else if(user == 2 && computer == 1 || user == 1 && computer == 0 || user == 0 && computer == 2 ){
                System.out.println("You won !!!");
            }
            else
                System.out.println("Computer won !!!");
            
        
    }
  }
