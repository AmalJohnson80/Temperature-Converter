import java.util.*;
public class CelsiustoFahrenheit
{
    public static void main(String[]args){
        if(args.length != 1){
            System.out.println("You must pass ONE argument as the Celsius value to be converted to Fahrenheit.");
        } else {
            int celsiusValue = Integer.parseInt(args[0]);
            int fahrenheitValue = celsiusValue * 9/5 + 32;
            System.out.printf("%d°C = %d°F", celsiusValue, fahrenheitValue);
        }
    }
}
