import java.util.Scanner;
import java.security.SecureRandom;
public class password{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("password generator");
        System.out.println("Enter the password length:");
        int length=sc.nextInt();
        sc.nextLine();
        System.out.println("Include numbers? (yes/no): ");
        boolean includeNumbers = sc.nextLine().equalsIgnoreCase("yes");
        System.out.println("Include lowercase? (yes/no): ");
        boolean includelowercase= sc.nextLine().equalsIgnoreCase("yes");
        System.out.println("Include uppercase? (yes/no): ");
        boolean includeuppercase = sc.nextLine().equalsIgnoreCase("yes");
        System.out.println("Include special character? (yes/no): ");
        boolean includespecialcharacter = sc.nextLine().equalsIgnoreCase("yes");
        String password = passwordgenerator(length, includeNumbers, includelowercase, includeuppercase, includespecialcharacter);
        System.out.println("Generated Password: " + password);
        }

        public static String passwordgenerator(int length, boolean includeNumbers,boolean includelowercase,boolean includeuppercase,boolean includespecialcharacter) {
            String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
            String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numberChars = "0123456789";
            String specialChars = "!@#$%^&*()-_+=<>?";
            StringBuilder validChars = new StringBuilder();
            if (includelowercase) {
                validChars.append(lowercaseChars);
            }
            if (includeuppercase) {
                validChars.append(uppercaseChars);
            }
            if (includeNumbers) {
                validChars.append(numberChars);
            }
            if (includespecialcharacter) {
                validChars.append(specialChars);
            }
    
            if (validChars.length() == 0) {
                System.out.println("You must select at least one character type.");
                return "";
            }
    
            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();
    
            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(validChars.length());
                password.append(validChars.charAt(randomIndex));
            }
    
            return password.toString();
        }
    }
    
            

