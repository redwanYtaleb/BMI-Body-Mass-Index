package bmi.calculator;
import java.util.Scanner ;
import java.util.Locale;
public class BMICalculator {
    public static void main(String[] args) {
        System.out.print("Hello Welcome To The BMI Calculator \n\nPlease Enter Your Height: ");
        Scanner h = new Scanner (System.in);
        h.useLocale(Locale.US);
        double Height = h.nextDouble();
        System.out.print("\nPlease Enter Your Weight: ");
        double Weight = h.nextDouble();
        double BMI = ( Weight / (Height*Height));
        double truncatedBMI = Math.floor(BMI * 100) / 100.0;
        System.out.print("\nYour BMI is " + truncatedBMI);
        System.out.print(" , And Based On The Calculated BMI You Have ");
        if(BMI < 18.5){
            System.out.println("(Underweight)");
        }
        else if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("(Normal Weight)");
        }
        else if(BMI >= 25 && BMI <= 29.9){
           System.out.println("(Overweight)"); 
        }
        else
            System.out.println("(Obese)");
    }
}