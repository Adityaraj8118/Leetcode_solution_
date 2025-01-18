import java.util.Scanner;

public class MarksPercentage {
    public static void main(String []args){
       //scanner input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the subject1 marks: ");
        int sub1 = scanner.nextInt();

        System.out.print("Enter the subject2 marks: ");
        int sub2 = scanner.nextInt();

        System.out.print("Enter the subject3 marks: ");
        int sub3 = scanner.nextInt();

        System.out.print("Enter the subject4 marks: ");
        int sub4 = scanner.nextInt();

        System.out.print("Enter the subject5 marks: ");
        int sub5 = scanner.nextInt();

        int total_marks = sub1 + sub2 + sub3 + sub4 + sub5;
        float markspercentage = (total_marks/ 500.0f)* 100;

        System.out.println("The Markspercentage of five subject is: " + markspercentage + "%");

     // close the scanner
        scanner.close();
    }
}
