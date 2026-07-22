import java.util.Scanner;

public class Welcome {
         public static void main (String[] args) {
               Scanner sc = new Scanner (System.in);
               System.out.println("Enter your First Name: ");
               String name1 = sc.nextLine();
               System.out.println("Enter your Last Name: ");
               String name2 = sc.nextLine();
               System.out.println("Welcome to the Second Year" + " " + name1 + " " + name2);
        }
}
