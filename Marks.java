import java.util.Scanner;

public class Marks {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number of studentsL: ");
           int n = sc.nextInt();
           int numsb = 3;
           double[][] marks = new double[n][numsb];
           

           System.out.println("    ___MENU___   ");
           System.out.println(" 1. Add Student ID");
           System.out.println(" 2. Add Student mark");
           System.out.println(" 3. Average for a subject");
           System.out.println(" 4. Average for a student");
           System.out.println(" 5. Total mark of a student");
           System.out.println(" 6. Exit");
           System.out.println("Enter your choice: ");
           int menu = sc.nextInt();
  
           switch(menu) {
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              Default:
                System.out.println("Exiting......");
                break;
           }
}
           //for ( int i = 0; i < n; i++){
            //   System.out.println("Enter" + i+1 + "student name: ");
                                      
 }
          // String[] subjects = {"Mathematics", "Chemistry","Physics");
 
