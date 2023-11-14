import java.util.Scanner;

public class Passwordstrengthcheker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int length = password.length();
        boolean Uppercase = !password.equals(password.toLowerCase());
        boolean Lowercase = !password.equals(password.toUpperCase());
        boolean Digit = password.matches(".*\\d.*");
        boolean SpecialChar = !password.matches("[A-Za-z0-9 ]*");
        int strength = 0;
        if (length >= 8) {
            strength++;
        }
        if (Uppercase) {
            strength++;
        }
        if (Lowercase) {
            strength++;
        }
        if (Digit) {
            strength++;
        }
        if (SpecialChar) {
            strength++;
        }

        
        System.out.println("Password Strength: " + strength + "/5");
        if (strength == 5) {
            System.out.println("Strong password!");
        } else if (strength >= 3) {
            System.out.println("Moderate password.");
        } else {
            System.out.println("Weak one choose a stronger one.");
        }
    }
}

         