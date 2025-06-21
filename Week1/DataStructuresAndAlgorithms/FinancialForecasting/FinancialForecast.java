import java.util.*;
public class FinancialForecast{

    public static double forecast(double initial, double growthRate, int months) {
        if (months == 0) {
            return initial;
        }
        return forecast(initial, growthRate, months - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Initial value : ");
        double initial=sc.nextDouble();
        System.out.print("Enter the Growth rate : ");
        double growthRate=sc.nextDouble();  
        System.out.print("Enter the number of months : ");        
        int months=sc.nextInt();                   
        double futureValue = forecast(initial, growthRate, months);
        System.out.printf("Forecasted value after %d months: %.2f", months, futureValue);
    }
}
