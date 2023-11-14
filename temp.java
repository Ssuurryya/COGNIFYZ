
import java.util.Scanner;
class temp{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a temp in Celcius");
        float Celcius=sc.nextFloat();
        float Farenheit;
        
        Farenheit=((Celcius*9)/5)+32;
        System.out.println("Temp in Farenheit is:"+Farenheit);
        
    }
    

}