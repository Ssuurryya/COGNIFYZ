import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int numGrades = sc.nextInt();
        float total = 0.0f;

       
        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            float grade = sc.nextFloat();
            total += grade;
        }
        double average = total / numGrades;
        System.out.println("The average grade is: " + average);
    
}
}
