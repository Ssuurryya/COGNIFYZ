import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        String originalString,reverseString="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        originalString=sc.nextLine();
        int length=originalString.length();
        for(int i=length-1;i>=0;i--)
        reverseString = reverseString+originalString.charAt(i);
        if(originalString.equals(reverseString)){
        System.out.println("The string is a palindrome");
        }else{
        System.out.println("The string is not a palindrome");
        }   
    }
}
